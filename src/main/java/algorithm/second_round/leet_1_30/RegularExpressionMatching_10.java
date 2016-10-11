package algorithm.second_round.leet_1_30;

/**
 * Created by songheng on 10/6/16.
 */
public class RegularExpressionMatching_10 {
    public boolean isMatch(String s, String p) {
        boolean[] match = new boolean[s.length() + 1];
        match[s.length()] = true;
        char[] pchars = p.toCharArray();
        char[] schars = s.toCharArray();
        for (int i = p.length() - 1; i >= 0; i--) {
            if (pchars[i] == '*') {
                for (int j = s.length() - 1; j >= 0; j--) {
                    match[j] = match[j] || match[j + 1] && (pchars[i - 1] == schars[j] || pchars[i - 1] == '.');
                }
                i--;
            } else {
                for (int j = 0; j < s.length(); j++) {
                    match[j] = match[j + 1] && (pchars[i] == schars[j] || pchars[i] == '.');
                }
            }
            match[s.length()] = false;

        }

        return match[0];
    }
}
