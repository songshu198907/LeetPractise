import algorithm.leet_351_365.Count_Numbers_with_Unique_Digits_357;
import algorithm.leet_351_365.Russian_Doll_Envelopes_354;
import algorithm.leet_351_365.Twitter;
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

}
