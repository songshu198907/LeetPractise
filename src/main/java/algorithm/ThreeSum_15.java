package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/17/16.
 */
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums == null||nums.length < 3 ){
            return res;
        }
        List<Integer> numList = new ArrayList<>();
        for ( int num : nums)
        {
            numList.add(num);
        }
        Collections.sort(numList);
        if(numList.get(0)>0 || numList.get(numList.size()-1) < 0 ){
            return res;
        }
        for(int i = 0 ; i < numList.size() ; i ++){
            for ( int j = i+1 ; j < numList.size();j++){
                int sum =  numList.get(i)+numList.get(j);
                if(sum > 0) break;
                for(int k = numList.size() -1 ; k > j ; k--){
                    int tmp = sum + numList.get(k);
                    if(tmp == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(numList.get(i));
                        list.add(numList.get(j));
                        list.add(numList.get(k));
                        if(!res.containsAll(list)){
                            res.add(list);
                        }
                    }
                    else if ( tmp < 0){
                        break;
                    }
                }

            }
        }



        return res;
    }

    public List<List<Integer>> threeSumFaster(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        if(nums == null || nums.length<3){
            return result;
        }

        for( int i = 0 ; i <= nums.length-3 ; i++){
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0 ){
                    List<Integer> unit = new ArrayList<>();
                    unit.add(nums[i]);
                    unit.add(nums[low]);
                    unit.add(nums[high]);
                    if(!result.contains(unit)){
                        result.add(unit);
                    }
                    low++;
                    high --;
                } else  if (sum > 0){
                    high --;
                } else {
                    low ++;
                }
            }



        }
        return  result;
    }
}
