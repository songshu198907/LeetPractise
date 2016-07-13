package algorithm.leet_181_end;

import java.util.*;

/**
 * Created by shu on 7/11/2016.
 */
public class Alien_Directory_269_3 {
    public String alienOrder(String[] words) {
        if (words == null || words.length == 0) return "";
        HashMap<Character, Set<Character>> graphic = new HashMap<>();
        HashMap<Character, Integer> times = new HashMap<>();
        HashSet<Character> characters = new HashSet<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++)
                characters.add(word.charAt(i));
        }
        String prev = "";
        for (String word : words) {
            int len = Math.max(word.length(), prev.length());
            for (int i = 0; i < len; i++) {
                if (word.charAt(i) != prev.charAt(i)) {
                    if (graphic.containsKey(prev.charAt(i)) && graphic.get(prev.charAt(i)).contains(word.charAt(i)))
                        continue;
                    if (!graphic.containsKey(prev.charAt(i)))
                        graphic.put(prev.charAt(i), new HashSet<>());
                    graphic.get(prev.charAt(i)).add(word.charAt(i));
                    if (!times.containsKey(word.charAt(i)))
                        times.put(word.charAt(i), 1);
                    else times.put(word.charAt(i), times.get(word.charAt(i)) + 1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        for (char ch : characters) {
            if (!times.containsKey(ch)) {
                queue.offer(ch);
            }
        }
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            sb.append(ch);
            Set<Character> set = graphic.get(ch);
            for (char c : set) {
                int val = times.get(c) - 1;
                if (val == 0) {
                    queue.offer(c);

                }
                times.put(c, val);
            }
        }
        return sb.length() == characters.size() ? sb.toString() : "";
    }
}
