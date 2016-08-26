package algorithm.leet_351_365;

/**
 * Created by songheng on 8/26/16.
 */
public class Super_Pow_372 {
    private int divi = 1337;

    public int superPow(int a, int[] b) {
        int res = 1;

        int rem = a % divi;
        for (int i = 0; i < b.length; i++) {
            int num = b[i];
            int prev = getPow(res, 10);
            int cur = getPow(rem, num) % divi;
            res = ((prev * cur) % divi);

        }
        return res;
    }

    public int getPow(int num, int times) {
        int res = 1;
        for (int i = 0; i < times; i++) {
            res = (res * num) % divi;
        }
        return res;
    }
}
