import algorithm.NodeListBuilder;
import algorithm.String2CharArray;
import algorithm.TreeBuilder;
import algorithm.TreeNode;
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
    public void test212() {
        Word_Search_II_212 word = new Word_Search_II_212();
        System.out.println(word.findWords(String2CharArray.convert(new String[]{"oaan", "etae", "ihkr", "iflv"}), new String[]{"oath", "pea", "eat", "rain"}));
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
        System.out.println(k.findKthLargest(new int[]{-1, -1}, 2));
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
    public void test221() {
        Maximal_Square_221 maximal = new Maximal_Square_221();
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"10100", "10111", "11111", "10010"})));
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"11100", "11100", "11111", "01111", "01111", "01111"})));
        System.out.println(maximal.maximalSquare(String2CharArray.convert(new String[]{"01101", "11010", "01110", "11110", "11111", "00000"})));
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
    public void test223() {
        Rectangle_Area_223 rect = new Rectangle_Area_223();
        System.out.println(rect.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        System.out.println(rect.computeArea(0, 0, 0, 0, -1, -1, 1, 1));
        System.out.println(rect.computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
        System.out.println(rect.computeArea(-2, -2, 2, 2, -3, -3, 3, -1));
    }

    @Test
    public void test224() {
        Basic_Calculator_224 basic = new Basic_Calculator_224();
        System.out.println(basic.calculate("1 + 1"));
        System.out.println(basic.calculate("2-1 + 2"));
        System.out.println(basic.calculate("(1+(4+5+2)-3)+(6+8)"));
        System.out.println(basic.calculate("   (  3 ) "));
    }

    @Test
    public void test227() {
        Basic_Calculator_II_227 base = new Basic_Calculator_II_227();
//        System.out.println(base.calculate("3+2*2"));
//        System.out.println(base.calculate(" 3/2 "));
//        System.out.println(base.calculate(" 3+5 / 2 "));
        System.out.println(base.calculate("0-2147483647"));
    }

    @Test
    public void test() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }
        System.out.println(list);

    }

    @Test
    public void test230() {
        Kth_Smallest_Element_in_a_BST_230 kth = new Kth_Smallest_Element_in_a_BST_230();
//        System.out.println(kth.kthSmallest(TreeBuilder.build(new Object[]{1, null, 2}), 2));
        System.out.println(kth.kthSmallest(TreeBuilder.build(new Object[]{2, 1}), 1));
    }

    @Test
    public void test231() {
        Power_of_Two_231 power = new Power_of_Two_231();
        System.out.println(power.isPowerOfTwo(4));
        System.out.println(power.isPowerOfTwo(1));
        System.out.println(power.isPowerOfTwo(3));
    }

    @Test
    public void test234() {
        Palindrome_Linked_List_234 palind = new Palindrome_Linked_List_234();
        System.out.println(palind.isPalindrome(NodeListBuilder.BuildList(new int[]{-16557, -8725, -29125, 28873, -21702, 15483, -28441, -17845, -4317, -10914, -10914, -4317, -17845, -28441, 15483, -21702, 28873, -29125, -8725, -16557})));

    }

    @Test
    public void test236() {
        LowestCommonAncestorOfBT_236 lowest = new LowestCommonAncestorOfBT_236();
        lowest.lowestCommonAncestor(TreeBuilder.build(new Object[]{37, -34, -48, null, -100, -100, 48, null, null, null, null, -54, null, -71, -22, null, null, null, 8}), new TreeNode(-100), new TreeNode(-100)).print();
    }

    @Test
    public void test239() {
        Sliding_Window_Maximum_239 sliding = new Sliding_Window_Maximum_239();
        System.out.println(Arrays.toString(sliding.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(sliding.maxSlidingWindow(new int[]{1, -1}, 1)));
    }

    @Test
    public void test241() {
        DifferentWaystoAddParentheses_241 diff = new DifferentWaystoAddParentheses_241();
        System.out.println(diff.diffWaysToCompute("2*3-4*5"));
    }

    @Test
    public void test260() {
        SingleNumberIII_260 single = new SingleNumberIII_260();
        System.out.println(Arrays.toString(single.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    @Test
    public void test263() {
        UglyNumber_263 ugly = new UglyNumber_263();
        System.out.println(ugly.isUgly(2));
        System.out.println(ugly.isUgly(6));
        System.out.println(ugly.isUgly(8));
        System.out.println(ugly.isUgly(14));
        System.out.println(ugly.isUgly(1468));
    }

    @Test
    public void test264() {
        UglyNumberII_264 ugly = new UglyNumberII_264();
        System.out.println(ugly.nthUglyNumber(10));
    }

    @Test
    public void test269() {
        Alien_Directory_269 alien = new Alien_Directory_269();
        System.out.println(alien.alienOrder(new String[]{
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"}));
        Alien_Directory_269_3 alien3 = new Alien_Directory_269_3();
        System.out.println(alien.alienOrder(new String[]{
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"}));
//        Alien_Directory_269_2 alien2 = new Alien_Directory_269_2();
//        System.out.println(alien2.alienOrder(new String[]{ "abc",
//                "abb","acb"}));
    }

    @Test
    public void test273() {
        IntegertoEnglishWords_273 inte = new IntegertoEnglishWords_273();
        System.out.println(inte.numberToWords(123));
        System.out.println(inte.numberToWords(12345));
        System.out.println(inte.numberToWords(1234567));
        System.out.println(inte.numberToWords(100));
    }

    @Test
    public void test278() {
        int n = 2126753390;
        First_Bad_Version_278 first = new First_Bad_Version_278();
        System.out.println(first.firstBadVersion(n));

    }

    @Test
    public void test279() {
        Perfect_Squares_279 perfect = new Perfect_Squares_279();
        System.out.println(perfect.numSquares(49));
        System.out.println(perfect.numSquares(12));
        System.out.println(perfect.numSquares(13));
    }

    @Test
    public void test287() {
        Find_the_Duplicate_Number_287 find = new Find_the_Duplicate_Number_287();
        System.out.println(find.findDuplicate(new int[]{1, 2, 3, 2}));
        System.out.println(find.findDuplicate(new int[]{1, 1, 1, 3, 2}));
    }

    @Test
    public void test291() {
        Word_Pattern_II_291 word = new Word_Pattern_II_291();
        System.out.println(word.wordPatternMatch("abab", "redblueredblue"));
        System.out.println(word.wordPatternMatch("aaaa", "asdasdasdasd"));
        System.out.println(word.wordPatternMatch("aabb", "xyzabcxzyabc"));
    }

    @Test
    public void test293() {
        Flip_Game_293 flip = new Flip_Game_293();
        System.out.println(flip.generatePossibleNextMoves("++++"));
    }

    @Test
    public void test294() {
        Flip_Game_294 flip = new Flip_Game_294();
        System.out.println(flip.canWin("+++++"));
    }

    @Test
    public void test295() {
        Serialize_and_Deserialize_Binary_Tree_297 sd = new Serialize_and_Deserialize_Binary_Tree_297();
        System.out.println(sd.serialize(TreeBuilder.build(new Object[]{1, 2, 3, null, null, 4, 5})));
        TreeNode node = TreeBuilder.build(new Object[]{1, 2, 3, null, null, 4, 5});
        TreeNode second = sd.deserialize(sd.serialize(node));
        node.print();
        second.print();
    }

    @Test
    public void test296() {
        Best_Meeting_Point_296 best = new Best_Meeting_Point_296();
        System.out.println(best.minTotalDistance(new int[][]{{1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}}));
    }

    @Test
    public void test298() {
        Binary_Tree_Longest_Consecutive_Sequence_298 longest = new Binary_Tree_Longest_Consecutive_Sequence_298();
        TreeNode node = TreeBuilder.build(new Object[]{1, null, 3, 2, 4, null, null, null, 5});
        System.out.println(longest.longestConsecutive(node));
        System.out.println(longest.longestConsecutive(TreeBuilder.build(new Object[]{2, null, 3, 2, null, 1, null})));
    }

    @Test
    public void test299() {
        Bulls_and_Cows_299 bull = new Bulls_and_Cows_299();
        System.out.println(bull.getHint("1807", "7810"));
    }

    @Test
    public void test300() {
        Longest_Increasing_Subsequence_300 longest = new Longest_Increasing_Subsequence_300();
        System.out.println(longest.lengthOfLIS(new int[]{
                10, 9, 2, 5, 3, 7, 101, 18
        }));
        System.out.println(longest.lengthOfLIS(new int[]{
                10, 9, 2, 5, 8, 4, 101, 18
        }));
    }

    @Test
//    public void test307(){
//        Range_Sum_Query_Mutable_307 range = new Range_Sum_Query_Mutable_307(new int[]{1,2,3,4,5,6,7,8,9,10});
//        System.out.println(range.sumRange(3,7));
//        range.update(5,11);
//        System.out.println(range.sumRange(3,7));}
    public void test301() {
        Remove_Invalid_Parentheses_301 rm = new Remove_Invalid_Parentheses_301();
        System.out.println(rm.removeInvalidParentheses("()())()"));

    }

    @Test
    public void test306() {
        Additive_Number_306 add = new Additive_Number_306();
        System.out.println(add.isAdditiveNumber("221474836472147483649"));
        System.out.println(add.isAdditiveNumber("112358"));
        System.out.println(add.isAdditiveNumber("199100199"));
        System.out.println(add.isAdditiveNumber("0122"));
        System.out.println(add.isAdditiveNumber("0112"));
        System.out.println(add.isAdditiveNumber("0000"));
        System.out.println(add.isAdditiveNumber("123"));
    }

    @Test
    public void test310() {

        Minimum_Height_Trees_310 min = new Minimum_Height_Trees_310();
//        System.out.println( min.findMinHeightTrees(6, new int[][]{{0,3},{1,3},{2,3},{4,3},{5,4}}));
//        System.out.println( min.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}}));
//        System.out.println( min.findMinHeightTrees(2, new int[][]{{1,0}}));
        System.out.println(min.findMinHeightTrees(7, new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}}));


    }

    @Test
    public void test311() {
        Sparse_Matrix_Multiplication_311 sparse = new Sparse_Matrix_Multiplication_311();
        int[][] abc = sparse.multiply(new int[][]{{1, 0, 0}, {-1, 0, 3}}, new int[][]{{7, 0, 0}, {0, 0, 0}, {0, 0, 1}});
        for (int[] a : abc)
            System.out.println(Arrays.toString(a));
    }

    @Test
    public void test312() {
        Burst_Balloons_312 burst = new Burst_Balloons_312();
        System.out.println(burst.maxCoins(new int[]{3, 1, 5, 8}));
//        System.out.println(burst.maxCoins(new int[]{2,4,1,6,8,3}));
//        System.out.println(burst.maxCoins(new int[]{35,16,83,87,84,59,48,41}));
    }

    @Test
    public void test313() {
        SuperUglyNumber_313 su = new SuperUglyNumber_313();
//        System.out.println(su.nthSuperUglyNumber(100000, new int[]{2, 3, 5}));
//        System.out.println(su.nthSuperUglyNumber(100000,new int[]{7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251}));
    }

    @Test
    public void test315() {
        Count_of_Smaller_Numbers_After_Self_315_2 counter = new Count_of_Smaller_Numbers_After_Self_315_2();
        System.out.println(counter.countSmaller(new int[]{5, 4, 3, 2, 1}));
//        System.out.println(counter.countSmaller(new int [] {5,4,4,2,1}));
    }

    @Test
    public void test316() {
        Remove_Duplicate_Letters_316 rm = new Remove_Duplicate_Letters_316();
//        System.out.println(rm.removeDuplicateLetters("bcabc"));
//        System.out.println(rm.removeDuplicateLetters("cbacdcbc"));
        System.out.println(Remove_Duplicate_Letters_316.removeDuplicateLetters("baa"));
    }

}
