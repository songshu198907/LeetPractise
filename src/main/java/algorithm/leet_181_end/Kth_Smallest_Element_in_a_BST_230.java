package algorithm.leet_181_end;

import algorithm.TreeNode;

/**
 * Created by shu on 6/20/2016.
 */
public class Kth_Smallest_Element_in_a_BST_230 {
    public int kthSmallest(TreeNode root, int k) {
        int left = findNodeSum(root.left);
        if (left + 1 == k)
            return root.val;
        if (left >= k) {
            return kthSmallest(root.left, k);
        } else return kthSmallest(root.right, k - left - 1);
    }

    private int findNodeSum(TreeNode node) {
        if (node == null) return 0;
        return findNodeSum(node.left) + findNodeSum(node.right) + 1;
    }
}
