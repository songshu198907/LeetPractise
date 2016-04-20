package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class InsertInterval_57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        Collections.sort(intervals, ((o1, o2) -> (o1.start - o2.start)));
        int counter = 0;
        for (; counter < intervals.size(); counter++) {
            Interval tmp = intervals.get(counter);
            if (newInterval.start > tmp.start) {
                continue;
            } else {
                break;

            }
        }
        intervals.add(counter, newInterval);
        if (counter > 0 && newInterval.start <= intervals.get(counter - 1).end) {
            counter = counter - 1;
        }
        intervals = merge(intervals, counter);

        return intervals;
    }

    private List<Interval> merge(List<Interval> intervals, int start) {
        List<Interval> res = new ArrayList<>();
        boolean merge = true;
        for (int i = 0; i < start; i++) {
            res.add(intervals.get(i));
        }
        Interval merged = intervals.get(start);
        for (int i = start + 1; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            if (merge) {
                if (merged.start <= tmp.start && merged.end >= tmp.start) {
                    merged = new Interval(Math.min(merged.start, tmp.start), Math.max(merged.end, tmp.end));
                } else {
                    merge = false;
                    res.add(merged);
                    merged = tmp;
                }
            } else {
                res.add(merged);
                merged = tmp;

            }

        }
        res.add(merged);

        return res;

    }
}
