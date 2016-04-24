package algorithm.leet_76_90;

import algorithm.ListNode;

/**
 * Created by shu on 4/23/2016.
 */
public class RemoveDuplicatesfromSortedListII_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int prev;

        if (head.val == head.next.val) {
            prev = head.val;
            ListNode nHead = head.next;
            while (nHead != null) {
                if (nHead.val != prev && (nHead.next == null || nHead.next.val != nHead.val)) {


                    break;
                } else {
                    prev = nHead.val;
                    nHead = nHead.next;

                }
            }
            head = nHead;

        }

        if (head == null) {
            return head;
        }
        prev = head.val;
        ListNode curr = head, next = head.next;
        while (next != null) {
            if (next.val != prev && (next.next == null || next.val != next.next.val)) {
                curr.next = next;
                curr = curr.next;
            }
            prev = next.val;
            next = next.next;

        }
        curr.next = null;


        return head;
    }
}
