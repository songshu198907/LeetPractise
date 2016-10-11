package algorithm.second_round.leet_1_30;

import algorithm.ListNode;

/**
 * Created by songheng on 10/10/16.
 */
public class ReverseNodesink_Group_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) return head;
        ListNode nHead = new ListNode(0);
        nHead.next = head;
        head = nHead;
        ListNode start = head, end = head;
        while (end != null) {
            for (int i = 0; i < k; i++) {
                if (end == null) break;
                end = end.next;
            }
            if (end != null) {
                ListNode next = end.next;
                start.next = revert(start.next, end);
                while (start.next != null) {
                    start = start.next;
                }
                start.next = next;
                end = start;
            }

        }
        return nHead.next;
    }

    private ListNode revert(ListNode start, ListNode end) {
        ListNode head = start, next = start.next;
        while (head != end) {
            if (next == null) break;
            ListNode nextNext = next.next;
            next.next = head;
            head = next;
            next = nextNext;
        }
        start.next = null;
        return head;
    }
}
