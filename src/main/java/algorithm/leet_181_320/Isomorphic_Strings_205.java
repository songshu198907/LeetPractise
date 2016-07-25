package algorithm.leet_181_320;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 5/23/16.
 */
public class Isomorphic_Strings_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.containsKey(key)) {
                if (map.get(key) == value) {
                    continue;
                } else return false;
            } else {
                if (map.values().contains(value)) return false;
                map.put(key, value);
            }
        }

        return true;
    }
}
