package algorithm.leet_31_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/24/16.
 */
public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        System.out.println(candidates[0]);

        helper(list, result, candidates, 0, target);
        System.out.println(result);


        return result;

    }

    private void helper(String elements, List<String> list, int[] candidates, int sum, int target) {
        boolean any = false;
        if (sum > target || sum + candidates[0] > target) {
            return;
        }
        if (sum == target) {
            list.add(elements);

        }
        StringBuilder sb = new StringBuilder(elements);
        for (int i = 0; i < candidates.length; i++) {
            helper(elements + candidates[i] + ",", list, candidates, sum + candidates[i], target);
        }


    }

    private void helper(List<Integer> list, List<List<Integer>> lists, int[] candidates, int sum, int target) {

        if (sum > target) {

            return;
        }
        if (sum == target) {
            Collections.sort(list);
            if (!lists.contains(list)) {
                lists.add(list);
            }

        }
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> nlist = new ArrayList<>(list);
            if (sum + candidates[i] > target) {
                break;
            }
            nlist.add(candidates[i]);
            helper(nlist, lists, candidates, sum + candidates[i], target);
        }


    }

}
