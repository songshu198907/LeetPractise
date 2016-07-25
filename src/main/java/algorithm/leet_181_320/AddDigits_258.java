package algorithm.leet_181_320;

/**
 * Created by shu on 6/22/2016.
 */
public class AddDigits_258 {
    public int addDigits(int num) {
        if (num < 0) return 0;
        while (num >= 10) {
            int tmp = 0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                tmp += digit;
            }
            num = tmp;
        }
        return num;
    }
}
