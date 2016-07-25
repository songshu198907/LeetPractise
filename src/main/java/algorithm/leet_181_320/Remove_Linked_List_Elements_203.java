package algorithm.leet_181_320;

import algorithm.ListNode;

/**
 * Created by songheng on 5/23/16.
 */
public class Remove_Linked_List_Elements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nHead = new ListNode(-1);
        ListNode node = nHead;
        node.next = head;
        while (node != null) {
            while (node.next != null && node.next.val == val) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        return nHead.next;
    }
}
