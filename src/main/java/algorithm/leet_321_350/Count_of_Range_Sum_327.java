package algorithm.leet_321_350;

import java.util.HashMap;

/**
 * Created by songheng on 7/25/16.
 */
public class Count_of_Range_Sum_327 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long sum = 0;
        int cnt = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            for (int j = lower; j <= upper; j++) {
                if (map.containsKey(sum - j)) {
                    cnt += map.get(sum - j);
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else map.put(sum, map.get(sum) + 1);
        }
        return cnt;
    }


}
