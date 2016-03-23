package algorithm;

/**
 * Created by songheng on 3/23/16.
 */
public class DivideTwoIntegers_29 {
    public int divide(int dividend, int divisor) {
        boolean negative = false;


        int result = 0;
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (divisor == -1) {
            if (dividend == -2147483648) {
                return Integer.MAX_VALUE;
            } else {
                return 0 - dividend;
            }
        }
        double divi = dividend, divis = divisor;

        if (divi == divis) {
            return 1;
        }
        if (divisor == 1) {
            return dividend;
        }

        if (dividend < 0) {
            negative = !negative;
            divi = -divi;
        }
        if (divisor < 0) {
            negative = !negative;
            divis = 0 - divis;
        }
        int[] times = new int[50];
        double[] values = new double[50];
        int pos = 0;
        if (divi >= divis) {
            int start = 1;
            double current = divis;
            while (current <= divi) {
                times[pos] = start;
                values[pos] = current;

                ++pos;
                if ((1.0 * Integer.MAX_VALUE + 1) / current < 2) {
                    break;
                }
                start += start;
                current += current;

            }
            result = times[pos - 1];
            if (current == divi) {
                result = times[--pos];
            } else {
                double remaining = divi - values[pos - 1];
                pos = pos - 2;
                while (pos >= 0 && remaining > 0) {
                    if (values[pos] <= remaining) {
                        result += times[pos];
                        remaining = remaining - values[pos];
                        pos--;

                    } else {
                        pos--;
                    }
                }

            }


        }
        if (negative) {
            result = -result;
        }

        return result;

    }
}
