package round2;

import algorithm.NodeListBuilder;
import algorithm.leet_1_30.*;
import org.junit.Test;

/**
 * Created by songheng on 10/6/16.
 */
public class CodeTest_1_30 {
    @Test
    public void test14() {
        LongestCommonPrefix_14 longest = new LongestCommonPrefix_14();
//        System.out.println(longest.longestCommonPrefix(new String[]{}));
        System.out.println(longest.longestCommonPrefix(new String[]{"abc", "abcd", "abd"}));
        System.out.println(longest.longestCommonPrefix(new String[]{"abc", "acd", "abd"}));
    }

    @Test

    public void test15() {
        TSum_15 tsum = new TSum_15();
        System.out.println(tsum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(tsum.threeSum(new int[]{0, 14, -7, 2, 7, 11, -9, 11, -12, 6, -10, -8, 9, -3, 7, -6, 3, 4, 14, -10, -8, 5, -1, 6, 12, 9, 12, -11, -15, -5, 5, 0, -6, 13, 9, 9, 10, 7, 5, 13, -2, 11, -10, -15, -15, 4, -14, -4, -15, 7, -7, -15, -3, 8, -2, -13, -6, -5, -9, -14, 5, 12, 1, 6, 2, -12, -8, -11, 10, 13, -13, -14, 1, 14, 8, 1, -4, 9, 4, -12, -6, 13, 10, 6, 6, -7, 8, 7, 3, 7, 8, -15, -4, -14, -1, 13, -11, 6, -12, -15, 4, 12, 8, -10, 4, 1, -1, 7, -13, -12, 10, -4, 8, 6, 10, -1, 6, -5, 13, -13, 9, 6, -13, -10}));
    }

    @Test

    public void test16() {
        TSum_Closet_16 tsum = new TSum_Closet_16();
        System.out.println(tsum.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }

    @Test
    public void test19() {
        RemoveNthNodeFromEndofList_19 remove = new RemoveNthNodeFromEndofList_19();
        remove.removeNthFromEnd(NodeListBuilder.BuildList(new int[]{1}), 1).print();
//        remove.removeNthFromEnd(NodeListBuilder.BuildList(new int[]{4,8,6,0,4,3,7,7}),1).print();
    }

    @Test
    public void test20() {
        ValidParentheses_20 valid = new ValidParentheses_20();
        System.out.println(valid.isValid("["));
    }

    @Test
    public void test25() {
        ReverseNodesink_Group_25 reverse = new ReverseNodesink_Group_25();
        reverse.reverseKGroup(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5}), 1).print();
        reverse.reverseKGroup(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5}), 2).print();
        reverse.reverseKGroup(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5}), 3).print();
        reverse.reverseKGroup(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5}), 4).print();
        reverse.reverseKGroup(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5}), 5).print();
    }

    @Test
    public void test30() {
        Substring_30 subString = new Substring_30();
//        System.out.println(subString.findSubstring("barfoothefoobarman",new String[]{
//                "foo", "bar"
//        }));
//        System.out.println(subString.findSubstring("barfoofoobarthefoobarman",
//                new String[]{"bar", "foo", "the"}));
        System.out.println(subString.findSubstring2("wordgoodgoodgoodbestword"
                , new String[]{"word", "good", "best", "good"}));


    }
}
