import algorithm.leet_31_45.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by songheng on 3/23/16.
 */
public class CodeTest31_45 {
    @Test
    public void test31() {
        NextPermutati_31 next = new NextPermutati_31();
        int[] arr = new int[]{
                2, 2, 0, 4, 3, 1
        };
        next.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test32() {
        LongestValidParentheses_32 longest = new LongestValidParentheses_32();
        int res = longest.longestValidParentheses("()()");
        int res2 = longest.longestValidParentheses("()");
        int res3 = longest.longestValidParentheses("()(()");
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }

    @Test
    public void test33() {
        SearchinRotatedSortedArray_33 search = new SearchinRotatedSortedArray_33();
        System.out.println(search.search(new int[]{1, 3}, 3));
    }

    @Test
    public void test34() {
        SearchforaRange_34 search = new SearchforaRange_34();
//        int[] res0 = search.searchRange(new int[]{5, 7, 7, 8, 8, 10} , 8 );
//        System.out.println(Arrays.toString(res0));
//        int[] res = search.searchRange(new int[]{1,2,2} ,2 );
//        System.out.println(Arrays.toString(res));
//        int[] res2 = search.searchRange(new int[]{0, 0, 2, 3, 4, 4, 4, 5}, 5);
//        System.out.println(Arrays.toString(res2));

        int[] res3 = search.searchRange(new int[]{1, 3}, 1);
        System.out.println(Arrays.toString(res3));
    }

    @Test
    public void test38() {
        CountandSay_38 count = new CountandSay_38();
        System.out.println(count.countAndSay(4));
    }

    @Test
    public void test39() {
        CombinationSum_39 sum = new CombinationSum_39();
        sum.combinationSum(new int[]{20, 20, 41}, 61);
    }
    @Test
    public void test40(){
        CombinationSumII_40 sum = new CombinationSumII_40();
        sum.combinationSum2(new int[]{
                1,1
        } , 2);
    }
    @Test
    public void test42(){
        TrappingRainWater_42 trap = new TrappingRainWater_42();
        trap.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        trap.trap(new int[]{4,2,0,3,2,5});
        trap.trap(new int[]{9,6,8,8,5,6,3});
    }
    @Test
    public void test44(){
        WildcardMatching_44 wild = new WildcardMatching_44();
        wild.isMatch("abc","b*");
    }
    @Test
    public void test45(){
        JumpGameII_45 jump = new JumpGameII_45();
        System.out.println(jump.jump(new int[]{
                2,3,1,1,4
        }));

        System.out.println(jump.jump2(new int[]{2,3,1,1,4}));
    }
}
