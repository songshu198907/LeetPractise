package algorithm.leet_61_75;

/**
 * Created by songheng on 4/14/16.
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        int r = 0 ;
        int g = 0;
        for(int i = 0 ; i <nums.length ;i++){
            int val = nums[i];
            if(val == 0) {

                nums[i] = nums[i-r-g];
                nums[i-r-g] = 0;

                if(nums[i] == 1){
                    nums[i] = nums[i-g];
                    nums[i-g] = 1;

                }

            } else if( val == 1){
                nums[i] = nums[i-g];
                nums[i-g] = 1;
                r++;
            } else {
                g++;
            }
        }
    }
}
