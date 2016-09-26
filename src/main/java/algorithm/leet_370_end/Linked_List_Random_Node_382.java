package algorithm.leet_370_end;

import algorithm.leet_61_75.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by shu on 2016/9/25.
 */
public class Linked_List_Random_Node_382 {
    List<ListNode> list = new ArrayList<>();

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public Linked_List_Random_Node_382(ListNode head) {
        while (head != null) {
            list.add(head);
            head = head.next;
        }
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size())).val;
    }
}
