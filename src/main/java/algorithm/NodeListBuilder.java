package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class NodeListBuilder {
    public  static  ListNode BuildList(int[] a ){
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
