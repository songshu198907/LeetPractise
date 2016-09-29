package algorithm.leet_1_30;

/**
 * Created by songheng on 9/29/16.
 */
public class Median_of_Two_Sorted_Arrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if ((m + n) % 2 == 0) {
            return (helper(nums1, 0, n - 1, nums2, 0, m - 1, (m + n) / 2) + helper(nums1, 0, n - 1, nums2, 0, m - 1, (m + n) / 2 + 1)) / 2;
        }
        return helper(nums1, 0, n - 1, nums2, 0, m - 1, (m + n) / 2 + 1);

    }

    private int helper(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        if (end1 < start1) return nums2[start2 + k - 1];
        if (end2 < start2) return nums1[start1 + k - 1];
        if (k <= 1) return Math.min(nums1[start1], nums2[start2]);
        int mid1 = (start1 + end1) / 2;
        int mid2 = (start2 + end2) / 2;
        if (nums1[mid1] > nums2[mid2]) {
            if (mid1 - start1 + 1 + mid2 - start2 + 1 >= k) {
                return helper(nums1, start1, mid1, nums2, start2, end2, k);
            } else {
                return helper(nums1, start1, end1, nums2, mid2, end2, k - (mid2 - start2) - 1);
            }
        } else {
            if (mid1 - start1 + 1 + mid2 - start2 + 1 >= k) {
                return helper(nums1, start1, end1, nums2, start2, mid2, k);
            } else {
                return helper(nums1, mid1, end1, nums2, start2, end2, k - (mid1 - start1) - 1);
            }
        }
    }
}
