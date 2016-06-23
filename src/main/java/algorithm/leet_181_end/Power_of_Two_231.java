package algorithm.leet_181_end;

/**
 * Created by shu on 6/20/2016.
 */
public class Power_of_Two_231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        int x;

        while (n > 0) {
            x = n & 0X1;
            if (x != 0) break;
            n = (n >> 1);
        }
        return n <= 1;

    }
}
