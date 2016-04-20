package algorithm.leet_31_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/25/16.
 */
public class CombinationSumII_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        helper(list, path, result, candidates, 0, target);
        System.out.println(result);
        return result;
    }

    private void helper(List<Integer> list,List<Integer> path, List<List<Integer>> lists, int[] candidates, int sum, int target) {

        if (sum > target) {

            return;
        }
        if (sum == target) {
            Collections.sort(list);

            if(!lists.contains(list)){
                lists.add(list);
            }

        }
        for (int i = 0; i < candidates.length; i++) {
            if (!path.contains(i)) {
                if( i > 0 && candidates[i] == candidates[i-1]){
                    continue;
                }

                List<Integer> nlist = new ArrayList<>(list);
                List<Integer> nPath = new ArrayList<>(path);

                if (sum + candidates[i] > target) {
                    break;
                }

                nlist.add(candidates[i]);
                nPath.add(i);
                helper(nlist, nPath ,lists, candidates, sum + candidates[i], target);
            }

        }


    }

}
