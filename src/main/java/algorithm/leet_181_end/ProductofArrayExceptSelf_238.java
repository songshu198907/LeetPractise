package algorithm.leet_181_end;

/**
 * Created by songheng on 6/27/16.
 */
public class ProductofArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, p;
        int[] arr = new int[nums.length];

        arr[0] = p = 1;
        for (int i = 1; i < len; i++) {
            p = p * nums[i - 1];
            arr[i] = p;
        }

        p = 1;
        for (int i = len - 2; i >= 0; i--) {
            p = p * nums[i + 1];
            arr[i] *= p;
        }

        return arr;
    }
}
