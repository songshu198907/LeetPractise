import algorithm.NodeListBuilder;
import algorithm.leet_91_105.*;
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
        reverse.reverseBetween(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4}), 1, 3).print();
    }

    @Test
    public void test93() {
        RestoreIPAddresses_93 restore = new RestoreIPAddresses_93();
//        System.out.println(restore.restoreIpAddresses("25525511135"));
//        System.out.println(restore.restoreIpAddresses("0000"));
        System.out.println(restore.restoreIpAddresses("010010"));
    }

    @Test
    public void test95() {
        UniqueBinarySearchTreesII_95 unique = new UniqueBinarySearchTreesII_95();
        unique.generateTrees(8);
    }

    @Test
    public void test96() {
        UniqueBinarySearchTrees_96 unique = new UniqueBinarySearchTrees_96();
        System.out.println(unique.numTrees(1));
    }
    @Test
    public void test97(){
        InterleavingString_97 inteleave = new InterleavingString_97();
        System.out.println(inteleave.isInterleave("aaaa", "aaab", "aaaabaaa"));
    }
}
