package algorithm.leet_106_120;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/10/16.
 */
public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(0, triangle).get(0);
    }

    private List<Integer> helper(int line, List<List<Integer>> lists) {
        if (line == lists.size() - 1) {
            return new ArrayList<>(lists.get(line));
        } else {
            List<Integer> bigger = helper(line + 1, lists);
            List<Integer> current = lists.get(line);
            for (int i = 0; i < current.size(); i++) {
                int val = Math.min(bigger.get(i), bigger.get(i + 1)) + current.get(i);
                bigger.set(i, val);

            }
            bigger.remove(bigger.size() - 1);
            return bigger;
        }

    }
}
