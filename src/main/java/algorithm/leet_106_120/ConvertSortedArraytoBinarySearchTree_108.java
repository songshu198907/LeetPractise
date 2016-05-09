package algorithm.leet_106_120;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/9/16.
 */
public class ConvertSortedArraytoBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int rootVal = (nums.length - 1) / 2;
        TreeNode root;
        if(nums.length==0){
            return null;
        }
        if (nums.length == 1) {
            root = new TreeNode(nums[0]);
        } else {
            root = new TreeNode(nums[rootVal]);
            helper(root, nums, 0, rootVal - 1);
            helper(root, nums, rootVal + 1, nums.length - 1);
        }
        return root;
    }

    private void helper(TreeNode root, int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        if (start == end) {
            insert(root, nums[start]);
            return;
        }
        int center = (start + end) / 2;
        insert(root, nums[center]);
        helper(root, nums, start, center - 1);
        helper(root, nums, center + 1, end);

    }

    private void insert(TreeNode node, int val) {
        if (val < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insert(node.left, val);
            }
        } else if (val > node.val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insert(node.right, val);
            }
        }
    }

}
