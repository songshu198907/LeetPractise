package algorithm.leet_91_105;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/6/16.
 */
public class ValidateBinarySearchTree_98 {
    private long leftRight = (long) Integer.MIN_VALUE - 10;
    public boolean isValidBST(TreeNode root) {

       if(root == null){
           return true;
       }
        return  ((root.left == null) || (root.left.val < root.val) && (root.val > getLeftRightMost(root.left)))
                && ((root.right == null)|| (root.right.val > root.val)&& (root.val < getRightLeftMost(root.right)))
                &&isValidBST(root.left)&&isValidBST(root.right)  ;

    }
    private int getLeftRightMost(TreeNode node) {
        while(node.right != null){
            node = node.right;
        }
        return node.val;
    }
    private int getRightLeftMost(TreeNode node) {
        while(node.left != null){
            node = node.left;
        }
        return node.val;
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST2(root.left)) {
            return false;
        }
        if (root.val <= leftRight) return false;
        leftRight = root.val;
        return isValidBST2(root.right);
    }


}
