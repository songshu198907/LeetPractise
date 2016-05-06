package algorithm.leet_91_105;

import algorithm.TreeNode;

/**
 * Created by songheng on 5/6/16.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null & q == null ){
            return true;
        } else if( ( p == null && q!= null)||(p!=null && q==null) ){
            return false;
        }

        return (p.val == q.val) && (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }

}
