package algorithm.leet_46_60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 3/29/16.
 */
public class Interval {
    int start;
    int end;

    public Interval() {
        this.start = 0;
        this.end = 0;
    }

    public Interval(int x, int y) {
        this.start = x;
        this.end = y;
    }

    @Override
    public final String toString() {
        return "[" + this.start + "," + this.end + "]";
    }
    public static List<Interval> listBuilder(int[][] elements){
        List<Interval> res = new ArrayList<>();
        for( int[] eles : elements){
            Interval interval = new Interval(eles[0],eles[1]);
            res.add(interval);
        }
        return  res;
    }


}
