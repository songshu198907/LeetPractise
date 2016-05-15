package algorithm.leet_136_150;

import algorithm.ListNode;

/**
 * Created by shu on 5/14/2016.
 */
public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return false;
        }
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
                if (fast == slow) {
                    return true;
                }
            }
        }
        return false;
    }
}
