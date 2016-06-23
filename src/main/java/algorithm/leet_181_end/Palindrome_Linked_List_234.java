package algorithm.leet_181_end;

import algorithm.ListNode;

/**
 * Created by shu on 6/20/2016.
 */
public class Palindrome_Linked_List_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        boolean odd = false;
        while (fast != null) {
            if (fast.next == null) {
                odd = true;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        if (odd) slow = slow.next;
        ListNode start = head;
        ListNode last = slow.next;
        slow.next = null;
        while (last != null) {
            ListNode tmp = last.next;
            last.next = slow;
            slow = last;
            last = tmp;
        }
        while (slow != null && start != null) {
            if (slow.val == start.val) {
                slow = slow.next;
                start = start.next;
            } else return false;
        }
        return true;
    }

}
