package spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by songheng on 3/7/16.
 */
public class SimpleApp {
    public static void main(String[] args) {
        String logFile = "/opt/spark-1.6/README.md";
        SparkConf conf = new SparkConf().setAppName("Simple App").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String>logData = sc.textFile(logFile).cache();
        long numberAs = logData.filter(element->
             element.contains("a")
        ).count();

        long numberBs = logData.filter(element->element.contains("b")).count();
        System.out.println("Lines with a: " + numberAs + ", lines with b: " + numberBs);
    }
}
