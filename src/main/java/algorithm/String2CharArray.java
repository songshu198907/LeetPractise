package algorithm;

/**
 * Created by songheng on 5/23/16.
 */
public class String2CharArray {
    public static char[][] convert(String[] strings) {
        char[][] chars = new char[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].toCharArray();
        }
        return chars;
    }
}
