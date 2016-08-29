package algorithm.leet_370_end;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by songheng on 8/29/16.
 */
public class RandomizedCollection {
    private List<Node> coll;
    private HashMap<Integer, List<Node>> map;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        coll = new ArrayList<>();
        map = new HashMap<>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean res = map.containsKey(val);
        if (!res) map.put(val, new ArrayList<>());
        Node node = new Node(val);
        map.get(val).add(node);
        coll.add(node);
        return res;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        boolean res = map.containsKey(val);
        if (res) {
            Node p = map.get(val).remove(0);
            if (map.get(val).isEmpty()) map.remove(val);
            coll.remove(p);
        }
        return res;

    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return coll.get(new Random().nextInt(coll.size())).val;
    }

    class Node {
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
