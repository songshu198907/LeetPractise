package algorithm.leet_370_end;

/**
 * Created by shu on 2016/9/26.
 */
public class First_Unique_Character_in_a_String_387 {
    public int firstUniqChar(String s) {
        if (s.isEmpty()) return -1;
        int[] pos = new int[26];
        int[] times = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (times[s.charAt(i) - 'a'] == 0) {
                pos[s.charAt(i) - 'a'] = i;
            }
            times[s.charAt(i) - 'a']++;
        }
        int min = -1;
        for (int i = 0; i < 26; i++) {
            if (times[i] == 1 && (pos[i] < min || min < 0)) {
                min = pos[i];
            }
        }
        return min;
    }
}
