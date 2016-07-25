import algorithm.leet_181_320.kiki_game;
import org.junit.Test;

/**
 * Created by shu on 7/12/2016.
 */
public class OtherTest {
    @Test
    public void testForKiki() {
        kiki_game kiki = new kiki_game();
        System.out.println(kiki.check(5, 3));
        System.out.println(kiki.check(5, 4));
        System.out.println(kiki.check(6, 6));
        System.out.println(kiki.check(0, 0));
    }
}
