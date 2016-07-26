package algorithm.leet_321_350;

import algorithm.ListNode;

/**
 * Created by songheng on 7/26/16.
 */
public class Odd_Even_Linked_List_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode tail = evenHead.next;
        ListNode tmp1 = oddHead, tmp2 = evenHead;
        while (tail != null) {
            ListNode first = tail.next;
            tmp1.next = tail;
            tmp1 = tmp1.next;
            if (first == null) {
                tmp2.next = null;
                break;
            }
            ListNode second = first.next;
            tmp2.next = first;
            tmp2 = tmp2.next;
            tail = second;
        }
        if (tmp2.next != null) tmp2.next = null;
        tmp1.next = evenHead;
        return oddHead;
    }
}
