import algorithm.leet_181_end.Number_of_1_Bits_191;
import algorithm.leet_181_end.Repeated_DNA_Sequences_187;
import algorithm.leet_181_end.Reverse_Bits_190;
import algorithm.leet_181_end.Rotate_Array_189;
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
