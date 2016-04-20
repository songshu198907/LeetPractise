package algorithm.leet_76_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by songheng on 4/18/16.
 */
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length ==0){
            return  res;
        }
        for(int i = 1 ; i <= nums.length ; i ++ ){
            helper(res,new ArrayList<>(),0,nums.length - 1, i , nums);
        }
        res.add(new ArrayList<>());
        return  res ;
    }

    private void helper(List<List<Integer>> res , List<Integer> prev, int start ,int end , int remaining, int arr[]){

        if(remaining == 0 ){
            res.add(prev);
            return;
        }
        for(int i = start ; i <= end - remaining + 1 ; i++){
            List<Integer> curr = new ArrayList<>(prev);
            curr.add(arr[i]);
            helper(res,curr,i+1,end,remaining-1,arr);
        }
        prev = null;
    }
}
