package algorithm.leet_1_30;

import java.util.Arrays;

/**
 * Created by songheng on 10/6/16.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs != null && strs.length > 0) {

            Arrays.sort(strs);

            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length - 1].toCharArray();

            for (int i = 0; i < a.length; i++) {
                if (b.length > i && b[i] == a[i]) {
                    result.append(b[i]);
                } else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

    public String helper(String[] strs, int start, int end) {
        if (start == end) return strs[start];
        int mid = start + (end - start) / 2;
        String left = helper(strs, start, mid);
        String right = helper(strs, mid + 1, end);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < left.length() && i < right.length(); i++) {
            if (left.charAt(i) == right.charAt(i)) sb.append(left.charAt(i));
        }
        return sb.toString();
    }

}
