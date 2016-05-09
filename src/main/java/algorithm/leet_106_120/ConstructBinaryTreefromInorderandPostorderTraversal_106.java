package algorithm.leet_106_120;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/9/16.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }

        return treeBuilder(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode treeBuilder(int[] inorder, int nStart, int nEnd, int[] postorder, int pStart, int pEnd) {
        if (nStart > nEnd) {
            return null;
        }
        if (nStart == nEnd) {
            return new TreeNode(inorder[nStart]);
        }
        TreeNode root = new TreeNode(postorder[pEnd]);
        int rootPos = 0;
        while (inorder[nStart + rootPos] != postorder[pEnd]) {
            rootPos++;
        }
        if (rootPos + nStart == nEnd) {
            root.right = null;
            root.left = treeBuilder(inorder, nStart, nEnd - 1, postorder, pStart, pEnd - 1);
        } else if (rootPos == 0) {
            root.left = null;
            root.right = treeBuilder(inorder, nStart + 1, nEnd, postorder, pStart, pEnd - 1);
        } else {
            root.left = treeBuilder(inorder, nStart, nStart + rootPos - 1, postorder, pStart, pStart + rootPos - 1);
            root.right = treeBuilder(inorder, nStart + rootPos + 1, nEnd, postorder, pStart + rootPos, pEnd - 1);
        }

        return root;
    }


}
