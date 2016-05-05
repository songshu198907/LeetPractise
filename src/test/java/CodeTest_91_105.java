import algorithm.NodeListBuilder;
import algorithm.leet_91_105.DecodeWays_91;
import algorithm.leet_91_105.ReverseLinkedListII_92;
import org.junit.Test;

/**
 * Created by shu on 5/4/2016.
 */
public class CodeTest_91_105 {
    @Test
    public void test91() {
        DecodeWays_91 decode = new DecodeWays_91();
        System.out.println(decode.numDecodings("123545612"));
    }
    @Test
    public void test92() {
        ReverseLinkedListII_92 reverse = new ReverseLinkedListII_92();
        reverse.reverseBetween(NodeListBuilder.BuildList(new int[]{1,2,3}),2,3).print();
    }
}
