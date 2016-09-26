package algorithm.leet_370_end;

/**
 * Created by songheng on 8/26/16.
 */
public class Combination_Sum_IV_377 {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        for (int num : nums) {
            if (num <= target) {
                dp[num] = 1;
            }
        }
        for (int i = 1; i <= target; i++) {
            if (dp[i] != 0) {
                for (int num : nums) {
                    if (i + num <= target)
                        dp[i + num] += dp[i];
                }
            }
        }
        return dp[target];
    }


}
