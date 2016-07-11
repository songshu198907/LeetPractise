package algorithm.leet_181_end;

import java.util.Arrays;

/**
 * Created by songheng on 6/27/16.
 */
public class HIndex_274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        for (int i = 0; i < citations.length; i++) {
            int val = citations[i];
            if (val > citations.length - i) break;
            if (val <= citations.length - i) res = val;
        }
        return res;
    }
}
