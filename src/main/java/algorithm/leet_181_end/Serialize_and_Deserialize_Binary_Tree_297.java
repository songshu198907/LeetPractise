package algorithm.leet_181_end;

import algorithm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shu on 7/13/2016.
 */
public class Serialize_and_Deserialize_Binary_Tree_297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) sb.append("null").append(",");
            else {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        String str = sb.toString();
        return str.substring(0, str.lastIndexOf(","));
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root;
        if (data.trim().isEmpty()) {
            root = null;
        } else {
            String[] nodeStrings = data.split(",");
            root = new TreeNode(Integer.parseInt(nodeStrings[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int count = 1;
            while (!queue.isEmpty() && count < nodeStrings.length) {
                TreeNode node = queue.poll();
                String str = nodeStrings[count++];
                if (str.equalsIgnoreCase("null")) {
                    node.left = null;
                } else {
                    TreeNode left = new TreeNode(Integer.parseInt(str));
                    node.left = left;
                    queue.offer(left);
                }
                if (count >= nodeStrings.length) break;
                str = nodeStrings[count++];
                if (str.equalsIgnoreCase("null")) {
                    node.right = null;
                } else {
                    TreeNode right = new TreeNode(Integer.parseInt(str));
                    node.right = right;
                    queue.offer(right);
                }
            }
        }
        return root;

    }
}
