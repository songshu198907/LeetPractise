package algorithm.leet_106_120;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/10/16.
 */
public class FlattenBinaryTreetoLinkedList_114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null) {
            flatten(root.right);
            return;
        } else {
            TreeNode right = root.right;
            root.right = root.left;
            root.left = null;
            flatten(root.right);
            while(root.right != null){
                root = root.right;
            }
            root.right = right;

            flatten(root.right);
        }


    }
}
