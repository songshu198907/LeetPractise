package algorithm.leet_370_end;

/**
 * Created by songheng on 9/29/16.
 */
public class IntegerReplacement_397 {
    public int integerReplacement(int n) {
        int c = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n = (n >>> 1);
            } else if (n == 3 || Integer.bitCount(n + 1) > Integer.bitCount(n - 1)) {
                n--;
            } else {
                n++;
            }
            c++;
        }
        return c;
    }
}
