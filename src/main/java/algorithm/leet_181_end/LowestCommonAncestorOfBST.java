package algorithm.leet_181_end;

import algorithm.TreeNode;

/**
 * Created by shu on 6/20/2016.
 */
public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        TreeNode node = root;
        while (node != null) {
            int cmp1 = p.val - node.val;
            int cmp2 = q.val - node.val;
            if (cmp1 * cmp2 <= 0) break;
            if (cmp1 > 0) {
                node = node.right;

            } else {
                node = node.left;
            }

        }
        return node;
    }
}
