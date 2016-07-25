package algorithm.leet_321_350;

/**
 * Created by songheng on 7/25/16.
 */
public class Power_of_Three_326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
