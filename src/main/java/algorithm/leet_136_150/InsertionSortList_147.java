package algorithm.leet_136_150;

import algorithm.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/16/16.
 */
public class InsertionSortList_147 {

    public ListNode insertionSortList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();

        if (head == null) return head;
        while (head != null) {
            insert(head, nodes);
            head = head.next;

        }

        return link(nodes);
    }

    private void insert(ListNode node, List<ListNode> nodes) {
        if (nodes.isEmpty()) {
            nodes.add(node);
        } else {
            int i = 0;
            for (; i < nodes.size(); i++) {
                if (node.val < nodes.get(i).val) {
                    break;
                }
            }
            nodes.add(i, node);
        }

    }

    private ListNode link(List<ListNode> nodes) {
        ListNode head = nodes.get(0);
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }
        nodes.get(nodes.size() - 1).next = null;
        return head;
    }
}
