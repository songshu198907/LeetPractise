package algorithm.leet_61_75;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
        this.val = 0;
    }

    public static ListNode buildList(int[] elements) {
        ListNode head = new ListNode();
        ListNode tail = head;
        for (int ele : elements) {
            ListNode node = new ListNode(ele);
            tail.next = node;
            tail = tail.next;
        }
        return head.next;
    }

    public void print() {
        ListNode node = this;
        List<Integer> nodes = new ArrayList<>();
        while (node != null) {
            nodes.add(node.val);
            node = node.next;
        }
        System.out.println(nodes);
    }

}
