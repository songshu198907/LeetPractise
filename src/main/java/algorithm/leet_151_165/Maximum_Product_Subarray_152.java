package algorithm.leet_151_165;

/**
 * Created by songheng on 5/17/16.
 */
public class Maximum_Product_Subarray_152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;
        int max, min;
        int ret = max = min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmp = max;
            max = Math.max(nums[i], Math.max(min * nums[i], max * nums[i]));
            min = Math.min(nums[i], Math.min(min * nums[i], tmp * nums[i]));
            ret = Math.max(ret, max);

        }
        return ret;
    }


}
