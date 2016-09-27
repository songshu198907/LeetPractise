package algorithm.leet_351_365;

/**
 * Created by songheng on 9/21/16.
 */
public class Valid_Perfect_Square_367 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while ((num / i) >= i) i *= 10;

        int end = i - 1, start = i / 10;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (num * 1.0 / mid == mid) return true;
            else if (num * 1.0 / mid < mid) end = mid - 1;
            else start = mid + 1;
        }
        return num * 1.0 / start == start;
    }
}
