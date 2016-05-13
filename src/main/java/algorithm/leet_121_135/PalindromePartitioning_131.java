package algorithm.leet_121_135;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 5/12/2016.
 */
public class PalindromePartitioning_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        helper(lists, new ArrayList<>(), s);
        return lists;
    }

    private void helper(List<List<String>> lists, List<String> prev, String remaining) {

        if (remaining.isEmpty()) {
            lists.add(prev);
        }
        for (int i = 1; i <= remaining.length(); i++) {
            if (checkPalindrome(remaining.substring(0, i))) {
                List<String> current = new ArrayList<>(prev);
                current.add(remaining.substring(0, i));

                helper(lists, current, i == remaining.length() ? "" : remaining.substring(i));
            }
        }

    }

    public boolean checkPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
