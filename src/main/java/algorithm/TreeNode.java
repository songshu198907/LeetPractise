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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) return false;
        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) return false;
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;

    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
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
