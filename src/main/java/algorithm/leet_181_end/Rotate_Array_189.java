package algorithm.leet_181_end;

/**
 * Created by songheng on 5/20/16.
 */
public class Rotate_Array_189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] a = new int[len];
        int cur = 0;
        for (int i = len - k; i < len; i++) {
            a[cur++] = nums[i];
        }
        for (int i = 0; i < len - k; i++) {
            a[cur++] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = a[i];
        }

    }
}
