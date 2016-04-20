import algorithm.leet_76_90.Combinations_77;
import algorithm.leet_76_90.Minimum_Window_Substring_76;
import algorithm.leet_76_90.Subsets_78;
import org.junit.Test;

/**
 * Created by songheng on 4/18/16.
 */
public class codeTest_76_90 {
    @Test
    public void test76(){
        Minimum_Window_Substring_76 min = new Minimum_Window_Substring_76();
        System.out.println(min.minWindow("ab","b"));
        System.out.println(min.minWindow("bba","ab"));
    }
    @Test
    public void test77(){
        Combinations_77 comb = new Combinations_77();
        comb.combine(4,2).stream().forEach(System.out::println);
        comb.combine(1,1).stream().forEach(System.out::println);
    }
    @Test
    public void test78(){
        Subsets_78 subset = new Subsets_78();
        subset.subsets(new int[]{0}).stream().forEach(System.out::println);
        subset.subsets(new int[]{1,2,3}).stream().forEach(System.out::println);
    }
}
