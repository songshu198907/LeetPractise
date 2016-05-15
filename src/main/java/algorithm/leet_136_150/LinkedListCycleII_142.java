package algorithm.leet_136_150;

import algorithm.ListNode;

/**
 * Created by shu on 5/14/2016.
 */
public class LinkedListCycleII_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode dup = null;
        ListNode slow = head, fast = head;
        ListNode z = null;
        if (head != null && head.next != null) {
            while (fast != null) {
                slow = slow.next;
                if (fast.next == null) {
                    break;
                } else {
                    fast = fast.next.next;
                    if (fast == slow) {
                        z = slow;
                        break;
                    }
                }
            }
        }
        slow = head;
        fast = z;
        if (z != null) {
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            dup = slow;
        }

        return dup;
    }
}
