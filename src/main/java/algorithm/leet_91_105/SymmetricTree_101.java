package algorithm.leet_91_105;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/6/16.
 */
public class SymmetricTree_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMisrror(root.left,root.right);
    }

    private boolean isMisrror(TreeNode left , TreeNode right) {
        if((left == null && right != null)||(left !=null && right == null)){
            return false;
        }
        return (left == right ) || (left.val == right.val ) && isMisrror(left.right,right.left) && isMisrror(left.left,right.right);

    }
}
