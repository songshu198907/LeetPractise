package algorithm.leet_181_320;

/**
 * Created by songheng on 5/20/16.
 */
public class Reverse_Bits_190 {
    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse |= ((n >>> i) & 1) << (31 - i);
        }
        return reverse;
    }

}
