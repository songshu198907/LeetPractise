package algorithm.leet_370_end;

import algorithm.leet_321_350.NestedInteger;

import java.util.Stack;

/**
 * Created by shu on 2016/9/25.
 */
public class Mini_Parser_385 {
    public NestedInteger deserialize(String s) {
        if (s.startsWith("[")) {
            Stack<NestedInteger> stack = new Stack<>();
            NestedInteger it;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[') {
                    stack.push(new NestedInteger());
                } else if (s.charAt(i) == ']') {
                    if (stack.size() > 1) {
                        it = stack.pop();
                        stack.peek().add(it);
                    }

                } else if (s.charAt(i) == ',') {
                    continue;
                } else {
                    int start = i;
                    while (i < s.length() && s.charAt(i) != ']' && s.charAt(i) != ',') {
                        i++;
                    }
                    String num = s.substring(start, i);
                    if (num.isEmpty()) {
                        stack.pop().add(new NestedInteger());
                    } else {
                        int val = Integer.parseInt(s.substring(start, i));
                        stack.peek().add(new NestedInteger(val));
                    }
                    i--;
                }
            }
            return stack.pop();
        } else {
            return new NestedInteger(Integer.parseInt(s));
        }

    }


}

