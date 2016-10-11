package algorithm.second_round.leet_31_60;

import java.util.Arrays;

/**
 * Created by songheng on 10/11/16.
 */
public class NextPermutation_31 {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int len = nums.length;
        int pos = len - 1;
        while (pos >= 1) {
            if (nums[pos] > nums[pos - 1]) {
                break;
            }
            pos--;
        }
        if (pos == 0) Arrays.sort(nums);
        else {
            int target = nums[pos - 1];
            int sec = len - 1;
            while (nums[sec] <= target) sec--;
            nums[pos - 1] = nums[sec];
            while (sec < len - 1) {
                if (nums[sec + 1] <= target) break;
                nums[sec] = nums[sec + 1];
            }
            nums[sec] = target;
            int start = pos, end = len - 1;
            while (start < end) {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
                end--;
            }
        }
    }


}
