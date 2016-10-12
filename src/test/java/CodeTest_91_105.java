import algorithm.NodeListBuilder;
import algorithm.TreeBuilder;
import algorithm.TreeNode;
import algorithm.leet_91_105.*;
import org.junit.Test;

/**
 * Created by shu on 5/4/2016.
 */
public class CodeTest_91_105 {
    @Test
    public void test91() {
        DecodeWays_91 decode = new DecodeWays_91();
        System.out.println(decode.numDecodings("123545612"));
    }

    @Test
    public void test92() {
        ReverseLinkedListII_92 reverse = new ReverseLinkedListII_92();
        reverse.reverseBetween(NodeListBuilder.BuildList(new int[]{1, 2, 3, 4}), 1, 3).print();
    }

    @Test
    public void test93() {
        RestoreIPAddresses_93 restore = new RestoreIPAddresses_93();
//        System.out.println(restore.restoreIpAddresses("25525511135"));
//        System.out.println(restore.restoreIpAddresses("0000"));
        System.out.println(restore.restoreIpAddresses("010010"));
    }

    @Test
    public void test95() {
        UniqueBinarySearchTreesII_95 unique = new UniqueBinarySearchTreesII_95();
        unique.generateTrees(8);
    }

    @Test
    public void test96() {
        UniqueBinarySearchTrees_96 unique = new UniqueBinarySearchTrees_96();
        System.out.println(unique.numTrees(1));
    }

    @Test
    public void test97() {
        InterleavingString_97 inteleave = new InterleavingString_97();
        System.out.println(inteleave.isInterleave("aaaa", "aaab", "aaaabaaa"));
    }

    @Test
    public void test98() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
        ValidateBinarySearchTree_98 valid = new ValidateBinarySearchTree_98();
//        System.out.println(valid.isValidBST2(root));
        root = TreeBuilder.build(new Object[]{Integer.MIN_VALUE});
        System.out.println(valid.isValidBST2(root));
    }

    @Test
    public void test99() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

//        root.right.right = new TreeNode(1);
        RecoverBinarySearchTree_99 recover = new RecoverBinarySearchTree_99();
        recover.recoverTree(root);
    }
    @Test
    public void test100(){
        SymmetricTree_101 tree = new SymmetricTree_101();
        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
        System.out.println(tree.isSymmetric(root));


    }

    @Test
    public void test105(){
        ConstructBinaryTreefromPreorderandInorderTraversal_105 construct = new ConstructBinaryTreefromPreorderandInorderTraversal_105();
        construct.buildTree(new int[]{1,2,3},new int[]{3,2,1});
    }
}
