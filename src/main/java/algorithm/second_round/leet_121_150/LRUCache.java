package algorithm.second_round.leet_121_150;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shu on 2016-10-16.
 */
public class LRUCache {
    private int count;
    private int capacity;
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        count = 0;
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.last = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        moveToEnd(map.get(key));
        return map.get(key).val;
    }

    private void moveToEnd(Node node) {
        if (map.containsKey(node.key)) {
            Node nxt = node.next;
            node.last.next = nxt;
            nxt.last = node.last;
        }
        Node last = tail.last;
        last.next = node;
        tail.last = node;
        node.next = tail;
        node.last = last;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            moveToEnd(node);
        } else {
            if (count == capacity) {
                Node toDel = head.next;
                toDel.next.last = head;
                head.next = toDel.next;
                map.remove(toDel.key);
            }
            Node node = new Node(key, value);
            moveToEnd(node);
            map.put(key, node);
            if (count < capacity) count++;

        }
    }

    static class Node {
        int key;
        int val;
        Node last;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.last = null;
            this.next = null;
        }
    }
}
