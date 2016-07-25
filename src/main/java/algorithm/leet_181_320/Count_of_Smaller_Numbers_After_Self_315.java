package algorithm.leet_181_320;

import java.util.Arrays;
import java.util.List;

/**
 * Created by songheng on 7/22/16.
 */
public class Count_of_Smaller_Numbers_After_Self_315 {
    private int lowbit(int x) {
        return x & (-x);
    }

    private void add(int[] bit, int i, int val) {
        for (; i < bit.length; i += lowbit(i)) bit[i] += val;
    }

    private int query(int[] bit, int i) {
        int ans = 0;
        for (; i > 0; i -= lowbit(i)) ans += bit[i];
        return ans;
    }

    public List<Integer> countSmaller(int[] nums) {
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < nums.length; i++) {
            int val = Arrays.binarySearch(tmp, nums[i]);
            nums[i] = val;
        }

        int[] bit = new int[nums.length];
        Integer[] ans = new Integer[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = query(bit, nums[i]);
            add(bit, nums[i] + 1, 1);
        }
        return Arrays.asList(ans);
    }
}
