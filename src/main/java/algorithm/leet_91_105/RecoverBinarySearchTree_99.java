package algorithm.leet_91_105;

import algorithm.TreeNode;

import java.util.ArrayList;

/**
 * Created by songheng on 5/6/16.
 */
public class RecoverBinarySearchTree_99 {
    private TreeNode first =null;
    private TreeNode previous = new TreeNode(Integer.MIN_VALUE);
    private TreeNode second = null ;
    private void traceOver(TreeNode root){
        if(root == null){
            return ;
        }
        traceOver(root.left);
        if(first == null && root.val < previous.val){
            first = previous;

        }
        if(first != null && root.val<previous.val){
            second = root;
        }
        previous = root;
        traceOver(root.right);
    }
    public void recoverTree(TreeNode root) {
        traceOver(root);
        int val = first.val;
        first.val = second.val;
        second.val = val;

    }

}
