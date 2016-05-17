package algorithm.leet_151_165;

/**
 * Created by songheng on 5/17/16.
 */
public class Find_Peak_Element_162 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0)
            return 0;
        int res = 0;
        boolean raise = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (raise) {
                    return i;

                } else {
                    raise = false;
                }
            } else {
                raise = true;
            }
        }
        if (raise) {
            return nums.length - 1;
        }
        return res;
    }
}
