package algorithm.leet_76_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by songheng on 5/4/16.
 */
public class SubsetsII_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            buildList(subsets, new ArrayList<>(), i, nums, 0);
        }


        return subsets;

    }

    private void buildList(List<List<Integer>> res, List<Integer> prevs, int remaining, int[] nums, int start) {
        if(remaining == 0 ){
            res.add(prevs);
        } else {
            int tmp = Integer.MIN_VALUE;
            for ( int i = start ; i <= nums.length - remaining; i++ ){
                if(nums[i] == tmp){
                    continue;
                } else {
                    tmp = nums[i];
                    List<Integer> curr = new ArrayList<>(prevs);
                    curr.add(tmp);

                    buildList(res, curr,remaining - 1 , nums,i+1);
                }
            }
        }

    }

}
