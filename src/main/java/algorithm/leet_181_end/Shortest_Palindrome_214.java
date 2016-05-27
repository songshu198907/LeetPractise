package algorithm.leet_181_end;

/**
 * Created by songheng on 5/26/16.
 */
public class Shortest_Palindrome_214 {
    public String shortestPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1)
            return s;
        String res = "";
        int left = -1, right = -1;
        for (int mid = s.length() / 2; mid >= 0; mid--) {
            if (isPalindrome(s, mid - 1, mid + 1)) {
                left = mid - 1;
                right = mid + 1;
                break;
            }
            if (isPalindrome(s, mid - 1, mid)) {
                left = mid - 1;
                right = mid;
                break;
            }

        }
        while (left >= 0) {
            left--;
            right++;
        }
        int len = s.length();

        while (right < len) {
            res = s.charAt(right) + res;
            right++;
        }
        res += s;

        return res;
    }

    private boolean isPalindrome(String s, int left, int right) {
        boolean res = true;
        if (right >= s.length()) {
            return false;
        }
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left--) != s.charAt(right++)) {
                return false;
            }
        }

        return res;
    }


    public String shortestPalindrome2(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().substring(0, s.length() - getCommonLength(s)) + s;
    }

    private int getCommonLength(String str) {
        StringBuilder builder = new StringBuilder(str);
        String rev = new StringBuilder(str).reverse().toString();
        builder.append("#").append(rev);
        int[] p = new int[builder.length()];
        for (int i = 1; i < p.length; i++) {
            int j = p[i - 1];
            while (j > 0 && builder.charAt(i) != builder.charAt(j)) j = p[j - 1];
            p[i] = j == 0 ? (builder.charAt(i) == builder.charAt(0) ? 1 : 0) : j + 1;
        }
        return p[p.length - 1];
    }

}
