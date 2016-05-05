package algorithm.leet_91_105;

import algorithm.ListNode;

/**
 * Created by songheng on 5/5/16.
 */
public class ReverseLinkedListII_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        int min = Math.min(m, n) - 1;
        int max = Math.max(m, n) - 1;
        int counter = 1;
        ListNode hd, tail, pNext;
        ListNode tmp = head;
        if (min == 0) {
            if (max == 1) {
                hd = head.next.next;
                tail = head.next;
                head.next = hd;
                tail.next = head;
                head = tail;
            } else {
                tail = head;
                hd = head;
                pNext = head.next;
                while (counter <= max) {
                    tmp = pNext;
                    pNext = pNext.next;
                    tmp.next = hd;
                    hd = tmp;
                    counter++;
                }
                tail.next = pNext;
                head = hd;
            }
        } else {
            ListNode bp1;
            while (counter < min) {
                tmp = tmp.next;
                counter++;
            }
            bp1 = tmp;
            tmp = tmp.next;
            tail = tmp;
            hd = tmp;
            pNext = tmp.next;
            while (counter < max) {
                tmp = pNext;
                if (pNext != null) {

                    pNext = pNext.next;
                }
                tmp.next = hd;
                hd = tmp;
                counter++;
            }
            bp1.next = hd;
            tail.next = pNext;
        }
        return head;
    }
}
