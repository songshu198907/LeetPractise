package algorithm.leet_136_150;

/**
 * Created by songheng on 5/13/16.
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int left = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left = left ^ nums[i];
        }
        return left;
    }
}
