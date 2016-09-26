package algorithm.leet_370_end;

import algorithm.leet_321_350.NestedInteger;

import java.util.Stack;

/**
 * Created by shu on 2016/9/25.
 */
public class Mini_Parser_385 {
    public NestedInteger deserialize(String s) {
        boolean neg = false;
        if (s.startsWith("[")) {
            Stack<NestedInteger> stack = new Stack<>();
        } else {
            if (s.startsWith("-")) {
                neg = true;
            }
            int val = Integer.parseInt(s);
            return new NestedInteger(neg ? 0 - val : val);
        }

    }


}

