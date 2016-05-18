package algorithm.leet_166_180;

/**
 * Created by songheng on 5/18/16.
 */
public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        int result = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count = 1;
            } else if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
