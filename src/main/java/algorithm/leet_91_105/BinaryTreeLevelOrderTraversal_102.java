package algorithm.leet_91_105;

import algorithm.TreeNode;
import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by songheng on 5/6/16.
 */
public class BinaryTreeLevelOrderTraversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if (root != null) {
            queue.offer(root);
            while(!queue.isEmpty()){
                List<Integer> layer = new ArrayList<>();
                int size = queue.size();
                for( int i =0 ; i < size ; i ++){
                    TreeNode node = queue.poll();
                    layer.add(node.val);
                    if(node.left != null){
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                    }
                }
                result.add(layer);
            }
        }

        return result;
    }


}
