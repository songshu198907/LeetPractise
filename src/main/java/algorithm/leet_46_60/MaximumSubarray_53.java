package algorithm.leet_46_60;

import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec;

/**
 * Created by songheng on 3/29/16.
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        for(int num : nums){
            sum += num;
            if(sum>max){
                max = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }

        }
        return max;


    }
}
