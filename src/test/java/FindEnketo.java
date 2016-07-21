import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 7/17/2016.
 */
public class FindEnketo {
    private static int cnt = 0;
    private static List<String> names;

    public static void main(String[] args) {
        names = new ArrayList<>();
        File file = new File("D:\\formhub");
        Long start = System.currentTimeMillis();
        findEnketo(file);
        Long end = System.currentTimeMillis();
        System.out.println("Duraitaion : " + (end - start) + " file numbers : " + cnt);
        names.stream().forEach(System.out::println);
    }

    private static void findEnketo(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                findEnketo(f);
            }
        } else {
            cnt++;
            try {
                String content = FileUtils.readFileToString(file);
                if (content.toLowerCase().contains("enketo")) {
                    names.add(file.getAbsolutePath());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
