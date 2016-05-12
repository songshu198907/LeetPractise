package algorithm.leet_121_135;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/12/16.
 */
public class SumRoottoLeafNumbers_129 {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return sum;
        }
        buildList(root, 0);

        return sum;
    }

    private void buildList(TreeNode node, int prev) {
        if (node == null) return;
        prev = prev * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += prev;
        }
        if (node.right != null) {
            buildList(node.right, prev);
        }
        if (node.left != null) {
            buildList(node.left, prev);
        }
    }

}
