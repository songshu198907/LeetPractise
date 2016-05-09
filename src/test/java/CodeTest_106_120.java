import algorithm.NodeListBuilder;
import algorithm.TreeBuilder;
import algorithm.TreeNode;
import algorithm.leet_106_120.BalancedBinaryTree_110;
import algorithm.leet_106_120.ConstructBinaryTreefromInorderandPostorderTraversal_106;
import algorithm.leet_106_120.ConvertSortedListtoBinarySearchTree_109;
import org.junit.Test;

/**
 * Created by songheng on 5/9/16.
 */
public class CodeTest_106_120 {
    @Test
    public void test106() {
        ConstructBinaryTreefromInorderandPostorderTraversal_106 construct = new ConstructBinaryTreefromInorderandPostorderTraversal_106();
//        construct.buildTree(new int[]{1,2},new int[]{1,2}).print();
        construct.buildTree(new int[]{2, 3, 1}, new int[]{3, 2, 1}).print();
    }

    @Test
    public void test109() {
        ConvertSortedListtoBinarySearchTree_109 convert = new ConvertSortedListtoBinarySearchTree_109();
        convert.sortedListToBST(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5, 6, 7})).print();
        convert.sortedListToBST(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4, 5, 6})).print();

    }

    @Test
    public void test110() {
        BalancedBinaryTree_110 tree = new BalancedBinaryTree_110();
//        TreeNode node = new TreeNode(1);
//        node.right = new TreeNode(2);
//        node.right.right = new TreeNode(3);
//        System.out.println(tree.isBalanced(node));
        Object[] obj = new Object[]{
                1,null,2,null,3
        };

        TreeNode root = TreeBuilder.build(obj);
        root.print();
        System.out.println(tree.isBalanced(root));
//        System.out.println("done");
    }

}
