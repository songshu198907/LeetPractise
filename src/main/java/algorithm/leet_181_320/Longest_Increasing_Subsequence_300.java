package algorithm.leet_181_320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 7/13/16.
 */
public class Longest_Increasing_Subsequence_300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i : nums) {
            if (i < list.get(0)) list.set(0, i);
            else if (i > list.get(list.size() - 1)) list.add(i);
            else {
                int left = 0, right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) < i) left = mid + 1;
                    else right = mid;
                }
                list.set(right, i);
            }
        }
        return list.size();
    }


    public int longestIncreasingSubsequence2(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        // len表示当前最长的升序序列长度（为了方便操作tails我们减1）
        int len = 0;
        // tails[i]表示长度为i的升序序列其末尾的数字
        int[] tails = new int[nums.length];
        tails[0] = nums[0];
        // 根据三种情况更新不同升序序列的集合
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < tails[0]) {
                tails[0] = nums[i];
            } else if (nums[i] >= tails[len]) {
                tails[++len] = nums[i];
            } else {
                // 如果在中间，则二分搜索
                tails[binarySearch(tails, 0, len, nums[i])] = nums[i];
            }
        }
        return len + 1;
    }

    private int binarySearch(int[] tails, int min, int max, int target) {
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (tails[mid] == target) {
                return mid;
            }
            if (tails[mid] < target) {
                min = mid + 1;
            }
            if (tails[mid] > target) {
                max = mid - 1;
            }
        }
        return min;
    }


}
