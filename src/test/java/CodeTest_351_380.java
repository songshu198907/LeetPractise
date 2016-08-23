import algorithm.leet_351_365.Russian_Doll_Envelopes_354;
import org.junit.Test;

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
}
