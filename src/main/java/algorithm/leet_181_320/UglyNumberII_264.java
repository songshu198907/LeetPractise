package algorithm.leet_181_320;

import java.util.LinkedList;

/**
 * Created by shu on 6/22/2016.
 */
public class UglyNumberII_264 {
    public int nthUglyNumber(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        while (list.size() < n) {
            int ugly2 = list.get(p2) * 2;
            int ugly3 = list.get(p3) * 3;
            int ugly5 = list.get(p5) * 5;
            int min = Math.min(ugly2, Math.min(ugly3, ugly5));
            if (min == ugly2) p2++;
            if (min == ugly3) p3++;
            if (min == ugly5) p5++;
            if (min != list.get(list.size() - 1)) {
                list.add(min);
            }
        }
        return list.get(list.size() - 1);
    }
}
