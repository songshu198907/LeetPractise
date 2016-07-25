package algorithm.leet_321_350;

import java.util.HashMap;

/**
 * Created by songheng on 7/25/16.
 */
public class Maximum_Size_Subarray_Sum_Equals_k_325 {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
