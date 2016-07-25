package algorithm.leet_181_320;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 5/27/16.
 */
public class Contains_Duplicate_II_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val) && i - map.get(val) <= k) {
                return true;
            } else
                map.put(val, i);
        }
        return false;
    }
}
