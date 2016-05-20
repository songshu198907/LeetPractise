package algorithm.leet_181_end;

/**
 * Created by songheng on 5/20/16.
 */
public class House_Robber_198 {
    public int rob(int[] nums) {
        int[] values = new int[nums.length];
        int max = 0;
        if (nums.length == 0) {
            return 0;
        }
        values[0] = nums[0];
        values[1] = nums[1];
        values[2] = nums[2] + nums[0];

    }
}
