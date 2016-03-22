package algorithm;

/**
 * Created by songheng on 3/22/16.
 */
public class RemoveDuplicatesfromSortedArray_26 {

    public int removeDuplicates(int[] nums) {
        if(nums.length<2)return nums.length;
        int current = 1 , end = 0;
        for(  ; current < nums.length ; current ++ ){
            if(nums[current] != nums[end]){
                nums[++end] = nums[current];
            }else {
                continue;
            }
        }
        return end+1;
    }
}
