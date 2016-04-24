package algorithm.leet_76_90;

import algorithm.ListNode;

/**
 * Created by shu on 4/23/2016.
 */
public class RemoveDuplicatesfromSortedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = head, end = head.next;
        while (end != null) {
            if (start.val != end.val) {
                start.next = end;
                start = start.next;
            }
            end = end.next;
        }
        start.next = null;
        return head;
    }
}
