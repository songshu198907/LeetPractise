package algorithm.leet_106_120;

import algorithm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 5/10/16.
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right==null && root.val==sum)
            return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
