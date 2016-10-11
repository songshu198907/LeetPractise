package algorithm.second_round.leet_1_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by songheng on 10/6/16.
 */
public class TSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3) return lists;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        if (nums[0] * nums[nums.length - 1] > 0) return lists;
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            set.clear();
            if (nums[i] == pre) continue;
            pre = nums[i];
            int rem = 0 - pre;
            if (rem < 0) break;
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(nums[j])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(rem - nums[j]);
                    list.add(nums[j]);
                    if (!lists.contains(list)) {
                        lists.add(list);
                    }
                } else {
                    set.add(rem - nums[j]);
                }
            }
        }
        return lists;
    }
}
