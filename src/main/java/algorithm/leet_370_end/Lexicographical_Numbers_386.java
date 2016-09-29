package algorithm.leet_370_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 2016/9/26.
 */
public class Lexicographical_Numbers_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        int cur = 1;
        for (int i = 1; i <= n; i++) {
            list.add(cur);
            if (cur * 10 <= n) {
                cur *= 10;
            } else {
                if (cur > n) cur /= 10;
                cur += 1;
                while (cur % 10 == 0) cur /= 10;
            }
        }
        return list;
    }


}
