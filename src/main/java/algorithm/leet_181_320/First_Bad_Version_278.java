package algorithm.leet_181_320;

/**
 * Created by shu on 7/9/2016.
 */
public class First_Bad_Version_278 {
    public int firstBadVersion(int n) {
        Long left = 1L;
        Long right = (long) n;

        while (left <= right) {
            Long mid = (left + right) / 2;

            if (isBadVersion(mid.intValue())) right = mid - 1;
            else left = mid + 1;
        }

        return left.intValue();
    }

    private boolean isBadVersion(int center) {
        return center >= 1702766719;
    }
}
