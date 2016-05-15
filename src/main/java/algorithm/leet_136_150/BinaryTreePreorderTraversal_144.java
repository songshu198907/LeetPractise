package algorithm.leet_136_150;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 5/14/2016.
 */
public class BinaryTreePreorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            helper(list, root);
        }
        return list;
    }

    private void helper(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        int val = node.val;
        list.add(val);
        if (node.left != null) {
            helper(list, node.left);
        }
        if (node.right != null) {
            helper(list, node.right);
        }
    }
}
