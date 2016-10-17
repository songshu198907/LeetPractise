package datastructure;

/**
 * Created by songheng on 10/17/16.
 */
public class NumArr {
    private int[] tree;
    private int[] nums;

    public NumArr(int[] nums) {
        this.nums = nums;
        int lowBit;
        int sum = 0;
        tree = new int[nums.length + 1];
        for (int i = 1; i < tree.length; i++) {
            sum = 0;
            lowBit = i & (-i);
            for (int j = i; j < tree.length; j++) {
                sum = sum + nums[j - 1];
            }
            tree[i] = sum;
        }

    }

    public void update(int i, int val) {
        int tem = val - nums[i];
        nums[i] = val;
        i++;
        for (; i < tree.length; i += i & (-i)) {
            tree[i] += tem;
        }
    }

    public int sumRange(int i, int j) {
        return getSum(j) - getSum(i);
    }

    public int getSum(int i) {
        int sum = 0;
        i++;
        while (i > 0) {
            sum += tree[i];
            i -= i & (-i);
        }
        return sum;
    }

}
