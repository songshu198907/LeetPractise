package algorithm.leet_181_320;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by songheng on 7/12/16.
 */
public class Word_Pattern_II_291 {
    public boolean wordPatternMatch(String pattern, String str) {
        HashSet<String> set = new HashSet<>();
        if (pattern.length() > str.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        return check(pattern, 0, str, 0, set, map);

    }

    private boolean check(String pat, int i, String str, int j, HashSet<String> set, HashMap<Character, String> map) {
        if (i == pat.length() && j == str.length()) return true;
        if (i == pat.length() || j == str.length()) return false;
        if (map.containsKey(pat.charAt(i))) {
            String exp = map.get(pat.charAt(i));
            int len = exp.length();
            if ((str.length() - j < len) || !str.substring(j, j + len).equalsIgnoreCase(exp)) return false;
            else return check(pat, i + 1, str, j + len, set, map);
        } else {
            for (int pos = j + 1; pos <= str.length(); pos++) {
                String nStr = str.substring(j, pos);
                if (set.contains(nStr)) continue;
                set.add(nStr);
                map.put(pat.charAt(i), nStr);
                if (check(pat, i + 1, str, pos, set, map)) return true;
                set.remove(nStr);
                map.remove(pat.charAt(i));
            }
            return false;
        }
    }
}
