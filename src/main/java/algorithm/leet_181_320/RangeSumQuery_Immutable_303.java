package algorithm.leet_181_320;

/**
 * Created by songheng on 9/19/16.
 */
public class RangeSumQuery_Immutable_303 {
    class NumArray {
        private int[] sums;

        public NumArray(int[] nums) {
            int len = nums.length;
            sums = new int[len + 1];
            sums[0] = 0;
            for (int i = 0; i < len; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }
    }

}
