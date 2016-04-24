package algorithm.leet_76_90;

/**
 * Created by shu on 4/23/2016.
 */
public class SearchinRotatedSortedArrayII_81 {
    public boolean search(int[] nums, int target) {
        for (int val : nums) {
            if (val == target) {
                return true;
            }

        }
        return false;
    }
}
