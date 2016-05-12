package algorithm.leet_121_135;

import java.util.*;

/**
 * Created by songheng on 5/11/16.
 */
public class WordLadderII_126 {
    private boolean found = false;
    private List<List<String>> results = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {

        if (!wordList.isEmpty() && !beginWord.isEmpty() && !endWord.isEmpty()) {
            List<String> list = new ArrayList<>(wordList);
            list.add(beginWord);
            list.add(endWord);
            List<List<String>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            lists.get(0).add(beginWord);
            List<String> prev = new ArrayList<>();
            prev.add(beginWord);
            Map<String, Set<String>> map = buildMap(list);
            helper(endWord, prev, lists, map, new HashSet<>());
        }

        return results;
    }

    private void helper(String endWord, List<String> prev, List<List<String>> lists, Map<String, Set<String>> map, Set<String> visited) {
        boolean con = false;
        List<List<String>> current = new ArrayList<>();
        List<String> front = new ArrayList<>();
        List<String> layerVisit = new ArrayList<>();
        for (int i = 0; i < prev.size(); i++) {

            if (map.get(endWord).contains(prev.get(i))) {
                found = true;
                List<String> list = lists.get(i);
                list.add(endWord);
                results.add(list);
            } else {
                if (!found) {
                    Set<String> set = map.get(prev.get(i));
                    for (String s : set) {
                        if (!lists.get(i).contains(s) && !visited.contains(s)) {
                            con = true;
                            layerVisit.add(s);
                            front.add(s);
                            List<String> list = new ArrayList<>(lists.get(i));
                            list.add(s);
                            current.add(list);

                        }
                    }

                }

            }
        }
        visited.addAll(layerVisit);

        prev = null;
        lists = null;

        if (!found && con) {
            helper(endWord, front, current, map, visited);
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

    private Map<String, Set<String>> buildMap(List<String> wordList) {
        Map<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (changable(wordList.get(i), wordList.get(j))) {
                    if (!map.containsKey(wordList.get(i))) {
                        map.put(wordList.get(i), new HashSet<>());
                    }
                    if (!map.containsKey(wordList.get(j))) {
                        map.put(wordList.get(j), new HashSet<>());
                    }
                    map.get(wordList.get(i)).add(wordList.get(j));
                    map.get(wordList.get(j)).add(wordList.get(i));
                }
            }
        }
        return map;
    }
}
