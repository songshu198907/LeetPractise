package algorithm.leet_91_105;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/5/16.
 */
public class UniqueBinarySearchTreesII_95 {
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return  new ArrayList<>();
        }
        return genBST(1, n);
    }

    private List<TreeNode> genBST(int min, int max) {
        List<TreeNode> treeNodes = new ArrayList<>();
        if (min == max) {
            treeNodes.add(new TreeNode(min));
          return treeNodes;
        }
        for (int i = min; i <= max; i++) {
            List<TreeNode> leftNodes = genBST(min, i - 1);
            List<TreeNode> rightNodes = genBST(i + 1, max);


            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    treeNodes.add(node);
                }
            }
        }
        return treeNodes;
    }


}
