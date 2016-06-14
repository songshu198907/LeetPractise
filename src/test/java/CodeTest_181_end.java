import algorithm.NodeListBuilder;
import algorithm.String2CharArray;
import algorithm.TreeBuilder;
import algorithm.leet_181_end.*;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by songheng on 5/19/16.
 */
public class CodeTest_181_end {
    @Test
    public void test187() throws IOException {
        Repeated_DNA_Sequences_187 rp = new Repeated_DNA_Sequences_187();
        System.out.println(rp.findRepeatedDnaSequences2("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(rp.findRepeatedDnaSequences2(org.apache.commons.io.IOUtils.toString(getClass().getClassLoader().getResourceAsStream("word.csv"))));

    }

    @Test
    public void test189() {
        Rotate_Array_189 rotate = new Rotate_Array_189();
        int[] a = new int[]{
                1, 2
        };
        rotate.rotate(a, 1);
        System.out.println(Arrays.toString(a));
        System.out.println(converter(1000000000));
        System.out.println(converter(11));
        System.out.println(converter(101));
    }

    @Test
    public void test190() {
        Reverse_Bits_190 reverse = new Reverse_Bits_190();
        System.out.println(reverse.reverseBits(43261596));
    }

    @Test
    public void test191() {
        Number_of_1_Bits_191 no = new Number_of_1_Bits_191();
        System.out.println(no.hammingWeight(11));

    }

    @Test
    public void test198() {

        House_Robber_198 robber = new House_Robber_198();
        System.out.println(robber.rob(new int[]{
                2, 1, 1, 2
        }));
    }

    @Test
    public void test200() {

        Number_of_Islands_200 number = new Number_of_Islands_200();
        System.out.println(number.numIslands(String2CharArray.convert(new String[]{
                "11110", "11010", "11000", "00000"
        })));
        System.out.println(number.numIslands(String2CharArray.convert(new String[]{
                "11000", "11000", "00100", "00011"
        })));

    }

    @Test
    public void test201() {
        Bitwise_AND_of_Numbers_Range_201 bit = new Bitwise_AND_of_Numbers_Range_201();
        System.out.println(bit.rangeBitwiseAnd(10, 11));
        System.out.println(bit.rangeBitwiseAnd(600000000,
                2147483645));
        System.out.println(bit.rangeBitwiseAnd(3,
                5));
        System.out.println(bit.rangeBitwiseAnd(1,
                100));
        System.out.println(bit.rangeBitwiseAnd(5,
                7));
        System.out.println(bit.rangeBitwiseAnd(9,
                10));

    }

    @Test
    public void test202() {
        Happy_Number_202 happy = new Happy_Number_202();
        System.out.println(happy.isHappy(4));
        System.out.println(happy.isHappy(5));
    }

    @Test
    public void test203() {
        Remove_Linked_List_Elements_203 remove = new Remove_Linked_List_Elements_203();
        System.out.println(remove.removeElements(NodeListBuilder.BuildList(new int[]{1, 1}), 1));
    }

    @Test
    public void test205() {
        Isomorphic_Strings_205 iso = new Isomorphic_Strings_205();
//        System.out.println(iso.isIsomorphic("ab","aa"));
        System.out.println(iso.isIsomorphic("aa", "bb"));
    }

    @Test
    public void test206() {
        Reverse_Linked_List_206 reverse = new Reverse_Linked_List_206();
        System.out.println(reverse.reverseList2(NodeListBuilder.BuildList(new int[]{1})));
    }

    @Test
    public void test208() {
        Trie trie = new Trie();
        trie.insert("ab");
        System.out.println(trie.search("abc"));
        System.out.println(trie.search("ab"));
        System.out.println(trie.startsWith("abc"));
        System.out.println(trie.startsWith("ab"));
        trie.insert("ab");
        System.out.println(trie.search("abc"));
        System.out.println(trie.startsWith("abc"));
        trie.insert("abc");
        System.out.println(trie.search("abc"));
        System.out.println(trie.startsWith("abc"));
    }

    @Test
    public void test212(){
        Word_Search_II_212 word = new Word_Search_II_212();
        System.out.println(word.findWords(String2CharArray.convert(new String[]{"oaan","etae","ihkr","iflv"}),new String[]{"oath","pea","eat","rain"}) );
    }
    int converter(int binary) {
        int res = 0;
        int base = 1;
        while (binary > 0) {
            int dig = binary % 10;
            res = res + dig * base;
            base = base << 1;
            binary = binary / 10;
        }
        return res;
    }

    @Test
    public void test214() {
        Shortest_Palindrome_214 shortest = new Shortest_Palindrome_214();
//        System.out.println(shortest.shortestPalindrome2("aacecaaa"));
//        System.out.println(shortest.shortestPalindrome2("abcd"));
//        System.out.println(shortest.shortestPalindrome2("ba"));
        System.out.println(shortest.shortestPalindrome2("aa"));
        System.out.println(shortest.shortestPalindrome2("aba"));

    }

    @Test
    public void test215() {
        Kth_Largest_Element_in_an_Array_215 k = new Kth_Largest_Element_in_an_Array_215();
        System.out.println(k.findKthLargest(new int[]{-1,-1},2));
    }

    @Test
    public void test216() {
        Combination_Sum_III_216 comb = new Combination_Sum_III_216();
//        System.out.println(comb.combinationSum3(2,18));
        System.out.println(comb.combinationSum3(2, 6));
    }

    @Test
    public void test217() {
        Contains_Duplicate_217 contains = new Contains_Duplicate_217();
    }

    @Test
    public void test218() {
        The_Skyline_Problem_218_2 skyline = new The_Skyline_Problem_218_2();
//
//      skyline.getSkyline(new int[][]{{0,2147483647,2147483647}}).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));
        skyline.getSkyline(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}}).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));
//        skyline.getSkyline(new int[][]{{1,2,1}, {1,2,2}, {1,2,3}}).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));
//        skyline.getSkyline(new int[][]{{1,230301203,2}}).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    @Test
    public void test220() {
        ContainsDuplicateIII_220 contains = new ContainsDuplicateIII_220();
        System.out.println(contains.containsNearbyAlmostDuplicate(new int[]{0, 2}, 1, 2147483647));

    }
    @Test
    public void test221(){
        Maximal_Square_221 maximal = new Maximal_Square_221();
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"10100", "10111", "11111", "10010"})));
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"11100", "11100", "11111", "01111", "01111", "01111"})));
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"01101","11010","01110","11110","11111","00000"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"0"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"1101","1101","1111"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"1"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"0110","0110"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"0110","0100"})));
//        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"01101","11010","01110","11110","11111","00000"})));
    }


    @Test
    public void test222() {
        Count_Complete_Tree_Nodes_222 count = new Count_Complete_Tree_Nodes_222();
        Object[] objects = new Object[1024];
        for (int i = 0; i < 1024; i++) {
            objects[i] = i + 1;
        }
        System.out.println(count.countNodes(TreeBuilder.build(objects)));
    }

    @Test
    public void test(){
        List<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < 100 ; i++) {
            list.add(0,i);
        }
        System.out.println(list);

    }
}
