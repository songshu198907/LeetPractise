package algorithm.leet_106_120;

import algorithm.TreeLinkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by songheng on 5/10/16.
 */
public class PopulatingNextRightPointersinEachNode_117 {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        Queue<TreeLinkNode > queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeLinkNode prev = null;
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = queue.poll();
                if(prev == null){
                    prev = node;
                } else {
                    prev.next = node;
                    prev = node;
                }
                if(prev.left!=null){
                    queue.offer(prev.left);
                }
                if(prev.right!= null)
                    queue.offer(prev.right);

            }
            if(prev!=null){
                prev.next = null;
            }
        }
    }

}
