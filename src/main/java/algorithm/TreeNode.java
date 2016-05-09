package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by songheng on 5/5/16.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void print(){
        List<List<String>> res = new ArrayList<>();

        if(this == null){
            System.out.println(res);
        } else {
            Queue queue = new LinkedList<>();
            queue.offer(this);
            while(!queue.isEmpty()){
                int size = queue.size();
                List<String> line = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = (TreeNode) queue.poll();
                    if(node == null){
                        line.add("#");
                    } else {
                        line.add(String.valueOf(node.val));
                        queue.offer(node.left);
                        queue.offer(node.right);
                    }
                }
                res.add(line);
            }

        }
        System.out.println(res);

    }
}
