package algorithm.leet_370_end;

/**
 * Created by songheng on 8/26/16.
 */
public class Guess_Number_Higher_or_Lower_II_375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return solve(dp, 1, n);
    }

    private int solve(int[][] dp, int left, int right) {
        if (left >= right) return 0;
        if (dp[left][right] != 0) return dp[left][right];
        int best = 0X7FFFFFFF;
        for (int i = left; i <= right; i++) {
            best = Math.min(best, i + Math.max(solve(dp, left, i - 1), solve(dp, i + 1, right)));
        }
        dp[left][right] = best;
        return best;
    }
}
