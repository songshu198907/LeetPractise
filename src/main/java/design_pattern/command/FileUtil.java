package design_pattern.command;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Created by songheng on 9/12/16.
 */
public class FileUtil {
    public static void writeCommands(List<Command> commandList) {
        try {
            FileOutputStream fos = new FileOutputStream("config.log");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(commandList);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List readCommands() {
        try {
            FileInputStream fin = new FileInputStream("config.log");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Object obj = oin.readObject();
            oin.close();
            fin.close();
            return (List) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
