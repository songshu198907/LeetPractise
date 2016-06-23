package algorithm.leet_181_end;

/**
 * Created by shu on 6/20/2016.
 */
public class Number_of_Digit_One_233 {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        int res = 0;
        int tmp = 1;
        while ((n / tmp) >= 10) {
            tmp *= 10;
        }
        int prev = 0;
        while (tmp > 0) {
            int bit = n / tmp;
            int dig = bit % 10;
            if (dig == 0) {
                res += prev * tmp;
            } else if (dig == 1) {
                res += prev * tmp + n % tmp + 1;
            } else {
                res += (prev + 1) * tmp;
            }
            prev = prev * 10 + bit;
            n = n % tmp;
            tmp /= 10;
        }

        return res;
    }
}
