package algorithm.leet_181_end;

import algorithm.TreeNode;

import java.util.Stack;

/**
 * Created by songheng on 6/7/16.
 */
public class Count_Complete_Tree_Nodes_222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int count = 0;
        int leaf = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        node = root;
        while (node != null) {
            count++;
            node = node.right;
        }
        if (count == stack.size()) {
            count = calculate(count);
        } else {
            stack.pop();
            leaf++;
            boolean visited = true;

            while (true) {
                if (visited) {
                    if (stack.peek().right == null) {
                        return calculate(count) + leaf;
                    } else {
                        leaf++;
                        TreeNode prev = stack.pop();
                        while (stack.peek().right == prev) {
                            prev = stack.pop();
                        }
                        node = stack.peek().right;
                        while (node != null) {
                            stack.push(node);
                            node = node.left;
                        }
                        if (stack.size() > count)
                            stack.pop();
                        visited = false;

                    }
                } else {
                    if (stack.peek().left == null) {
                        return calculate(count) + leaf;
                    } else {
                        visited = true;
                        leaf++;

                    }
                }
            }

        }
        return count;
    }


    private Integer calculate(int layer) {
        return (int) Math.pow(2, layer) - 1;
    }

}
