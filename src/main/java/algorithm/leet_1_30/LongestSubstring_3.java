package algorithm.leet_1_30;

/**
 * Created by shu on 2016/10/3.
 */
public class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        int start = 0, end = 0;
        char[] used = new char[256];
        char[] arr = s.toCharArray();
        while (end < s.length()) {
            char ch = arr[end];
            if (used[ch] == 0) used[ch]++;
            else {
                max = Math.max(max, end - start);
                while (start < end && arr[start] != ch) {
                    used[arr[start++]]--;
                }
                start++;

            }
            end++;
        }

        return Math.max(max, end - start);
    }
}
