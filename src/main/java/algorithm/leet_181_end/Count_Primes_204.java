package algorithm.leet_181_end;

import java.util.Arrays;

/**
 * Created by songheng on 5/23/16.
 */
public class Count_Primes_204 {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        int[] pr = new int[n];
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) pr[cnt++] = n;
            for (int j = 0; j < cnt && i * pr[j] < n; ++j) {
                prime[i * pr[j]] = false;
                if (i % pr[j] == 0) break;
            }
        }
        return cnt;

    }
}
