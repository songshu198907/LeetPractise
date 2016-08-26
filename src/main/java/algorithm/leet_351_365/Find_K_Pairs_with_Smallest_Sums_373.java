package algorithm.leet_351_365;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 8/26/16.
 */
public class Find_K_Pairs_with_Smallest_Sums_373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();
        if (nums1 == null || nums2 == null || nums1.length < 1 || nums2.length < 1) return result;
        int size = Math.min(k, nums1.length * nums2.length);
        int idx[] = new int[nums1.length];
        for (int i = 0; i < size; i++) {
            int t = 0, sum = Integer.MAX_VALUE;
            for (int j = 0; j < nums1.length; j++) {
                if (idx[j] < nums2.length && sum >= nums1[j] + nums2[idx[j]]) {
                    t = j;
                    sum = nums1[j] + nums2[idx[j]];
                }
            }
            result.add(new int[]{nums1[t], nums2[idx[t]]});
            ++idx[t];
        }

        return result;
    }

}
