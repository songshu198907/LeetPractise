package algorithm.leet_151_165;

import java.util.LinkedList;

/**
 * Created by songheng on 5/17/16.
 */
public class MinStack {
    private LinkedList<Integer> minStack;
    private LinkedList<Integer> stack;


    public MinStack() {
        minStack = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);

    }


    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}
