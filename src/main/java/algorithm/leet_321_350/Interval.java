package algorithm.leet_321_350;

/**
 * Created by songheng on 8/22/16.
 */
public class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Interval() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return "[" +
                start +
                ", " + end +
                "]";
    }
}
