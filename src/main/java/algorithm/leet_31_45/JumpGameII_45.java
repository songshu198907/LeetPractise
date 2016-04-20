package algorithm.leet_31_45;

/**
 * Created by songheng on 3/28/16.
 */
public class JumpGameII_45 {
    public int jump(int[] nums) {
        int[] number = new int[nums.length];

        number[0] = 0;
        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i) {
                    number[i] = number[j] + 1;
                    break;
                }
            }
        }
        return number[nums.length - 1];
    }
    public int jump2(int[] nums) {
        int last = 0;
        int curr = 0;
        int ret = 0 ;
        for(int i = 0 ; i < nums.length ; i++) {
            if( i > last){
                if (i > last) {
                    last = curr;
                    ++ret;
                }
                curr = Math.max(curr, i+nums[i]);
            }
        }
        return ret;

    }

}
