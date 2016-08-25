package algorithm.leet_351_365;

/**
 * Created by songheng on 8/25/16.
 */
public class Sum_of_Two_Integers_371 {
    public int getSum(int a, int b) {

        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);

    }
}
