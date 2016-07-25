package algorithm.leet_181_320;

import java.util.*;

/**
 * Created by songheng on 7/13/16.
 */
public class Remove_Invalid_Parentheses_301 {

    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        Set<String> found = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        s = preProcessing(s);
        queue.offer(s);
        found.add(s);
        boolean pass = false;
        while (!queue.isEmpty()) {
            String str = queue.poll();
            if (isValidate(str)) {
                list.add(str);
                pass = true;
            }
            if (pass) continue;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '(' && str.charAt(i) != ')') continue;
                String t = str.substring(0, i) + str.substring(i + 1);
                if (!found.contains(t)) {
                    queue.offer(t);
                    found.add(t);
                }
            }

        }
        return list;
    }

    private String preProcessing(String s) {
        boolean head = false, tail = false;
        TreeSet<Integer> set = new TreeSet(Collections.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') break;
            if (s.charAt(i) == ')') set.add(i);
        }
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == ')') break;
            if (s.charAt(j) == '(') set.add(j);
        }
        StringBuilder sb = new StringBuilder(s);
        for (Integer i : set) sb.deleteCharAt(i);
        return sb.toString();
    }


    private boolean isValidate(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') cnt++;
            if (s.charAt(i) == ')') {
                if (cnt == 0) return false;
                cnt--;
            }

        }
        return cnt == 0;
    }

}
