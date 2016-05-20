package algorithm.leet_181_end;

/**
 * Created by songheng on 5/20/16.
 */
public class Number_of_1_Bits_191 {
    public int hammingWeight(int n) {

        int res = 0;
        for (int i = 0; i < 32; i++) {

            res += n & 1;
            n >>= 1;
        }
        return res;
    }
}
