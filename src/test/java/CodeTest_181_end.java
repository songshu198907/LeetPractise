import algorithm.leet_181_end.Repeated_DNA_Sequences_187;
import org.junit.Test;

import java.io.IOException;

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
}
