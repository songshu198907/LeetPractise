package algorithm.leet_181_320;

/**
 * Created by shu on 6/20/2016.
 */
public class Sliding_Window_Maximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || nums == null) return null;
        int[] res = new int[nums.length - k + 1];
        int pos = 0;
        int val = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            if (pos == 0) {
                pos = getMax(nums, i, i + k - 1);
                val = nums[pos];
                pos = pos - i;
            } else {
                if (nums[i + k - 1] >= val) {
                    val = nums[i + k - 1];
                    pos = k - 1;
                } else {
                    pos--;
                }
            }
            res[i] = val;
        }
        return res;
    }

    private int getMax(int[] arr, int from, int end) {
        int k = from;
        for (int i = from; i <= end; i++) {
            if (arr[i] >= arr[k]) {
                k = i;
            }
        }
        return k;
    }

}
