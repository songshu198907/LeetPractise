package algorithm.leet_166_180;

/**
 * Created by songheng on 5/18/16.
 */
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 26 + s.charAt(i) - 'A' + 1;
        }
        return res;
    }
}
