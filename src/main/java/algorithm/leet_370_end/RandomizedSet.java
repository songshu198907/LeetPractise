package algorithm.leet_370_end;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by songheng on 8/29/16.
 */
public class RandomizedSet {

    private HashSet<Integer> set;
    private int total;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        set = new HashSet<>();
        total = 0;
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean res = set.add(val);
        if (res) total++;
        return res;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        boolean res = set.remove(val);
        if (res) total--;
        return res;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int pos = new Random().nextInt(total);
        for (int i : set) {
            if (pos-- == 0)
                return i;
        }
        return -1;
    }

}
