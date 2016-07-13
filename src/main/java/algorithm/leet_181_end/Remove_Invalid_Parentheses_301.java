package algorithm.leet_181_end;

import java.util.*;

/**
 * Created by songheng on 7/13/16.
 */
public class Remove_Invalid_Parentheses_301 {

    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        if (s.isEmpty()) return list;
        TreeSet<Integer> l = new TreeSet<>();
        TreeSet<Integer> r = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                l.add(i);
            } else if (ch == ')') {
                r.add(i);
            }
        }
        if ()
            return list;
    }

    private boolean isValidate(TreeSet<Integer> l, TreeSet<Integer> r) {
        Stack<Integer> stack = new Stack<>();
        if (l.size() != r.size()) return false;
        Iterator left = l.iterator();
        Iterator right = r.iterator();
        while (left.hasNext() && right.hasNext()) {
            if ()
        }
    }
}
