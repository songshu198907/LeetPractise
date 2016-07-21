package algorithm.leet_181_end;

/**
 * Created by shu on 7/15/2016.
 */
public class Range_Sum_Query_Mutable_307 {
    class NumArray {
        int[] bit;
        int[] num;

        public NumArray(int[] nums) {
            bit = new int[nums.length + 1];
            num = new int[nums.length + 1];
            for (int i = 0; i < nums.length; ++i) {
                update(i, nums[i]);
            }
        }

        void update(int i, int val) {
            int diff = val - num[i + 1];
            for (int j = i + 1; j < num.length; j += (j & (-j))) {
                bit[j] += diff;
            }
            num[i + 1] = val;
        }

        public int sumRange(int i, int j) {
            return getSum(j + 1) - getSum(i);

        }

        private int getSum(int i) {
            int res = 0;
            for (int j = i; j > 0; j -= (j & -j)) {
                res += bit[j];
            }
            return res;
        }
    }

}
