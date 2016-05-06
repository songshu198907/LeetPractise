package algorithm.leet_91_105;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/6/16.
 */
public class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root == null){
            return  0 ;
        }
        return Math.max(maxDepth(root.left) ,maxDepth(root.right)) +1;
    }
}
