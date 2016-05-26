package algorithm.leet_151_165;

/**
 * Created by shu on 5/16/2016.
 */
public class Reverse_Words_in_a_String_151 {
    public String reverseWords(String s) {
        String res = "";
        int begin = 0;
        for (int i = s.length() - 1; i > 0; i--) {

            while (i > 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            int end = i;
            while (i > 0 && s.charAt(i) != ' ' ) i--;
            res += s.substring(i, end + 1);

        }

        return res.trim();
    }
    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.split("(\\s)+");

        for (int i = tmp.length - 1; i >= 0; i--) {
            sb.append(tmp[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
