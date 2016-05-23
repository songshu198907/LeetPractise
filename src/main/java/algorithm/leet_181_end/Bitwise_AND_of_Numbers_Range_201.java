package algorithm.leet_181_end;

/**
 * Created by songheng on 5/23/16.
 */
public class Bitwise_AND_of_Numbers_Range_201 {
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while (m > 0 && n > 0) {
            if (m == n) {
                return m << offset;
            }
            m >>= 1;
            n >>= 1;
            offset++;
        }

        return 0;
    }
}
