package algorithm.leet_106_120;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/9/16.
 */
public class BalancedBinaryTree_110 {
    private boolean isBal = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        checkHeights(root);
        return isBal;
    }

    private int checkHeights(TreeNode root) {
        if (root == null) {
            return 0;
        } else {

            int left = checkHeights(root.left);
            int right = checkHeights(root.right);
            if (Math.abs(left - right) < 2) {
                return Math.max(left, right)+1;
            } else {
                isBal = false;
                return -100;
            }

        }

    }
}
