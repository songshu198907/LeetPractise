package algorithm.leet_1_30;

/**
 * Created by songheng on 10/5/16.
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        long res = 0;
        boolean neg = false;
        if (x < 0) neg = true;
        long tmp = Math.abs(x);
        while (tmp > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE) return 0;
        return neg ? -(int) res : (int) res;
    }
}
