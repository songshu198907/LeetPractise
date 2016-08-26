package algorithm.leet_370_end;

/**
 * Created by songheng on 8/26/16.
 */
public class Combination_Sum_IV_377 {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        solve(nums, dp, target);
        return dp[target];
    }

    private int solve(int[] nums, int[] dp, int num) {
        if (num == 0) {
            return 1;
        }
        for (int i : nums) {
            if (i <= num) {
                dp[num] += solve(nums, dp, num - i);
            }
        }
        return dp[num];
    }


}
