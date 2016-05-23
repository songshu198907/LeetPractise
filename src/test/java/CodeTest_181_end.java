import algorithm.NodeListBuilder;
import algorithm.String2CharArray;
import algorithm.leet_181_end.*;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

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
}
