package algorithm.leet_321_350;

import java.util.*;

/**
 * Created by songheng on 8/19/16.
 */
public class Palindrome_Pairs_336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> lists = new ArrayList<>();
        if (words == null || words.length < 2) return lists;
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
            set.add(words[i].length());
        }
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverse = new StringBuilder(word).reverse().toString();
            if (map.containsKey(reverse) && map.get(reverse) != i) {
                List<Integer> list = new ArrayList<>();
                list.add(map.get(reverse));
                list.add(i);
                lists.add(list);
            }
            for (int len : set) {
                if (len >= word.length()) break;
                if (isValidate(reverse, 0, reverse.length() - 1 - len) && map.containsKey(reverse.substring(reverse.length() - len))) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(map.get(reverse.substring(reverse.length() - len)));
                    lists.add(list);
                }
                if (isValidate(reverse, len, reverse.length() - 1) &&
                        map.containsKey(reverse.substring(0, len))) {
                    List<Integer> list = new ArrayList<>();
                    list.add(map.get(reverse.substring(0, len)));
                    list.add(i);
                    lists.add(list);
                }
            }
        }
        return lists;
    }

    private boolean isValidate(String word, int begin, int end) {
        while (begin < end) {
            if (word.charAt(begin++) != word.charAt(end--)) {
                return false;
            }
        }
        return true;
    }


}
