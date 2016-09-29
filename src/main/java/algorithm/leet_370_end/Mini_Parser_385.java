package algorithm.leet_370_end;

import algorithm.leet_321_350.NestedInteger;

import java.util.Stack;

/**
 * Created by shu on 2016/9/25.
 */
public class Mini_Parser_385 {
    public NestedInteger deserialize(String s) {
        NestedInteger integer = null;
        Stack<NestedInteger> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                stack.push(integer);
                integer = new NestedInteger();
            } else if (s.charAt(i) == ']') {
                NestedInteger parent = stack.pop();
                parent.add(integer);
                integer = parent;
            } else {

            }
        }

        return integer;
    }


}

