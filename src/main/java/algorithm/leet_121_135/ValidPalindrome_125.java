package algorithm.leet_121_135;

/**
 * Created by songheng on 5/11/16.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start <= end) {
            while (!Character.isAlphabetic(chars[start]) && !Character.isDigit(chars[start])) {
                start++;
                if (start > end) {
                    break;
                }
            }
            while (!Character.isAlphabetic(chars[end]) && !Character.isDigit(chars[end])) {
                end--;
                if (start > end) {
                    break;
                }
            }
            if (start > end) break;
            if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
