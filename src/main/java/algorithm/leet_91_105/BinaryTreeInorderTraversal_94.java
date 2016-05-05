package algorithm.leet_91_105;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/5/16.
 */
public class BinaryTreeInorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return  result;
        }
        loadNode(root,result);
        return result;
    }

    private void loadNode(TreeNode node ,List<Integer> list) {
        if(node.left!=null){
            loadNode(node.left,list);
        }
        list.add(node.val);
        if(node.right !=null){
            loadNode(node.right,list);
        }
    }

}
