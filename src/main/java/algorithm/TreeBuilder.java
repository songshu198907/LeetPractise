package algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 5/9/16.
 */
public class TreeBuilder {
    public static final TreeNode build(Object[] objects) {
        TreeNode node = new TreeNode((Integer) objects[0]);
        int count =1;
        Queue queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty() && count < objects.length) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = (TreeNode) queue.poll();
                if (count >= objects.length) {
                    break;
                }
                if (objects[count] == null) {
                    tmp.left = null;
                    count++;

                } else
                    tmp.left = new TreeNode((Integer) objects[count++]);
                if (count >= objects.length) {
                    break;
                }
                if (objects[count] == null) {
                    tmp.right = null;
                    count++;
                } else
                    tmp.right = new TreeNode((Integer) objects[count++]);
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
        }

        return node;
    }
}
