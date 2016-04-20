package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class InsertInterval57_2 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        if(intervals.size() == 0 ){
            intervals.add(newInterval);
            return intervals;
        }
        int pos = 0;
        for( int i = 0 ; i < intervals.size() ; i++){
            Interval tmp = intervals.get(i);
            if(tmp.end < newInterval.start){
                pos++;
            }
            if(tmp.start > newInterval.end || tmp.end < newInterval.start ){
                res.add(tmp);
            }
            else {
                newInterval =  mergeInterval(newInterval,tmp);
            }
        }
        res.add(pos,newInterval);

        return  res;
    }
    private Interval mergeInterval(Interval i1, Interval i2) {
        return new Interval(Math.min(i1.start, i2.start), Math.max(i1.end, i2.end));
    }
}
