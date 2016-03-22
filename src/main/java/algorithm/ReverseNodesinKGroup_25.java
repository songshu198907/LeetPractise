package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class ReverseNodesinKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        boolean first = true;

        if (head == null || head.next == null) {
            return head;
        }
        ListNode previous = null;
        ListNode start = head, end = start;
        ListNode tmp;
        int distance = 0;
        while (end != null) {
            if (distance < k - 1) {
                end = end.next;
                distance++;
            } else {
                tmp = end.next;
                if (first) {
                    head = end;
                    first = false;
                }
                previous = sort(start, end, previous);
                distance = 0;
                start = tmp;
                end = start;

            }


        }
        if (distance <= k - 1) {
            if (previous != null) {

                previous.next = start;
            }

        }


        return head;

    }

    private ListNode sort(ListNode start, ListNode end, ListNode previous) {
        ListNode current = start;
        ListNode second = current.next;
        ListNode thrid;
        while (current != end) {
            thrid = second.next;
            second.next = current;
            current = second;
            second = thrid;


        }
        if (previous != null) {
            previous.next = current;
        }
        previous = start;
        return previous;

    }
}
