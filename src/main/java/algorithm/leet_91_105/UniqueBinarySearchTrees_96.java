package algorithm.leet_91_105;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/5/16.
 */
public class UniqueBinarySearchTrees_96 {
    public int numTrees(int n) {
       int[] nums = new int[n+1];
        nums[0] = 1;
        for(int i = 1 ;i <= n ; i ++){
            for ( int j = 0 ; j < i ; j++){
                nums[i] += nums[j]*nums[i-1-j];
            }
        }
        return nums[n];
    }


}
