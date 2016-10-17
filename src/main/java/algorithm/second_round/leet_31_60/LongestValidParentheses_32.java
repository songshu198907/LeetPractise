package algorithm.second_round.leet_31_60;

/**
 * Created by songheng on 10/11/16.
 */
public class LongestValidParentheses_32 {
    public int longestValidParentheses(String s) {
        int max = 1;
        if (s == null || s.length() < 2) return 0;
        int[] dp = new int[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == ')') {
                if (chars[i - dp[i - 1] - 1] == '(') {
                    dp[i] += dp[i - 1] + 2;
                    if (i - dp[i - 1] - 2 >= 0) {
                        dp[i] += dp[i - dp[i - 1] - 2];
                    }
                    max = Math.max(dp[i], max);
                }

            }
        }


        return max;
    }
}
