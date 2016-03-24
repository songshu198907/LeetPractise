package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class SearchinRotatedSortedArray_33 {
    public int search(int[] nums, int target) {
        return erfen(nums, target, 0, nums.length - 1);


    }

    private int erfen(int[] nums, int target, int left, int right) {
        int max = -1;
        if (left < right) {
            int center = (left + right) / 2;
            int leftR = erfen(nums, target, left, center);
            int rightR = erfen(nums, target, center + 1, right);
            max = Math.max(leftR, rightR);
        } else {
            if (nums[left] == target) {
                max = left;
            }


        }
        return max;
    }

}
