package algorithm.leet_181_320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/23/16.
 */
public class Happy_Number_202 {
    public boolean isHappy(int n) {
        boolean res = true;
        int sum = 0;
        List<Integer> sums = new ArrayList<>();
        while (sum != 1) {
            if (sums.contains(n)) return false;
            sums.add(n);
            sum = 0;
            if (n <= 3 && n != 1) {
                return false;
            }
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;

        }

        return res;
    }
}
