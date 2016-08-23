package algorithm.leet_321_350;

/**
 * Created by shu on 2016/8/17.
 */
public class Increasing_Triplet_Subsequence_334 {
    public boolean increasingTriplet(int[] nums) {
        int smaller, bigger = Integer.MIN_VALUE, other = Integer.MIN_VALUE;
        if (nums == null || nums.length < 3) return false;
        smaller = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > smaller) {
                if (bigger == Integer.MIN_VALUE) {
                    bigger = nums[i];
                } else if (nums[i] > bigger) {
                    return true;
                } else {
                    bigger = nums[i];
                }
            } else if (nums[i] < smaller) {
                if (bigger == Integer.MIN_VALUE) smaller = nums[i];
                else if (other == Integer.MIN_VALUE) other = nums[i];
                else if (nums[i] == other) continue;
                else if (nums[i] > other) {
                    smaller = other;
                    bigger = nums[i];
                    other = Integer.MIN_VALUE;
                } else {
                    other = nums[i];
                }
            }
        }
        return false;
    }
}
