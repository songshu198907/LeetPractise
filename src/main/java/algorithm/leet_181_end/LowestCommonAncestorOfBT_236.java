package algorithm.leet_181_end;

import algorithm.TreeNode;

/**
 * Created by shu on 6/20/2016.
 */
public class LowestCommonAncestorOfBT_236 {
    private boolean found;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
