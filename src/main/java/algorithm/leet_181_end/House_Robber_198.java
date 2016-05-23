package algorithm.leet_181_end;

/**
 * Created by songheng on 5/20/16.
 */
public class House_Robber_198 {
    public int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 3) {
            return findInt(nums);
        }
        int[] value = new int[nums.length + 1];
        value[0] = nums[0];
        value[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            value[i] = Math.max(value[i - 1], value[i - 2] + nums[i]);
        }
        return value[nums.length - 1];

    }

    private int findInt(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
