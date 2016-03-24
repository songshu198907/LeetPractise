package algorithm.leet_31_45;

/**
 * Created by songheng on 3/24/16.
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int after = 0;

        while (after < nums.length && nums[after] < target) {
            after++;
        }
        return after;
    }
}
