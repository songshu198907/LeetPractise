package algorithm;

/**
 * Created by songheng on 3/22/16.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                number++;
            } else {
                nums[i - number] = nums[i];
            }
        }
        return nums.length - number;
    }

    public int removeElementFaster(int[] nums, int val) {
        int end = 0, current = 0;
        while(current < nums.length){
            if(nums[current] != val ){
                nums[end++] = nums[current];
            }
            current++;

        }
        return  ++end;
    }

    ;
}
