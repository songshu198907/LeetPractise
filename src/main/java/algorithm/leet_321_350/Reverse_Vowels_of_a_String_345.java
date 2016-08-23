package algorithm.leet_321_350;

/**
 * Created by shu on 2016/8/19.
 */
public class Reverse_Vowels_of_a_String_345 {
    public String reverseVowels(String s) {
        if (s == null) return s;
        char[] chs = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end &&
                    !(Character.toLowerCase(chs[start]) == 'a' || Character.toLowerCase(chs[start]) == 'e' || Character.toLowerCase(chs[start]) == 'i' || Character.toLowerCase(chs[start]) == 'o' || Character.toLowerCase(chs[start]) == 'u')
                    ) start++;

            while (start < end &&
                    !(Character.toLowerCase(chs[end]) == 'a' || Character.toLowerCase(chs[end]) == 'e' || Character.toLowerCase(chs[end]) == 'i' || Character.toLowerCase(chs[end]) == 'o' || Character.toLowerCase(chs[end]) == 'u')
                    ) end--;
            if (start < end) {
                char tmp = chs[start];
                chs[start] = chs[end];
                chs[end] = tmp;
                start++;
                end--;
            }
        }

        return new String(chs);
    }
}
