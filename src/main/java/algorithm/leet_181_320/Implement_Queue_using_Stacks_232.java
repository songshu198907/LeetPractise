package algorithm.leet_181_320;

import java.util.Stack;

/**
 * Created by shu on 6/20/2016.
 */
public class Implement_Queue_using_Stacks_232 {
    private Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        tmp.push(x);
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.pop();
    }

    // Get the front element.
    public int peek() {

        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();

    }
}
