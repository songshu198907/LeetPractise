package algorithm.leet_321_350;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shu on 2016/8/20.
 */
public class Intersection_of_Two_Arrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                res.add(i);
            }
        }
        int[] arr = new int[res.size()];
        int cnt = 0;
        for (int i : res) {
            arr[cnt++] = i;
        }
        return arr;
    }
}
