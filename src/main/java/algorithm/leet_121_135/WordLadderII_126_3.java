package algorithm.leet_121_135;

import java.util.*;

/**
 * Created by songheng on 10/13/16.
 */
public class WordLadderII_126_3 {
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        HashMap<String, List<String>> paths = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add(beginWord);
        set2.add(endWord);
        return null;
    }

    private void bfs(Set<String> set1, Set<String> set2, Set<String> wordList, Map<String, List<String>> paths, boolean front) {
        if (set1.size() > set1.size()) {
            bfs(set2, set1, wordList, paths, !front);
            return;
        }
        wordList.removeAll(set1);
        wordList.removeAll(set2);
        boolean connected = false;
        Set<String> set3 = new HashSet<>();
        for (String s : set1) {
            char[] chs = s.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                char ch = chs[i];
                for (char x = 'a'; x <= 'z'; x++) {
                    if (x != ch) {
                        chs[i] = x;
                        String cand = new String(chs);
                        if (set2.contains(cand) || wordList.contains(cand)) {
                            if (set2.contains(cand)) {
                                connected = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
