package algorithm.leet_136_150;

import algorithm.ListNode;

import java.util.ArrayList;

/**
 * Created by shu on 5/14/2016.
 */
public class ReorderList_143 {
    public void reorderList(ListNode head) {
        ListNode tail = head;
        ArrayList<ListNode> list = new ArrayList<>();
        if (head == null || head.next == null) {
            return;
        }
        while (tail != null) {
            list.add(tail);
            tail = tail.next;
        }
        tail = head;
        int start = 0, end = list.size() - 1;
        while (start < end) {
            tail.next = list.get(end--);
            tail = tail.next;
            tail.next = list.get(++start);
            tail = tail.next;

        }
        tail.next = null;
    }
}
