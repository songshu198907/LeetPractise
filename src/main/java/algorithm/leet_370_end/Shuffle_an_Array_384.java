package algorithm.leet_370_end;

import java.util.ArrayList;
import java.util.List;
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
        List<Integer> ava = new ArrayList<>(), seq = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ava.add(i);
        }
        helper(seq, ava);
        int[] arr = new int[nums.length];
        for (int i = 0; i < seq.size(); i++) {
            arr[i] = nums[seq.get(i)];
        }
        return arr;
    }

    private void helper(List<Integer> list, List<Integer> ava) {
        if (ava.isEmpty()) return;
        int pos = new Random().nextInt(ava.size());
        int num = ava.get(pos);
        ava.remove(pos);
        list.add(num);
        helper(list, ava);
    }
}
