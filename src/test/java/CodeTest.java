import algorithm.*;
import algorithm.leet_1_30.AddTwoNumbers_2;
import algorithm.leet_1_30.LongestSubstring_3;
import algorithm.leet_1_30.Median_of_Two_Sorted_Arrays_4;
import algorithm.leet_1_30.ZigZagConversion_6;
import algorithm.second_round.leet_1_30.LongestCommonPrefix_14;
import org.junit.Test;

/**
 * Created by songheng on 3/15/16.
 */
public class CodeTest {

    @Test
    public void test2() {
        AddTwoNumbers_2 add = new AddTwoNumbers_2();
//        System.out.println(add.addTwoNumbers(NodeListBuilder.BuildList(new int[]{2,3}),NodeListBuilder.BuildList(new int[]{5,6,4})));
//        System.out.println(add.addTwoNumbers(NodeListBuilder.BuildList(new int[]{2,4,3}),NodeListBuilder.BuildList(new int[]{5,6,4})));
//        System.out.println(add.addTwoNumbers(NodeListBuilder.BuildList(new int[]{0}),NodeListBuilder.BuildList(new int[]{0})));
        System.out.println(add.addTwoNumbers(NodeListBuilder.BuildList(new int[]{9}), NodeListBuilder.BuildList(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9})));
    }

    @Test
    public void test3() {
        LongestSubstring_3 longest = new LongestSubstring_3();
        System.out.println(longest.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(longest.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test4() {

        Median_of_Two_Sorted_Arrays_4 median = new Median_of_Two_Sorted_Arrays_4();
        System.out.println(median.findMedianSortedArrays(new int[]{1, 3
                }, new int[]{2}
        ));
//        System.out.println(median.findMedianSortedArrays(new int[] { 3,5,6,8,9} , new int[] { 1,2,4,5,6,7}));
        System.out.println(median.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{1, 2}));
    }

    @Test
    public void test6() {

        ZigZagConversion_6 zigZag = new ZigZagConversion_6();
//        System.out.println(zigZag.convert("PAYPALISHIRING", 3));
        System.out.println(zigZag.convert("A", 1));
    }

    @Test
    public void test7() {
        algorithm.leet_1_30.ReverseInteger_7 reverse = new algorithm.leet_1_30.ReverseInteger_7();
        System.out.println(reverse.reverse(1));
    }
    @Test
    public void testReverse(){
        ReverseInteger_7 rev = new ReverseInteger_7();
//        System.out.println(rev.reverse(1234567));
//        System.out.println(rev.reverse(-1234567));
//        System.out.println(rev.reverse(0));
//        System.out.println(rev.reverse(1230067));
//        System.out.println(rev.reverse(10));
        System.out.println(rev.reverse(1534236469));
    }
    @Test
    public void testAtoi(){
        StringToInterger_8 atoi = new StringToInterger_8();
//        System.out.println( atoi.myAtoi("  -0012a42"));
//        System.out.println( atoi.myAtoi("2147483648"));
        System.out.println( atoi.myAtoi("+1.0"));
    }

    @Test
    public  void testRoman(){
        IntegertoRoman_12 roman = new IntegertoRoman_12();
        System.out.println(roman.intToRoman(1970));
    }

    @Test
    public  void testRoman2INT(){
        RomantoInteger_13 roman = new RomantoInteger_13();
        System.out.println( roman.romanToInt("MDCLXVI"));
    }

    @Test
    public  void testLongestCommon(){
        LongestCommonPrefix_14 longest = new LongestCommonPrefix_14();
        System.out.println( longest.longestCommonPrefix(new String[]{"aa","a"}));
    }
    @Test
    public void test3Sum(){
        ThreeSum_15 sum = new ThreeSum_15();
        System.out.println(sum.threeSum(new int[]{0,0,0}));
    }

}
