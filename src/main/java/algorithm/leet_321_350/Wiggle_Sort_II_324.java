package algorithm.leet_321_350;

/**
 * Created by songheng on 7/25/16.
 */
public class Wiggle_Sort_II_324 {
    public void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                if (nums[i] > nums[i - 1] && (i + 1 == nums.length || nums[i] > nums[i + 1]))
                    continue;
                else {
                    int tmp = nums[i];
                    if (nums[i] < nums[i - 1]) {
                        nums[i] = nums[i - 1];
                        nums[i - 1] = tmp;
                    }
                    if (i + 1 == nums.length || nums[i] > nums[i + 1]) continue;

                    int t = i + 1;
                    for (; t < nums.length; t++) {
                        if (nums[i] < nums[t]) break;
                    }
                    if (t < nums.length) {
                        tmp = nums[i];
                        nums[i] = nums[t];
                        nums[t] = tmp;
                    }

                }
            }
        }
    }
}
