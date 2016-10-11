package algorithm.second_round.leet_1_30;

import algorithm.ListNode;

/**
 * Created by songheng on 10/7/16.
 */
public class RemoveNthNodeFromEndofList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) break;
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.next;


    }
}
