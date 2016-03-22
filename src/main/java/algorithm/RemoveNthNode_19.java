package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/18/16.
 */
public class RemoveNthNode_19 {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x) { val = x;}
    };
    public ListNode removeNthFromEnd(ListNode head, int n) {if(head == null || head.next == null)
        return null;

        ListNode faster = head;
        ListNode slower = head;

        for(int i = 0; i<n; i++)
            faster = faster.next;

        if(faster == null){
            head = head.next;
            return head;
        }

        while(faster.next != null){
            slower = slower.next;
            faster = faster.next;
        }

        slower.next = slower.next.next;
        return head;
    }
}
