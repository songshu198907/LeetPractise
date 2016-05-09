import algorithm.NodeListBuilder;
import algorithm.TreeNode;
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
         convert.sortedListToBST(NodeListBuilder.BuildList(new int[]{1,2,3,4,5,6,7})).print();
         convert.sortedListToBST(NodeListBuilder.BuildList(new int[]{1,2,3,4,5,6})).print();

    }
}
