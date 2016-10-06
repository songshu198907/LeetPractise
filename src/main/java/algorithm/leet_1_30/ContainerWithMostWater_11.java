package algorithm.leet_1_30;

/**
 * Created by songheng on 10/6/16.
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int area = 0;
        int start = 0, end = height.length - 1;
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        while (start < end) {
            if (left < right) {
                while (start < end && height[start] <= left) start++;
            } else {
                while (start < end && height[end] <= right) end--;
            }
            if (start < end) {
                left = height[start];
                right = height[end];
                int tmp = Math.min(left, right) * (end - start);
                area = Math.max(tmp, area);
            }

        }
        return area;
    }
}
