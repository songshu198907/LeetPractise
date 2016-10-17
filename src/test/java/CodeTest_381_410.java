import algorithm.leet_370_end.*;
import org.junit.Test;

/**
 * Created by songheng on 9/27/16.
 */
public class CodeTest_381_410 {
    @Test
    public void test385() {
        Mini_Parser_385 parser = new Mini_Parser_385();
//        System.out.println(parser.deserialize("[123,[456,[789]]]"));
//        System.out.println(parser.deserialize("123456"));
//        System.out.println(parser.deserialize("[]"));
        System.out.println(parser.deserialize("[123,456,[788,799,833],[[]],10,[]]"));
    }

    @Test
    public void test388() {
        Longest_Absolute_File_Path_388 longest = new Longest_Absolute_File_Path_388();
        System.out.println(longest.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
        System.out.println(longest.lengthLongestPath("dir\n        file.txt"));
    }

    @Test
    public void test390() {
        EliminationGame_390 eli = new EliminationGame_390();
        System.out.println(eli.lastRemaining(10));
    }

    @Test
    public void test391() {
        Perfect_Rectangle_391 perfect = new Perfect_Rectangle_391();
//        System.out.println(perfect.isRectangleCover(new int[][]{
//                {1,1,2,3},{1,3,2,4},{3,1,4,2},{3,2,4,4}
//                }
//        ));
        System.out.println(perfect.isRectangleCover(new int[][]{
                        {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {3, 2, 4, 4}
                }
        ));
        System.out.println(perfect.isRectangleCover(new int[][]{
                        {1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}
                }
        ));
    }

    @Test
    public void test393() {
        UTF8_Validation_393 utf = new UTF8_Validation_393();
//        System.out.println(utf.validUtf8(new int[]{197,130,1}));
//        System.out.println(utf.validUtf8(new int[]{240,162,138,147,145}));
        System.out.println(utf.validUtf8(new int[]{145}));
    }

    @Test
    public void test394() {
        DecodeString_394 decoding = new DecodeString_394();
        System.out.println(decoding.decodeString("3[a]2[bc]"));
        System.out.println(decoding.decodeString("3[a2[c]]"));
        System.out.println(decoding.decodeString("2[abc]3[cd]ef"));

    }

    @Test
    public void test395() {
        LongestSubstring_395 longest = new LongestSubstring_395();
//        System.out.println(longest.longestSubstring("aaabb", 3));
//        System.out.println(longest.longestSubstring("aaabbb", 3));
//        System.out.println(longest.longestSubstring("ababbc", 2));
//        System.out.println(longest.longestSubstring("ababacb",   3));
//        System.out.println(longest.longestSubstring("aaabbbcdefcdefcde",   3));
        System.out.println(longest.longestSubstring("zzzzzzzzzzaaaaaaaaabbbbbbbbhbhbhbhbhbhbhicbcbcibcbccccccccccbbbbbbbbaaaaaaaaafffaahhhhhiaahiiiiiiiiifeeeeeeeeee"
                , 10));
//        System.out.println(longest.longestSubstring("aaabbbcdefcdefgggggggggggggggcde",
//                3));
    }

    @Test
    public void test397() {
        IntegerReplacement_397 replacement = new IntegerReplacement_397();
        System.out.println(replacement.integerReplacement(8));
        System.out.println(replacement.integerReplacement(7));
        System.out.println(replacement.integerReplacement(1000));
        System.out.println(replacement.integerReplacement(2147483647));

    }

    @Test
    public void test402() {
        Remove_K_Digits_402 remove = new Remove_K_Digits_402();
        System.out.println(remove.removeKdigits("1432219", 3));
        System.out.println(remove.removeKdigits("10200", 1));
        System.out.println(remove.removeKdigits("10", 2));

    }
}
