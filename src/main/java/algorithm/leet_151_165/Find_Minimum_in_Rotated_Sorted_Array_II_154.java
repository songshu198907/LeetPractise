package algorithm.leet_151_165;

/**
 * Created by songheng on 5/17/16.
 */
public class Find_Minimum_in_Rotated_Sorted_Array_II_154 {
    public int findMin(int[] nums) {
        if (nums.length == 0)
            return 0;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.min(res, nums[i]);
        }
        return res;
    }

}
