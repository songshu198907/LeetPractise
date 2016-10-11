package round2;

import algorithm.second_round.leet_31_60.LongestValidParentheses_32;
import algorithm.second_round.leet_31_60.NextPermutation_31;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by songheng on 10/11/16.
 */
public class CodeTest_31_60 {
    @Test
    public void test31() {
        NextPermutation_31 next = new NextPermutation_31();
        int[] arr = new int[]{1, 2, 3};
//        next.nextPermutation(arr);
//        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 5, 1};
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{3, 2, 1};
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 5, 4, 3};
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[0];
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1};
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test32() {
        LongestValidParentheses_32 longest = new LongestValidParentheses_32();
        System.out.println(longest.longestValidParentheses(")()())"));
    }
}
