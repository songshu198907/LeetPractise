package algorithm.leet_321_350;

/**
 * Created by songheng on 7/26/16.
 */
public class Patching_Array_330 {
    public int minPatches(int[] nums, int n) {
        int cnt = 0, i = 0;
        for (long known_sum = 1; known_sum <= n; ) {
            if (i < nums.length && known_sum >= nums[i]) {
                known_sum += nums[i++];
            } else {
                known_sum <<= 1;
                cnt++;
            }
        }
        return cnt;
    }

    public int minPatchers2(int[] nums, int n) {
        int res = 0, i = 0;
        for (long know_sum = 1; know_sum <= n; ) {
            if (i < nums.length && know_sum > nums[i]) {
                know_sum += nums[i++];
            } else {
                know_sum <<= 1;
                res++;
            }

        }
        return res;
    }
}
