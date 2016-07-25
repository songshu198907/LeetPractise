package algorithm.leet_181_320;

import algorithm.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/23/16.
 */
public class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        List<ListNode> lists = new ArrayList<>();
        if (head == null) {
            return head;
        }
        ListNode tmp = head;
        while (tmp != null) {
            lists.add(tmp);
            tmp = tmp.next;
        }
        for (int i = lists.size() - 1; i >= 1; i--) {
            lists.get(i).next = lists.get(i - 1);
        }
        lists.get(0).next = null;
        return lists.get(lists.size() - 1);

    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {

            return head;
        }
        ListNode node = head;
        ListNode next = head.next;
        node.next = null;
        while (next.next != null) {
            ListNode tmp = next.next;
            next.next = node;
            node = next;
            next = tmp;

        }
        next.next = node;
        head = next;
        return head;
    }
}
