package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/27/16.
 */
public class Combination_Sum_III_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        if (k == 0 || n == 0 || k == n)
            return lists;
        int avg = n / k;
        if (n > 45 || avg == 9)
            return lists;
//        helper(lists, new ArrayList<>(), 0, n, k, 1);
        helper(lists, new ArrayList<Integer>(), k, n, 1);
        return lists;


    }

    private void helper(List<List<Integer>> lists, List<Integer> prev, int csum, int goal, int k, int start) {
        if (csum == goal && k == prev.size()) {
            lists.add(prev);
            return;
        }
        if (csum > goal || csum + start > goal || prev.size() > k || (prev.size() == k && csum != goal))
            return;
        int remainingStep = k - prev.size();
        int avg = (int) Math.ceil((goal - csum) * 1.0 / remainingStep);
        for (int i = start; i <= (avg > 9 ? 9 : avg); i++) {

            List<Integer> current = new ArrayList<>(prev);
            current.add(i);
            helper(lists, current, csum + i, goal, k, i + 1);
        }

    }

    private void helper(List<List<Integer>> lists, List<Integer> prev, int step, int sum, int start) {
        if (step == 0 && sum == 0) {
            lists.add(prev);
            return;
        }
        int maxRem = 9 * (step - 1) + (step - 2) * (step - 1) * -1 / 2;
        int max = 9 + (step - 1) * -1;
        if (sum > maxRem + max) return;
        if (step == 0)
            return;
        start = Math.max(start, sum - maxRem);

        for (int i = start; i <= Math.min(9, sum); i++) {
            List<Integer> current = new ArrayList<>(prev);
            current.add(i);
            helper(lists, current, step - 1, sum - i, i + 1);
        }
    }

}
