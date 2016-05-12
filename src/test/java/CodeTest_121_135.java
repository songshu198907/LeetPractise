import algorithm.TreeBuilder;
import algorithm.leet_121_135.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by songheng on 5/10/16.
 */
public class CodeTest_121_135 {
    @Test
    public void test121() {
        BestTimetoBuyandSellStock_121 best = new BestTimetoBuyandSellStock_121();
        System.out.println(best.maxProfit(new int[]{1, 2}));
    }

    @Test
    public void test122() {
        BestTimetoBuyandSellStockII_122 best = new BestTimetoBuyandSellStockII_122();
//        System.out.println(best.maxProfit(new int[]{1,2}));
//        System.out.println(best.maxProfit(new int[]{2,1}));
//        System.out.println(best.maxProfit(new int[]{2,1,4}));
        System.out.println(best.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void test123() {
        BestTimetoBuyandSellStockIII_123 best = new BestTimetoBuyandSellStockIII_123();
        System.out.println(best.maxProfit(new int[]{1, 5, 3, 7, 1, 9}));
        System.out.println(best.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0}));
    }

    @Test
    public void test124() {
        BinaryTreeMaximumPathSum_124 binary = new BinaryTreeMaximumPathSum_124();
        System.out.println(binary.maxPathSum(TreeBuilder.build(new Object[]{
                -3
        })));

        System.out.println(binary.maxPathSum(TreeBuilder.build(new Object[]{
                1, 2, 3, null, -3, null, 4
        })));
        System.out.println(binary.maxPathSum(TreeBuilder.build(new Object[]{
                -2, -1
        })));
        System.out.println(binary.maxPathSum(TreeBuilder.build(new Object[]{
                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1
        })));
    }

    @Test
    public void test125() {
        ValidPalindrome_125 valid = new ValidPalindrome_125();
        System.out.println(valid.isPalindrome("0P"));
    }

    @Test
    public void test126() {
        WordLadderII_126 word = new WordLadderII_126();
        String arr[] = {"hot", "dog"};
        Set set = new HashSet<>(Arrays.asList(arr));
        System.out.println(word.findLadders("hot", "dog", set));
    }
}
