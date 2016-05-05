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
        ListNode first, second, third, forth;
        ListNode tmp = head;
        ListNode point1, point2;
        int counter = 1;
        if (min == 0) {
            while (counter < max) {
                counter++;
                tmp = tmp.next;
            }
            first = tmp.next;
            second = first.next;
            if(first != head.next)
            {
                first.next = head.next;
                tmp.next = head;
                head.next = second;
            } else {
                first.next= head;
                head.next = second;
            }
            head = first;
        } else {

            while (counter < min) {
                counter++;
                tmp = tmp.next;
            }
            first = tmp.next;
            point1 = tmp;
            second = first.next;

            while (counter < max) {
                counter++;
                tmp = tmp.next;
            }
            point2 = tmp;
            third = tmp.next;
            forth = third.next;
            if(third != first.next){
                point1.next = third;
                third.next = second;
                point2.next = first;
                first.next = forth;
            } else {
                point1.next = third;
                third.next = first;
                first.next = forth;
            }




        }
        return head;
    }
}
