package algorithm.leet_351_365;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by shu on 2016/8/22.
 */
public class Russian_Doll_Envelopes_354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[0] != e2[0]) return e1[0] - e2[0];
                return e2[1] - e1[1];
            }
        });
        int len = 0;
        int[] h = new int[envelopes.length];
        for (int[] envelope : envelopes) {
            int i = 0, j = len - 1;
            while (i <= j) {
                int m = (i + j) / 2;
                if (h[m] < envelope[1]) i = m + 1;
                else j = m - 1;
            }
            h[i] = envelope[1];
            if (i == len) len++;
        }
        return len;
    }
}
