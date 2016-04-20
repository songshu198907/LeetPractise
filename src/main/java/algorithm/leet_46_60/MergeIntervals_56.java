package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class MergeIntervals_56 {
    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = new ArrayList<>();
        if (intervals.size() == 0 ){
            return result;
        }
        Collections.sort(intervals, ((o1, o2) ->
                (o1.start - o2.start)
        ));
        Interval interval = intervals.get(0);
        int counting = 1;
        while (counting < intervals.size() ) {
            Interval curr = intervals.get(counting);
            if(interval.start < curr.start && interval.end >= curr.start){
                interval = mergeInterval(interval,curr);
            } else {
                result.add(interval);
                interval = intervals.get(counting);
            }
            counting++;

        }
        result.add(interval);
        return result;
    }

    private Interval mergeInterval(Interval i1, Interval i2) {
        return new Interval(Math.min(i1.start, i2.start), Math.max(i1.end, i2.end));
    }
}
