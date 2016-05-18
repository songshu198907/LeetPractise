package algorithm.leet_166_180;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/18/16.
 */
public class BSTIterator {
    List<Integer> values = new ArrayList<>();
    private int pos;

    public BSTIterator(TreeNode root) {
        pos = 0;
        if (root != null) {
            loadValue(root);
        }


    }

    private void loadValue(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            values.add(node.val);
            return;
        }

        if (node.left != null) {
            loadValue(node.left);
        }
        values.add(node.val);
        if (node.right != null)
            loadValue(node.right);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return pos < values.size();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return values.get(pos++);

    }
}
