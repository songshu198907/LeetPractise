package algorithm.leet_136_150;

import algorithm.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shu on 5/13/2016.
 */
public class CopyListwithRandomPointer_138 {
    private Map<RandomListNode, RandomListNode> map = new HashMap<>();

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) {
            return null;
        }
        RandomListNode cloned;
        if (map.containsKey(head)) {
            cloned = map.get(head);
        } else {
            cloned = new RandomListNode(head.label);
            map.put(head, cloned);
        }
        if (!map.containsKey(head.next)) {
            cloned.next = copyRandomList(head.next);
        } else {
            cloned.next = map.get(head.next);
        }
        if (!map.containsKey(head.random))
            cloned.random = copyRandomList(head.random);
        else
            cloned.random = map.get(head.random);

        return cloned;
    }

    public RandomListNode copyRandomList2(RandomListNode head) {
        if (head == null) {
            return null;
        }
        insertNext(head);
        addRandom(head);
        return split(head);

    }

    private void insertNext(RandomListNode head) {
        while (head != null) {
            RandomListNode nNode = new RandomListNode(head.label);
            nNode.next = head.next;
            head.next = nNode;
            head = head.next.next;
        }
    }

    private void addRandom(RandomListNode head) {
        while (head != null) {
            if (head.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }

    private RandomListNode split(RandomListNode head) {
        RandomListNode nHead = head.next;
        while (head != null) {
            RandomListNode tmp = head.next;
            head.next = tmp.next;
            head = head.next;
            if (tmp.next != null) {
                tmp.next = tmp.next.next;
            }
        }
        return nHead;
    }
}
