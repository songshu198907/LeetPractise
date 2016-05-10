package algorithm.leet_106_120;

import algorithm.TreeLinkNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 5/10/16.
 */
public class PopulatingNextRightPointersinEachNode_116 {
    public void connect(TreeLinkNode root) {
       if(root == null){
           return ;
       }
        if(root.left!=null){
            root.left.next = root.right;
        }
        if(root.right != null){
            root.right.next = root.next!=null ? root.next.left:null;
        }
        connect(root.left);
        connect(root.right);
    }
}
