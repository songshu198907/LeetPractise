package algorithm.leet_181_end;

import java.util.HashMap;

/**
 * Created by songheng on 7/12/16.
 */
public class Word_Pattern_290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("\\s+");
        if (words.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                if (i > 0 && words[i].equals(words[i - 1])) return false;
                map.put(ch, words[i]);
            } else {
                if (!words[i].equals(map.get(ch))) return false;
            }
        }
        return true;
    }
}
