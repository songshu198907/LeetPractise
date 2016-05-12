package algorithm.leet_121_135;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by songheng on 5/12/16.
 */
public class WordLadder_127 {
    private int shortest = 0;
    private boolean found = false;

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> set = new HashSet<>();
        set.add(beginWord);
        wordList.add(endWord);
        helper(set, endWord, wordList);
        return shortest;
    }

    private void helper(Set<String> words, String endWord, Set<String> dic) {
        Set<String> current = new HashSet<>();
        boolean con = false;
        for (String word : words) {
            if (word.equals(endWord)) {
                return;
            } else {
                if (!found) {
                    List<String> next = getNextWords(word, dic);
                    current.addAll(next);
                    if (!next.isEmpty()) {
                        if (shortest == 0) {
                            shortest = 1;
                        }
                        con = true;
                    }
                }
            }
        }
        dic.removeAll(current);

        if (con) {
            ++shortest;
            helper(current, endWord, dic);
        }


    }

    private List<String> buildNext(String word, Set<String> dic) {
        List<String> list = new ArrayList<>();
        for (String s : dic) {
            if (changable(word, s)) {
                list.add(s);
            }
        }
        return list;
    }

    private boolean changable(String a, String b) {
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

    private String replace(String s, int index, char c) {
        char[] chars = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }

    private ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)) {
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }
}
