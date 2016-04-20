package algorithm.leet_76_90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 4/18/16.
 */
public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n < k) {
            return null;
        }
        if (n == k) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }
            res.add(list);
        } else {
            help(res,new ArrayList<>(),1,n,k);
        }

        return res;
    }
    private void help (List<List<Integer>> res , List<Integer> prev , int start , int end , int remain ){
        if(remain == 0 ){
            res.add(prev);
            return;
        }
        for(int i = start ; i <= end  - remain + 1  ; i ++){
            List<Integer> curr = new ArrayList<>(prev);
            curr.add(i);
            help(res,curr,i+1 , end,remain - 1);

        }
        prev = null;
    }
}
