import algorithm.ListNode;
import algorithm.NodeListBuilder;
import algorithm.TreeBuilder;
import algorithm.leet_321_350.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by shu on 7/24/2016.
 */
public class CodeTest_321_350 {
    @Test
    public void test321() {
        Coin_Change_322 coin = new Coin_Change_322();
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coin.coinChange(new int[]{2}, 3));
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 100));
        System.out.println(coin.coinChange(new int[]{186, 419, 83, 408}, 6249));
        System.out.println(coin.coinChange2(new int[]{1, 2, 5}, 11));
        System.out.println(coin.coinChange2(new int[]{2}, 3));
        System.out.println(coin.coinChange2(new int[]{1, 2, 5}, 100));
        System.out.println(coin.coinChange2(new int[]{186, 419, 83, 408}, 6249));
    }

    @Test
    public void test323() {
        Number_of_Connected_Components_in_an_Undirected_Graph_323 num = new Number_of_Connected_Components_in_an_Undirected_Graph_323();
        System.out.println(num.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
        System.out.println(num.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}, {2, 3}}));

    }

    @Test
    public void test324() {
        Wiggle_Sort_II_324 wiggle = new Wiggle_Sort_II_324();
        int[] arr = new int[]{1, 5, 1, 1, 6, 4};
        wiggle.wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{
                1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2
        };
        wiggle.wiggleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test325() {
        Maximum_Size_Subarray_Sum_Equals_k_325 max = new Maximum_Size_Subarray_Sum_Equals_k_325();
//        System.out.println(max.maxSubArrayLen(new int[]{1,-1,5,-2,3},3));
        System.out.println(max.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
    }

    @Test
    public void test327() {
        Count_of_Range_Sum_327 cnt = new Count_of_Range_Sum_327();
        System.out.println(cnt.countRangeSum(new int[]{-2, 5, -1}, -2, 2));
        System.out.println(cnt.countRangeSum(new int[]{0, 0}, 0, 0));
        System.out.println(cnt.countRangeSum(new int[]{2147483647, -2147483648, -1, 0}, -1, 0));
        System.out.println(cnt.countRangeSum(new int[]{-2147483647, 0, -2147483647, 2147483647}, -564, 3864));

    }

    @Test
    public void test328() {
        Odd_Even_Linked_List_328 odd = new Odd_Even_Linked_List_328();
        ListNode head;
        head = NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        odd.oddEvenList(head).print();
        head = NodeListBuilder.BuildList(new int[]{1, 2, 3});
        odd.oddEvenList(head).print();

    }

    @Test
    public void test329() {
        Longest_Increasing_Path_in_a_Matrix_329 longest = new Longest_Increasing_Path_in_a_Matrix_329();
        System.out.println(longest.longestIncreasingPath(new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        }));
        System.out.println(longest.longestIncreasingPath(new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        }));
        System.out.println(longest.longestIncreasingPath(new int[][]{
                {7, 8, 9},
                {9, 7, 6},
                {7, 2, 3}
        }));

    }

    @Test
    public void test335() {
        Self_Crossing_335 self = new Self_Crossing_335();
//        System.out.println(self.isSelfCrossing(new int[]{2,1,1,2}));
//        System.out.println(self.isSelfCrossing(new int[]{1,2,3,4}));
//        System.out.println(self.isSelfCrossing(new int[]{1,1,1,1}));
//        System.out.println(self.isSelfCrossing(new int[]{1,1,1,1}));
        System.out.println(self.isSelfCrossing(new int[]{1, 1, 2, 1, 1}));
    }

    @Test
    public void test336() {
        Palindrome_Pairs_336 pal = new Palindrome_Pairs_336();
//        System.out.println(pal.palindromePairs(new String[]{"bat", "tab", "cat"}));
//        System.out.println(pal.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"}));
//        System.out.println(pal.palindromePairs(new String[]{"a",""}));
        System.out.println(pal.palindromePairs(new String[]{"a", "b", "c", "ab", "ac", "aa"}));
//        System.out.println(pal.palindromePairs(new String[]{"a","abc","aba",""}));
//        System.out.println(pal.palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"}));
    }

    @Test
    public void test337() {
        HouseRobberIII_337 house = new HouseRobberIII_337();
        System.out.println(house.rob(TreeBuilder.build(new Object[]{
                3, 2, 3, null, 3, 1, null
        })));
        System.out.println(house.rob(TreeBuilder.build(new Object[]{
                3, 4, 5, 1, 3, null, 1
        })));


    }

    @Test
    public void test342() {
        PowerofFour_342 pof = new PowerofFour_342();
        System.out.println(pof.isPowerOfFour(16));
        System.out.println(pof.isPowerOfFour(32));
    }
}
