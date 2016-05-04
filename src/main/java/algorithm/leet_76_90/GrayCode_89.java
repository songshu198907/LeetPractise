package algorithm.leet_76_90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/4/16.
 */
public class GrayCode_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> codes = new ArrayList<>();
        List<Integer> prevs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            prevs = buildList(prevs, i);
            codes = prevs;
        }
        return codes;

    }

    private List<Integer> buildList(List<Integer> prev, int k) {
        List<Integer> res = new ArrayList<>();
        if(k == 0 ){
            res.add(0);
            return  res;
        }
        res.addAll(prev);
        int addon = 1<<(k-1);
        for (int i = prev.size() - 1; i >= 0; i--) {
            res.add(prev.get(i) + addon);

        }
        return res;

    }

}
