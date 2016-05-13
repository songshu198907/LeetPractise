package algorithm.leet_121_135;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shu on 5/13/2016.
 */
public class PalindromePartitioningII_132 {
    private int cut = 0;
    private boolean found = false;

    public int minCut(String s) {
        cut = 0;
        if (checkPalindrome(s)) {
            return 0;
        }
        Set words = new HashSet<>();
        words.add(s);
        helper(new HashSet<>(), words);
        return cut;
    }

    private void helper(Set<String> used, Set<String> words) {

        Set<String> layers = new HashSet<>();
        Set<String> current = new HashSet<>();
        for (String word : words) {
            String remaining = "";
            for (int i = 1; i <= word.length(); i++) {
                remaining = word.substring(i);
                if (!used.contains(remaining)) {
                    if (checkPalindrome(word.substring(0, i))) {
                        layers.add(remaining);
                        current.add(remaining);
                        if (checkPalindrome(remaining)) {
                            found = true;
                            cut++;
                            return;
                        }
                    }


                }


            }

        }
        cut++;
        if (!found) {
            used.addAll(layers);
            helper(used, current);
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

    int minCut2(String s) {
        int len = s.length();
        int[] d = new int[len + 1];
        boolean[][] P = new boolean[len][len];
        //the worst case is cutting by each char
        for (int i = 0; i <= len; i++)
            d[i] = len - i;

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || P[i + 1][j - 1])) {
                    P[i][j] = true;
                    d[i] = Math.min(d[i], d[j + 1] + 1);
                }
            }
        }
        return d[0] - 1;
    }
}
