package algorithm.leet_370_end;

/**
 * Created by songheng on 8/26/16.
 */
public class Wiggle_Subsequence_376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int start = 1;
        int min = 0X7FFFFFFF, max = 1;
        int pos = 1;
        while (pos < nums.length && nums[pos] == nums[pos - 1]) {
            pos++;
        }
        boolean bigger = nums[pos] > nums[pos - 1];
        if ()
            for (int i = pos; i < nums.length; i++) {
                if (bigger) {
                    if (nums[i] < max) {
                        start++;
                        min = nums[i];
                        bigger = !bigger;
                    } else if (nums[i] > max) {
                        max = nums[i];
                    }
                } else {
                    if (nums[i] > min) {
                        start++;
                        max = nums[i];
                        bigger = !bigger;
                    } else if (nums[i] < min) {
                        min = nums[i];
                    }
                }
            }
        return start;

    }


}
