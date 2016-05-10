package algorithm.leet_106_120;

import algorithm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 5/9/16.
 */
public class MinimumDepthofBinaryTree_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            Queue queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = (TreeNode) queue.poll();
                    if (node.left == null && node.right == null) {
                        return depth;
                    } else {
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                    }
                }
                depth++;
            }
            return depth;
        }
    }
}
