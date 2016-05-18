package algorithm.leet_166_180;

/**
 * Created by songheng on 5/18/16.
 */
public class Excel_Sheet_Column_Title_168 {
    public String convertToTitle(int n) {
        String res = "";
        while (n > 0) {
            int r = n % 26;
            n = n / 26;
            if (r == 0) {
                res += "Z";
                n--;
            } else {
                res += (char) ('A' + r - 1);
            }
        }

        String result = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            result += (char) res.charAt(i);
        }
        return result;

    }
}
