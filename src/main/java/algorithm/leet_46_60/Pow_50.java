package algorithm.leet_46_60;

/**
 * Created by songheng on 3/28/16.
 */
public class Pow_50 {
    public double myPow(double x, int n) {

        double result;
        boolean negative = false;
        boolean overload = false;
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            negative = true;
            if (n == Integer.MIN_VALUE) {
                overload = true;
                n = Integer.MAX_VALUE;
            } else {
                n = -n;
            }
        }
        result = helper(x, n);
        if (negative) {
            if (overload) {
                result = result * x;
            }
            result = 1 / result;
        }

        return result;
    }

    private double helper(double x, int count) {
        double result;
        if (count == 0) {
            return 1;
        } else {
            double child;
            if (count % 2 == 0) {
                child = helper(x, count / 2);
                result = child * child;
            } else {
                child = helper(x, (count - 1) / 2);
                result = child * child * x;
            }
            return result;
        }

    }

    ;

}
