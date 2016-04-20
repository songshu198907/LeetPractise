package algorithm.leet_46_60;

import java.util.*;

/**
 * Created by songheng on 3/28/16.
 */
public class PermutationsII_47 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();


        if(nums.length < 1){
            return  results;
        }
        else {


            List<Integer> remaining = new ArrayList<>(nums.length);
            helper( results,nums,remaining, new ArrayList<>(),nums.length);
        }

        return  results;
    }
    private void helper(List<List<Integer>> lists, int[] nums, List<Integer> used, List<Integer> previous , int number ){
        if(number == 0 ){
            lists.add(previous);
        } else {
            int last = Integer.MIN_VALUE;
            Set<Integer> set = new HashSet<>();
            for( int i = 0 ; i< nums.length ; i++){
                if(used.contains(i)){
                    continue;
                } else if(set.contains(nums[i])){
                    continue;

                } else {
                    set.add(nums[i]);
                    List<Integer> next = new ArrayList<>(used) ,
                            prev = new ArrayList<>(previous);
                    last = nums[i];
                    next.add(i);
                    prev.add(last);

                    helper(lists,nums,next,prev,number - 1);
                }
            }
        }

    }
}
