package algorithm.leet_61_75;

/**
 * Created by songheng on 3/29/16.
 */
public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if( k == 0){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int step = 0;
        while (step < k) {
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
            step++;
        }
        step++;
        if (step <= k) {
            k = k % step;
            return rotateRight(head, k);


        } else {
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = head;
            head = slow.next;
            slow.next = null;
        }
        return head;
    }
}
