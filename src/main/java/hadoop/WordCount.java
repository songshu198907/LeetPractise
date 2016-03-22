package hadoop;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * Created by songheng on 3/4/16.
 */
public class WordCount {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        JobConf conf = new JobConf(WordCount.class);
        conf.setJobName("wordcount");
        conf.setOutputKeyClass(Text.class);
        conf.setOutputValueClass(IntWritable.class);
        conf.setMapperClass(Map.class);
        conf.setCombinerClass(Reduce.class);
        conf.setReducerClass(Reduce.class);
        conf.setInputFormat(TextInputFormat.class);
        conf.setOutputFormat(TextOutputFormat.class);
        FileInputFormat.setInputPaths(conf, new Path(args[0]));
        FileOutputFormat.setOutputPath(conf, new Path(args[1]));
        JobClient.runJob(conf);
    }

    public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();

        public void map(LongWritable longWritable, Text text, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {

            String line = text.toString();
            StringTokenizer tokenizer = new StringTokenizer(line);
            System.out.println("line is ：" + line);
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                word.set(token);
                System.out.println("key : "+word.toString() +"===>"+"value:"+one.toString());
                outputCollector.collect(word, one);
            }
        }
    }

    public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {

        public void reduce(Text text, Iterator<IntWritable> iterator, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {

            int sum = 0;

            while (iterator.hasNext()) {
                int cnt =iterator.next().get();
                sum += cnt;

                System.out.println("Key is :" + text.toString()+" === > sum is :" +sum+"====>cnt:"+cnt);
            }
            outputCollector.collect(text, new IntWritable(sum));
        }
    }
}
