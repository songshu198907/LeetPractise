package algorithm.leet_370_end;

/**
 * Created by shu on 2016/9/28.
 */
public class LongestSubstring_395 {
    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        return help2(str, 0, s.length(), k);
    }

    private int help2(char[] str, int start, int end, int k) {
        if (start > end) return 0;
        if (end - start < k) return 0;
        int[] alphas = new int[26];
        for (int i = start; i < end; i++) {
            int idx = str[i] - 'a';
            alphas[idx]++;
        }
        for (int i = 0; i < 26; i++) {
            if (alphas[i] == 0) continue;
            if (alphas[i] < k) {
                for (int j = start; j < end; j++) {
                    if (str[j] == i + 'a') {
                        int left = help2(str, start, j, k);
                        int right = help2(str, j + 1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start;
    }

    private int helper(char[] str, int start, int end, int k) {
        if (end < start) return 0;
        if (end - start < k) return 0;//substring length shorter than k.
        int[] count = new int[26];
        for (int i = start; i < end; i++) {
            int idx = str[i] - 'a';
            count[idx]++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) continue;//i+'a' does not exist in the string, skip it.
            if (count[i] < k) {
                for (int j = start; j < end; j++) {
                    if (str[j] == i + 'a') {
                        int left = helper(str, start, j, k);
                        int right = helper(str, j + 1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start;
    }


}
