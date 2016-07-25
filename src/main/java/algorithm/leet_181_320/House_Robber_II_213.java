package algorithm.leet_181_320;

/**
 * Created by songheng on 5/26/16.
 */
public class House_Robber_II_213 {
    public int rob(int[] nums) {
        int max = 0;
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] val = new int[nums.length];
        val[0] = nums[0];
        val[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            val[i] = Math.max(val[i - 2] + nums[i], val[i - 1]);
        }
        max = Math.max(max, val[nums.length - 2]);
        val[0] = 0;
        val[1] = nums[2];
        for (int i = 2; i < nums.length; i++)
            val[i] = Math.max(val[i - 2] + nums[i], val[i - 1]);
        max = Math.max(max, val[nums.length - 1]);
        return max;
    }
}
