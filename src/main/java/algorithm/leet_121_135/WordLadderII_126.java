package algorithm.leet_121_135;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by songheng on 5/11/16.
 */
public class WordLadderII_126 {
    private boolean found = false;
    private List<List<String>> results = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {

        if (!wordList.isEmpty() && !beginWord.isEmpty() && !endWord.isEmpty()) {
            List<String> cur = new ArrayList<>();
            cur.add(beginWord);
            List<List<String>> tmp = new ArrayList<>();
            List<String> start = new ArrayList<>();
            start.add(beginWord);
            tmp.add(start);
            helper(endWord, wordList, cur, tmp);
        }

        return results;
    }

    private void helper(String endWord, Set<String> set, List<String> prev, List<List<String>> lists) {
        boolean con = false;
        List<List<String>> current = new ArrayList<>();
        List<String> front = new ArrayList<>();
        for (int i = 0; i < prev.size(); i++) {
            if (changable(prev.get(i), endWord)) {
                found = true;
                List<String> list = lists.get(i);
                list.add(endWord);
                results.add(list);
            } else {
                if (!found) {
                    for (String s : set) {
                        if (!lists.get(i).contains(s) && changable(s, prev.get(i))) {
                            con = true;
                            front.add(s);
                            List<String> list = new ArrayList<>(lists.get(i));
                            list.add(s);
                            current.add(list);
                        }
                    }
                }

            }
        }
        prev = null;
        lists = null;

        if (!found && con) {
            helper(endWord, set, front, current);
        }
        return;
    }

    public boolean changable(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (count > 1) {
                break;
            }
            if (a.charAt(i) != b.charAt(i))
                count++;
        }
        return count <= 1;
    }
}
