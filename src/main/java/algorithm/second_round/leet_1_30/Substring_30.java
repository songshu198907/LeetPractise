package algorithm.second_round.leet_1_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by songheng on 10/11/16.
 */
public class Substring_30 {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> res = new ArrayList<>();
        if (words == null || words.length == 0 || s.length() == 0) return res;
        int wordLen = words[0].length();
        int numWord = words.length;
        int windowLen = wordLen * numWord;
        int sLen = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);

        for (int i = 0; i < wordLen; i++) {  // Run wordLen scans
            HashMap<String, Integer> curMap = new HashMap<>();
            for (int j = i, count = 0, start = i; j + wordLen <= sLen; j += wordLen) {  // Move window in step of wordLen
                // count: number of exceeded occurences in current window
                // start: start index of current window of size windowLen
                if (start + windowLen > sLen) break;
                String word = s.substring(j, j + wordLen);
                if (!map.containsKey(word)) {
                    curMap.clear();
                    count = 0;
                    start = j + wordLen;
                } else {
                    if (j == start + windowLen) { // Remove previous word of current window
                        String preWord = s.substring(start, start + wordLen);
                        start += wordLen;
                        int val = curMap.get(preWord);
                        if (val == 1) curMap.remove(preWord);
                        else curMap.put(preWord, val - 1);
                        if (val - 1 >= map.get(preWord)) count--;  // Reduce count of exceeded word
                    }
                    // Add new word
                    curMap.put(word, curMap.getOrDefault(word, 0) + 1);
                    if (curMap.get(word) > map.get(word)) count++;  // More than expected, increase count
                    // Check if current window valid
                    if (count == 0 && start + windowLen == j + wordLen) {
                        res.add(start);
                    }
                }
            }
        }
        return res;
    }

    public List<Integer> findSubstring2(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s.isEmpty() || words == null || words.length == 0) return res;
        int wordLen = words[0].length();
        int windowLen = wordLen * words.length;
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (int i = 0; i < wordLen; i++) {
            HashMap<String, Integer> curMap = new HashMap<>();
            for (int j = i, count = 0, start = i; j + wordLen <= s.length(); j += wordLen) {
                if (start + windowLen > s.length()) break;
                String word = s.substring(j, j + wordLen);
                if (!map.containsKey(word)) {
                    count = 0;
                    curMap.clear();
                    start = j + wordLen;
                } else {
                    if (start + windowLen == j) {
                        String pre = s.substring(start, start + wordLen);
                        int val = curMap.get(pre);
                        if (val == 1) curMap.remove(pre);
                        else curMap.put(pre, val - 1);
                        if (val > map.get(pre)) count--;
                        start += wordLen;
                    }
                    curMap.put(word, curMap.getOrDefault(word, 0) + 1);
                    if (curMap.get(word) > map.get(word)) count++;
                    if (count == 0 && j + wordLen == start + windowLen) res.add(start);

                }
            }
        }

        return res;
    }
}
