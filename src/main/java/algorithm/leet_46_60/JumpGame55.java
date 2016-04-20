package algorithm.leet_46_60;

/**
 * Created by songheng on 3/29/16.
 */
public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int last = 0 , current = 0;
        for( int pos = 0 ; pos < nums.length ; pos ++){
            if( pos > last){
                if(current < pos){
                    break;
                }
                last = current;

            }
            current = Math.max(current,nums[pos] + pos);
        }
        return current >= nums.length - 1;
    }
}
