import algorithm.leet_351_365.*;
import algorithm.leet_370_end.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by shu on 2016/8/23.
 */
public class CodeTest_351_380 {
    @Test
    public void test354() {
        Russian_Doll_Envelopes_354 russian = new Russian_Doll_Envelopes_354();
//        System.out.println(russian.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
//        System.out.println(russian.maxEnvelopes(new int[][]{{1,1}}));
        System.out.println(russian.maxEnvelopes(new int[][]{{2, 100}, {3, 200}, {4, 300}, {5, 500}, {5, 400}, {5, 250},
                {6, 370}, {6, 360}, {7, 380}}));
    }

    @Test
    public void test355() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 6765);
        twitter.postTweet(5, 671);
        twitter.postTweet(3, 2868);
        twitter.postTweet(4, 8148);
        twitter.postTweet(2, 8847);
        twitter.follow(1, 3);
        twitter.follow(1, 4);
        twitter.follow(5, 1);
        twitter.follow(5, 2);
        System.out.println(twitter.getNewsFeed(1));
        System.out.println(twitter.getNewsFeed(2));
        System.out.println(twitter.getNewsFeed(3));
        System.out.println(twitter.getNewsFeed(4));
        System.out.println(twitter.getNewsFeed(5));
    }

    @Test
    public void test357() {
        Count_Numbers_with_Unique_Digits_357 cnt = new Count_Numbers_with_Unique_Digits_357();
        System.out.println(cnt.countNumbersWithUniqueDigits(8));
    }

    @Test
    public void test372() {
        Super_Pow_372 sp = new Super_Pow_372();
//        System.out.println(sp.superPow(2, new int[]{3}));
//        System.out.println(sp.superPow(2, new int[]{1,0}));
        System.out.println(sp.superPow(2147483647, new int[]{2, 0, 0}));
    }

    @Test
    public void test374() {
        Guess_Number_Higher_or_Lower_374 guess = new Guess_Number_Higher_or_Lower_374();
        System.out.println(guess.guessNumber(Integer.MAX_VALUE));
    }

    @Test
    public void test375() {
        Guess_Number_Higher_or_Lower_II_375 guess = new Guess_Number_Higher_or_Lower_II_375();
        System.out.println(guess.getMoneyAmount(4));
        System.out.println(guess.getMoneyAmount(10));

    }

    @Test
    public void test376() {

        Wiggle_Subsequence_376 wiggle = new Wiggle_Subsequence_376();
        System.out.println(wiggle.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
        System.out.println(wiggle.wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}));
        System.out.println(wiggle.wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(wiggle.wiggleMaxLength(new int[]{0, 0}));
    }

    @Test

    public void test377() {
        Combination_Sum_IV_377 comb = new Combination_Sum_IV_377();
        System.out.println(comb.combinationSum4(new int[]{1, 2, 3}, 4));
        System.out.println(comb.combinationSum4(new int[]{1, 2, 3}, 32));
    }

    @Test
    public void test378() {
        Kth_Smallest_Element_in_a_Sorted_Matrix_378 kth = new Kth_Smallest_Element_in_a_Sorted_Matrix_378();
//        System.out.println(kth.kthSmallest(new int[][]{{1,3,5},{6,7,12},{11,14,14}},6));
        System.out.println(kth.kthSmallest(new int[][]{{-5}}, 1));
    }


    @Test
    public void test384() {
        Shuffle_an_Array_384 shuffle = new Shuffle_an_Array_384(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(shuffle.shuffle()));
//        System.out.println(Arrays.toString(shuffle.reset()));
//        System.out.println(Arrays.toString(shuffle.shuffle()));
    }

    @Test
    public void test367() {
        Valid_Perfect_Square_367 valid = new Valid_Perfect_Square_367();
        System.out.println(valid.isPerfectSquare(15));
        System.out.println(valid.isPerfectSquare(16));
        System.out.println(valid.isPerfectSquare(14));
        System.out.println(valid.isPerfectSquare(9));
        System.out.println(valid.isPerfectSquare(2147483647));

    }
}
