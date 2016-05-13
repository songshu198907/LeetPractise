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
        String arr[] = {"hot", "dot", "dog", "lot", "log"};
        Set set = new HashSet<>(Arrays.asList(arr));
        System.out.println(word.findLadders("hit", "cog", set));
//
    }

    @Test
    public void test127() {
        WordLadder_127 word = new WordLadder_127();
        String[] arr = {
                "hot", "dot", "dog", "lot", "log"
        };
//        Set set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(word.ladderLength("hit", "cog", set));

        Set set = new HashSet<>(Arrays.asList(arr));
        System.out.println(word.ladderLength("nanny", "aloud", set));
    }

    @Test
    public void test128() {
        LongestConsecutiveSequence_128 longest = new LongestConsecutiveSequence_128();
        System.out.println(longest.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longest.longestConsecutive(new int[]{0, 1000, 233, -2, 1, -1, 5, 4, 3, 2}));
        System.out.println(longest.longestConsecutive(new int[]{0}));
    }

    @Test
    public void test130() {
        SurroundedRegions_130 surr = new SurroundedRegions_130();
        String[] strings = {
                "X X X XX", "X XO X X", "X OX O X",
                "XO O O X", "XXXOX"
        };
        char[][] chars = new char[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].replaceAll("\\s", "").toCharArray();
        }
        surr.solve(chars);
        for (char[] aChar : chars) {
            System.out.println(Arrays.toString(aChar));
        }
    }

    @Test
    public void test131() {
        PalindromePartitioning_131 par = new PalindromePartitioning_131();
        System.out.println(par.partition("aab"));
    }

    @Test
    public void test132() {
        PalindromePartitioningII_132 par = new PalindromePartitioningII_132();

//        System.out.println(par.minCut("abc"));
//        System.out.println(par.minCut("aba"));
//        System.out.println(par.minCut("a"));
        System.out.println(par.minCut("acacac"));
        System.out.println(par.minCut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));


    }

}
