package algorithm.leet_321_350;

import java.util.*;

/**
 * Created by songheng on 8/22/16.
 */
public class SummaryRanges {
    /**
     * Initialize your data structure here.
     */

    Set<Interval> intervals;
    Map<Integer, Interval[]> map;
    Set<Integer> num;

    public SummaryRanges() {
        intervals = new TreeSet<>((o1, o2) -> o1.start - o2.start);
        map = new HashMap<>();
        num = new HashSet<>();

    }

    public void addNum(int val) {
        if (num.contains(val)) return;
        num.add(val);
        Interval it = new Interval(val, val);
        if (map.containsKey(val)) {
            Interval[] its = map.get(val);
            if (its[0] != null) {
                intervals.remove(its[0]);
                it.start = its[0].start;
                its[0].end = it.end;
            }
            if (its[1] != null) {
                intervals.remove(its[1]);
                it.end = its[1].end;
                its[1].start = it.start;

            }
            map.remove(val);
        }

        if (map.containsKey(it.end + 1)) {
            map.get(it.end + 1)[0] = it;
        } else {
            Interval[] itvals = new Interval[2];
            itvals[0] = it;
            map.put(it.end + 1, itvals);
        }

        if (map.containsKey(it.start - 1)) {
            map.get(it.start - 1)[1] = it;
        } else {
            Interval[] itvals = new Interval[2];
            itvals[1] = it;
            map.put(it.start - 1, itvals);
        }
        intervals.add(it);


    }

    public List<Interval> getIntervals() {
        return new ArrayList<>(intervals);
    }

}
