package algorithm.leet_181_320;

import java.util.*;

/**
 * Created by songheng on 7/11/16.
 */
public class Alien_Directory_269 {

    public String alienOrder(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Set<Character>> suc = new HashMap<Character, Set<Character>>();
        HashMap<Character, Integer> pre = new HashMap<Character, Integer>();
        HashSet<Character> charSet = new HashSet<Character>();
        String previousWord = new String("");
        for (String currentWord : words) {
            for (Character c : currentWord.toCharArray()) {
                charSet.add(c);
            }
            for (int i = 0; i < Math.min(previousWord.length(), currentWord.length()); ++i) {
                if (previousWord.charAt(i) != currentWord.charAt(i)) {
                    if (!pre.containsKey(currentWord.charAt(i))) { //----section_pre----
                        pre.put(currentWord.charAt(i), 1);
                    } else {
                        //ERROR1: 过滤掉重复的关系 ["za","zb","ca","cb"], 从输入得出的中间结论，"a->b"会重复出现两次，需要滤重。为了实现滤重，重新调整了section_pre和section_suc部分的顺序。
                        if (suc.containsKey(previousWord.charAt(i)) &&
                                suc.get(previousWord.charAt(i)).contains(currentWord.charAt(i))) {
                            continue;
                        }
                        pre.put(currentWord.charAt(i), pre.get(currentWord.charAt(i)) + 1);
                    }
                    if (!suc.containsKey(previousWord.charAt(i))) { //----section_suc----
                        suc.put(previousWord.charAt(i), new HashSet<Character>());
                    }
                    suc.get(previousWord.charAt(i)).add(currentWord.charAt(i));
                    break; //the BEST part of this question
                }
            }
            previousWord = currentWord;
        }
        Queue<Character> queue = new LinkedList<Character>();
        for (Character each : charSet) {
            if (!pre.containsKey(each)) {
                queue.add(each);
            }
        }


        while (!queue.isEmpty()) {
            Character currentChar = queue.poll();
            sb.append(currentChar);
            //ERROR2 should check containsKey
            if (!suc.containsKey(currentChar)) {
                continue;
            }
            for (Character each : suc.get(currentChar)) {
                pre.put(each, pre.get(each) - 1);
                if (pre.get(each) == 0) {
                    queue.offer(each);
                }
            }
        }
        return sb.length() == charSet.size() ? sb.toString() : "";
    }


}
