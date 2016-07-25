package algorithm.leet_181_320;

import algorithm.TreeNode;

/**
 * Created by songheng on 6/7/16.
 */
public class Count_Complete_Tree_Nodes_222 {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int l = getLeft(root) + 1;
        int r = getRight(root) + 1;

        if(l==r) {
            return (2<<(l-1)) - 1;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    private int getLeft(TreeNode root) {
        int count = 0;
        while(root.left!=null) {
            root = root.left;
            ++count;
        }
        return count;
    }

    private int getRight(TreeNode root) {
        int count = 0;
        while(root.right!=null) {
            root = root.right;
            ++count;
        }
        return count;
    }

}
