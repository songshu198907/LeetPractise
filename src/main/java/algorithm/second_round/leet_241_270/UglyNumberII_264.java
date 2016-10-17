package algorithm.second_round.leet_241_270;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 10/17/16.
 */
public class UglyNumberII_264 {
    public int nthUglyNumber(int n) {
        int cnt2 = 0, cnt5 = 0, cnt3 = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < n; i++) {
            int ugly2 = list.get(cnt2) * 2;
            int ugly3 = list.get(cnt3) * 3;
            int ugly5 = list.get(cnt5) * 5;
            int min = Math.min(ugly2, Math.min(ugly3, ugly5));
            if (min == ugly2) cnt2++;
            if (min == ugly3) cnt3++;
            if (min == ugly5) cnt5++;
            if (list.get(list.size() - 1) != min)
                list.add(min);
        }
        return list.get(list.size() - 1);
    }
}
