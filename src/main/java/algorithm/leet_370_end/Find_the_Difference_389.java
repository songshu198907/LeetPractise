package algorithm.leet_370_end;

/**
 * Created by shu on 2016/9/27.
 */
public class Find_the_Difference_389 {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (arr[t.charAt(i) - 'a']-- == 0) return t.charAt(i);
        }

        return ' ';
    }
}
