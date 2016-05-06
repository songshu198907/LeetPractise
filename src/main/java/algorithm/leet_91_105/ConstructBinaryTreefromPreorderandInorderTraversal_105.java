package algorithm.leet_91_105;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/6/16.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }

    private TreeNode helper(int[] preorder, int pStart, int pEnd, int[] inoder, int nStart, int nEnd) {

        if (pStart == pEnd) {
            return new TreeNode(preorder[pStart]);
        }
        if(pStart > pEnd ){
            return null;
        }
        int root = preorder[pStart];
        TreeNode nNode = new TreeNode(root);
        int pos = nStart;
        for (; pos <= nEnd; pos++) {
            if (inoder[pos] == root) {
                break;
            }
        }
        nNode.left = helper(preorder, pStart + 1, pStart+pos-nStart, inoder, nStart, pos - 1);
        nNode.right = helper(preorder,pStart+pos-nStart+1, pEnd, inoder, pos + 1, nEnd);
        return nNode;
    }


}
