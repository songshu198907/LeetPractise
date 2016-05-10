import algorithm.NodeListBuilder;
import algorithm.TreeBuilder;
import algorithm.TreeLinkNode;
import algorithm.TreeNode;
import algorithm.leet_106_120.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
                1, null, 2, null, 3
        };

        TreeNode root = TreeBuilder.build(obj);
        root.print();
        System.out.println(tree.isBalanced(root));
//        System.out.println("done");
    }

    @Test
    public void test112() {
        PathSum_112 path = new PathSum_112();
        System.out.println(path.hasPathSum(TreeBuilder.build(new Object[]{-2, null, -3}), -5));
    }

    @Test
    public void test114() {
        FlattenBinaryTreetoLinkedList_114 falt = new FlattenBinaryTreetoLinkedList_114();
        TreeNode node = TreeBuilder.build(new Object[]{1, 2, 5, 3, 4, 6
        });
        falt.flatten(node);
        node.print();

    }
    @Test
    public  void test115(){

    }
    @Test
    public void test116(){
        PopulatingNextRightPointersinEachNode_116 pop = new PopulatingNextRightPointersinEachNode_116();
        pop.connect(new TreeLinkNode(0));
    }
    @Test
    public void test118(){
        PascalsTriangle_118 pascal = new PascalsTriangle_118();
        System.out.println(pascal.generate(4));
    }
    @Test
    public void test119(){
        PascalsTriangleII_119 pascal = new PascalsTriangleII_119() ;
        System.out.println(pascal.getRow(3));
    }
    @Test
    public void test120(){
        Triangle_120 triangle = new Triangle_120();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        lists.add(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        lists.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(-1);
        list2.add(-3);
        lists.add(list2);

        System.out.println(triangle.minimumTotal(lists));
    }
}
