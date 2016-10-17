package algorithm.leet_1_30;

import algorithm.ListNode;

/**
 * Created by shu on 2016/10/3.
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, pre = null;
        boolean carrier = false;
        while (l1 != null || l2 != null) {
            int left = 0;
            int right = 0;
            if (l1 != null) {
                left = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                right = l2.val;
                l2 = l2.next;
            }
            int sum = left + right + (carrier ? 1 : 0);
            carrier = sum >= 10;
            int digit = sum % 10;
            ListNode node = new ListNode(digit);
            if (head == null) {
                head = node;
                pre = node;
            } else {
                pre.next = node;
                pre = pre.next;
            }
        }
        if (carrier) pre.next = new ListNode(1);

        return head;

    }
}
