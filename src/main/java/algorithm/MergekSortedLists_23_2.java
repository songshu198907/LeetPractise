package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class MergekSortedLists_23_2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else {
            ListNode node ;

            node = helper(lists,0,lists.length-1);

            return node;

        }
    }
    private ListNode helper(ListNode[] lists, int left ,int right){
        if(left < right ){
            int center = (right + left) / 2;
            ListNode leftNode = helper(lists, left, center);
            ListNode rightNode = helper(lists,center+1 ,right);
            return mergedNode(leftNode,rightNode);

        }
        else {
            return lists[right];
        }

    }
    private ListNode mergedNode (ListNode left , ListNode right){
        ListNode head = null;
        ListNode tail = null ;
        while(left!=null && right != null){
            if(left.val < right.val){
                if(head == null){
                    head = left;
                    tail = head;
                }
                else {
                    tail.next = left;
                    tail = tail.next;
                }
                left = left.next;
            }else{
                if(head == null){
                    head = right;
                    tail = head;
                }
                else {
                    tail.next = right;
                    tail = tail.next;
                }
                right = right.next;
            }
        }
        while (left != null ){
            if(head == null){
                head = left;
                tail = head;
            }
            else {
                tail.next = left;
                tail = tail.next;
            }

            left = left.next;
        }
        while ( right != null) {
            if(head == null){
                head = right;
                tail = head;
            }
            else {
                tail.next = right;
                tail = tail.next;
            }
            right = right.next;
        }
        return  head;
    }
    public  ListNode buildList(int[] a ){
        ListNode head = new ListNode(a[0]);
        ListNode tail = head;
        for(int i = 1; i < a.length ; i++){
            ListNode node = new ListNode(a[i]);
            tail.next = node;
            tail = tail.next;
        }
        return head;
    }
}
