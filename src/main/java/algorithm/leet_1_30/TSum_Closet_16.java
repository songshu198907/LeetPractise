package algorithm.leet_1_30;

import java.util.Arrays;

/**
 * Created by songheng on 10/7/16.
 */
public class TSum_Closet_16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        long closet = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    if (Math.abs(sum - target) < Math.abs(closet - target)) closet = sum;
                    while (end - 1 >= start && nums[end] == nums[end - 1]) end--;
                    end--;
                } else {
                    if (Math.abs(sum - target) < Math.abs(closet - target)) closet = sum;
                    while (start + 1 <= end && nums[start] == nums[start + 1]) start++;
                    start++;
                }
            }
        }

        return (int) closet;
    }
}
