package algorithm.leet_76_90;

import algorithm.ListNode;

/**
 * Created by songheng on 5/4/16.
 */
public class PartitionList_86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode small_head = null, small_end = null, big_head = null, big_end = null;
        ListNode pos = head;
        while (pos != null) {
            int val = pos.val;
            if (val < x) {
                if (small_head == null) {
                    small_head = pos;
                    small_end = pos;
                } else {
                    small_end.next = pos;
                    small_end = small_end.next;
                }
            } else {
                if (big_head == null) {
                    big_head = pos;
                    big_end = pos;
                } else {
                    big_end.next = pos;
                    big_end = big_end.next;
                }
            }
            pos = pos.next;
        }

        if (small_head == null) {
            head = big_head;
        } else {
            head = small_head;
            small_end.next = big_head;
        }
        if (big_end != null) {
            big_end.next = null;
        }
        return head;
    }
}
