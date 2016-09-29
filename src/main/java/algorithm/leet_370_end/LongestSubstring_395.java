package algorithm.leet_370_end;

/**
 * Created by shu on 2016/9/28.
 */
public class LongestSubstring_395 {
    public int longestSubstring(String s, int k) {
        int[] arr = new int[26];
        int single = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            arr[chs[i] - 'a']++;
            if (arr[chs[i] - 'a'] == 1) single++;
            if (arr[chs[i] - 'a'] == k) single--;
        }
        return subString(chs, 0, chs.length - 1, arr, single, k);

    }

    private int subString(char[] chars, int start, int end, int[] arr, int single, int k) {

        int res;
        int iS = start, ip = end;
        while (start <= end && arr[chars[start] - 'a'] < k) {
            if (--arr[chars[start] - 'a'] == 0) single--;
            start++;
        }
        while (start <= end && arr[chars[end] - 'a'] < k) {
            if (--arr[chars[end] - 'a'] == 0) single--;
            end--;
        }
        if (single == 0) {
            return end - start + 1;
        }
        if (start > end) return 0;
        int tmp = single;
        if (single == 0) return end - start + 1;
        arr[chars[start] - 'a']--;
        if (arr[chars[start] - 'a'] < k) single++;
        res = Math.max(0, subString(chars, start + 1, end, arr, single, k));
        arr[chars[start] - 'a']++;
        arr[chars[end] - 'a']--;
        if (arr[chars[end] - 'a'] < k) tmp--;
        res = Math.max(res, subString(chars, start, end - 1, arr, tmp, k));
        for (int i = iS; i < start; i++) {
            arr[chars[i] - 'a']++;
        }
        for (int i = end; i < ip; i++) {
            arr[chars[i] - 'a']++;
        }
        return res;
    }
}
