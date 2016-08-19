package algorithm.leet_321_350;

import algorithm.TreeNode;

/**
 * Created by songheng on 8/19/16.
 */
public class HouseRobberIII_337 {

    public int rob(TreeNode root) {
        if (root == null) return 0;
        int[] res = help(root);
        return Math.max(res[0], res[1]);

    }

    private int[] help(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = help(node.left);
        int[] right = help(node.right);
        int[] result = new int[2];
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = left[0] + right[0] + node.val;

        return result;
    }

}

