import algorithm.leet_351_365.Count_Numbers_with_Unique_Digits_357;
import algorithm.leet_351_365.Russian_Doll_Envelopes_354;
import algorithm.leet_351_365.Super_Pow_372;
import algorithm.leet_351_365.Twitter;
import algorithm.leet_370_end.Combination_Sum_IV_377;
import algorithm.leet_370_end.Guess_Number_Higher_or_Lower_374;
import algorithm.leet_370_end.Guess_Number_Higher_or_Lower_II_375;
import algorithm.leet_370_end.Wiggle_Subsequence_376;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

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
//        System.out.println(comb.combinationSum4(new int[]{1,2,3},32));
    }
}
