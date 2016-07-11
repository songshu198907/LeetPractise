package algorithm.leet_181_end;

import algorithm.leet_61_75.ListNode;

/**
 * Created by songheng on 6/27/16.
 */
public class DeleteNodeinLinkedList_237 {
    public void deleteNode(ListNode node) {
        ListNode head = new ListNode(1);
        head.next = node;
        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.next.val == 3) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
        node = head.next;
    }
}
