package algorithm.leet_136_150;

import algorithm.ListNode;

/**
 * Created by songheng on 5/16/16.
 */
public class SortList_148 {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }
        return biSort(head);
    }

    private ListNode biSort(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head.next == null) {
            return head;
        }
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                break;
            } else fast = fast.next.next;
        }
        ListNode left = head, right = slow;
        while (head.next != slow) {
            head = head.next;
        }
        head.next = null;

        return merge(biSort(left), biSort(right));

    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head, tail;
        if (left.val < right.val) {
            head = left;
            tail = left;
            left = left.next;
        } else {
            head = right;
            tail = right;
            right = right.next;
        }
        while (left != null && right != null) {
            if (left.val <= right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if (left != null) {
            tail.next = left;
        }
        if (right != null) {
            tail.next = right;
        }
        return head;
    }
}
