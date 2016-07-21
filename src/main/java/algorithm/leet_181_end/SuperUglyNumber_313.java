package algorithm.leet_181_end;

/**
 * Created by songheng on 7/21/16.
 */
public class SuperUglyNumber_313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] cnt = new int[primes.length];
        int[] uglys = new int[n];
        uglys[0] = 1;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                int prod = uglys[cnt[j]] * primes[j];
                min = Math.min(prod, min);
            }
            uglys[i] = min;
            for (int j = 0; j < cnt.length; j++) {
                if (uglys[cnt[j]] * primes[j] == min) {
                    cnt[j]++;
                }
            }

        }
        return uglys[n - 1];
    }
}
