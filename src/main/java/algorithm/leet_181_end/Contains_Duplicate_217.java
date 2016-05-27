package algorithm.leet_181_end;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by songheng on 5/27/16.
 */
public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        int[] pos = new int[2000000];
        int[] neg = new int[2000000];
        if (nums.length == 0) return false;
        boolean zeors = false;
        for (int num : nums) {
            if (num > 0) {
                if (pos[num - 1] > 0) {
                    return true;
                } else
                    pos[num - 1]++;
            } else if (num == 0) {
                if (zeors) return true;
                else zeors = true;
            } else {
                if (neg[-1 - num] > 0)
                    return true;
                else neg[-1 - num]++;

            }
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> hm = new HashSet<Integer>();
        if (nums.length == 0) {
            return false;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!hm.contains(nums[i])) {
                hm.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
