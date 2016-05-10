package algorithm.leet_106_120;

import algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/10/16.
 */
public class PathSumII_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null)
            traverseTree(result, new ArrayList<>(), sum, root);
        return result;
    }

    private void traverseTree(List<List<Integer>> lists, List<Integer> prev, int value, TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.val == value && node.left == null && node.right == null) {
            List<Integer> res = new ArrayList<>(prev);
            res.add(node.val);
            lists.add(res);
            return;
        } else {
            List<Integer> res = new ArrayList<>(prev);
            res.add(node.val);
            traverseTree(lists,res,value - node.val,node.left);
            traverseTree(lists,res,value - node.val,node.right);
            res.remove(res.lastIndexOf(node.val));
        }


    }


    public List<List<Integer>> pathSum2(TreeNode root, int sum) {
        List <List<Integer>> rst = new ArrayList<>();
        List<Integer> solution = new ArrayList<Integer>();

        findSum(rst, solution, root, sum);
        return rst;
    }

    private void findSum(List<List<Integer>> result, List<Integer> solution, TreeNode root, int sum){
        if (root == null) {
            return;
        }

        sum -= root.val;

        if (root.left == null && root.right == null) {
            if (sum == 0){
                solution.add(root.val);
                result.add(new ArrayList<Integer>(solution));
                solution.remove(solution.size()-1);
            }
            return;
        }

        solution.add(root.val);
        findSum(result, solution, root.left, sum);
        findSum(result, solution, root.right, sum);
        solution.remove(solution.size()-1);
    }
}
