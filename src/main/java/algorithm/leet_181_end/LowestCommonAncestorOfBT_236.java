package algorithm.leet_181_end;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 6/20/2016.
 */
public class LowestCommonAncestorOfBT_236 {
    private TreeNode ancestor;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ancestor = null;
        if (root == null) return null;
        List<TreeNode> list = new ArrayList<>();
        help(root, p, q, list);
        return list.get(0);
    }

    private int help(TreeNode node, TreeNode p, TreeNode q, List<TreeNode> list) {
        if (node == null) return 0;
        int sum = 0;
        int left = help(node.left, p, q, list);
        if (left == 3) {
            if (list.isEmpty()) {
                list.add(node.left);
            }
            return 3;
        } else {
            if (node.val == p.val)
                sum += 1;
            if (node.val == q.val)
                sum += 2;
            if (sum == 3)
                if (ancestor == null) ancestor = node;
            if (left != sum) {
                sum = sum + left;
            }
            if (sum == 3) {
                list.add(node);
                return sum;
            } else {
                int right = help(node.right, p, q, list);
                if (right != sum) {
                    sum = sum + right;
                }
                if (sum == 3) list.add(node);
            }
            return sum;
        }
    }
}
