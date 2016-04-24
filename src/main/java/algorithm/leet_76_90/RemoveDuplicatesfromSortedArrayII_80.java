package algorithm.leet_76_90;

/**
 * Created by shu on 4/23/2016.
 */
public class RemoveDuplicatesfromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int duplicated = 0;
        int len = 1;

        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
                if (counter <= 2) {
                    nums[i - duplicated] = nums[i];
                    len++;
                } else {
                    duplicated++;
                }
            } else {
                nums[i - duplicated] = nums[i];
                counter = 1;
                len++;
            }

        }
        return len;
    }
}
