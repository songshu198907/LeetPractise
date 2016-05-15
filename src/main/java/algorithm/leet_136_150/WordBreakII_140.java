package algorithm.leet_136_150;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by shu on 5/14/2016.
 */
public class WordBreakII_140 {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> words = new ArrayList<>();
        List<Integer> poss = checkSplit(s, wordDict);
        if (!wordDict.isEmpty() && !poss.isEmpty() && poss.get(poss.size() - 1) == s.length()) {

            helper(words, s, "", poss, wordDict, 0, 0);
        }
        return words;
    }

    private void helper(List<String> res, String s, String prev, List<Integer> poss, Set<String> dict, int start, int pos) {
        if (pos == s.length()) {
            res.add(prev.trim());
            return;
        }
        for (int i = start; i < poss.size(); i++) {
            int end = poss.get(i);
            String word = s.substring(pos, end);
            String current = prev + " " + word;
            if (dict.contains(word))
                helper(res, s, current, poss, dict, i + 1, end);
        }


    }

    private int getMaxLength(Set<String> dict) {
        int maxLength = 0;
        for (String word : dict) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }

    private List<Integer> checkSplit(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length() + 1];
        List<Integer> pos = new ArrayList<>();
        dp[0] = true;
        int maxLen = getMaxLength(dict);
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - maxLen > 0 ? i - maxLen : 0; j < i; j++) {
                if (dp[j]) {
                    if (dict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        pos.add(i);
                        break;
                    }
                }
            }
        }
        return pos;
    }


}
