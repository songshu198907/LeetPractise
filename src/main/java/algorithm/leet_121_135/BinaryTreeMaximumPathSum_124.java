package algorithm.leet_121_135;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/11/16.
 */
public class BinaryTreeMaximumPathSum_124 {
    private int big = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        big = Integer.MIN_VALUE;
        if (root == null) {
            return 0;
        }
        traverseTree(root);
        return big;
    }

    private int traverseTree(TreeNode node) {
        if (node.left == null && node.right == null) {
            big = Math.max(big, node.val);
            return node.val;
        }
        int val = node.val;
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = traverseTree(node.left);
        }
        if (node.right != null) {
            right = traverseTree(node.right);
        }
        big = Math.max(big, Math.max(0, left) + Math.max(right, 0) + val);
        if (node.left != null && node.right != null) {
            return Math.max(Math.max(right, left), 0) + node.val;
        } else if (node.left != null) {
            return val + Math.max(left, 0);
        } else return val + Math.max(right, 0);


    }

}
