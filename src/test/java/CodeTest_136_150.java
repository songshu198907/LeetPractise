import algorithm.leet_136_150.WordBreak_139;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by shu on 5/13/2016.
 */
public class CodeTest_136_150 {
    @Test
    public void test139() {
        WordBreak_139 word = new WordBreak_139();
        System.out.println(word.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new HashSet<>(Arrays.asList(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"}))));
        System.out.println(word.wordBreak("leetcode", new HashSet<>(Arrays.asList(new String[]{"leet", "code"}))));
    }
}
