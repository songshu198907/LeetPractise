package algorithm.leet_181_320;

import algorithm.TreeNode;

/**
 * Created by songheng on 7/13/16.
 */
public class Binary_Tree_Longest_Consecutive_Sequence_298 {
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        int right = 0, left = 0, length = 1;
        if (root.left != null) {
            left = longestConsecutive(root.left);
            if (root.val == root.left.val - 1) {
                length = Math.max(length, left + 1);
            } else length = Math.max(left, left);
        }
        if (root.right != null) {
            right = longestConsecutive(root.right);
            if (root.right.val == root.val + 1) {
                length = Math.max(length, right + 1);
            } else length = Math.max(length, right);
        }

        return length;
    }


}
