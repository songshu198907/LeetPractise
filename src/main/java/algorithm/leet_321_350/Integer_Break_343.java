package algorithm.leet_321_350;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 2016/8/19.
 */
public class Integer_Break_343 {
    public int integerBreak(int n) {
        int max = 0;
        for (int i = 2; i <= n; i++) {
            int tmp = 1;
            for (Integer integer : getList(n, i)) {
                tmp *= integer;
            }
            max = Math.max(max, tmp);
        }
        return max;
    }

    private List<Integer> getList(int n, int share) {
        List<Integer> list = new ArrayList<>();
        while (share > 0) {
            int div = n / share--;
            list.add(div);
            n -= div;
        }
        return list;
    }
}
