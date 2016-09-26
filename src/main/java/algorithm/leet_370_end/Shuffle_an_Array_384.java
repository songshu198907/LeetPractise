package algorithm.leet_370_end;

import java.util.Random;

/**
 * Created by songheng on 8/29/16.
 */
public class Shuffle_an_Array_384 {
    private int[] nums;



    public Shuffle_an_Array_384(int[] nums) {
        this.nums = nums;


    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] arr = new int[nums.length];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            int pos;
            do {
                pos = (i + random.nextInt(nums.length)) % nums.length;
            } while (arr[pos] != 0);
            arr[pos] = nums[i];
        }
        return arr;

    }


}
