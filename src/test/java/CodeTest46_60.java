import algorithm.leet_46_60.*;
import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/28/16.
 */
public class CodeTest46_60 {
    @Test
    public void test46() {
        Permutations_46 permutation = new Permutations_46();
        System.out.println(permutation.permute(new int[]{
                1, 2, 3
        }));
    }

    @Test
    public void test47() {
        PermutationsII_47 permutation = new PermutationsII_47();
        System.out.println(permutation.permute(new int[]{1, 1, 2}));
    }

    @Test
    public void test49() {
        GroupAnagrams_49 group = new GroupAnagrams_49();
        System.out.println(group.groupAnagrams(new String[]{"", ""}));
    }

    @Test
    public void test50() {
        Pow_50 pow = new Pow_50();
        System.out.println(pow.myPow(0.00001,
                2147483647));
    }

    @Test
    public void test51() {
//        NQueens51 queen = new NQueens51();
//        System.out.println(queen.solveNQueens(4));

        NQueen51_3 queen3 = new NQueen51_3();
        System.out.println(queen3.solveNQueens(4));
    }

    @Test
    public void test53() {
        MaximumSubarray_53 max = new MaximumSubarray_53();
        System.out.println(max.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void test54() {
        SpiralMatrix54 spiral = new SpiralMatrix54();
        System.out.println(spiral.spiralOrder(new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        }));
        String a = "sa";
        a.length();
    }

    @Test
    public void test55() {
        JumpGame55 jump = new JumpGame55();
        System.out.println(jump.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void test56() {
        MergeIntervals_56 merge = new MergeIntervals_56();
        List<Interval> lists = new ArrayList<>();
//        lists.add(new Interval(1,3));
//        lists.add(new Interval(2,6));
//        lists.add(new Interval(8,10));
//        lists.add(new Interval(15,18));
        lists.add(new Interval(1,4));
        lists.add(new Interval(1,4));

        System.out.println(merge.merge(lists));
    }
    @Test
    public void test57(){
//        InsertInterval_57 insert = new InsertInterval_57();
//        System.out.println(insert.insert(Interval.listBuilder(new int[][]{
//                {1,2},{3,5},{6,7},{8,10},{12,16}
//        }),new Interval(4,9)));
        InsertInterval57_2 inserts = new InsertInterval57_2();
        System.out.println(inserts.insert(Interval.listBuilder(new int[][]{
                {1,5}
        }),new Interval(6,9)));
    }
    @Test
    public void test60(){
        PermutationSequence_60 permutation = new PermutationSequence_60();
        System.out.println(permutation.getPermutation(4,5));
    }
}
