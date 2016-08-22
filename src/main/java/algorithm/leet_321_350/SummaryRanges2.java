package algorithm.leet_321_350;

import java.util.*;

/**
 * Created by songheng on 8/22/16.
 */
public class SummaryRanges2 {
    Interval[] arr;
    List<Interval> intervals;
    Set<Integer> list;
    Set<Integer> set;

    public SummaryRanges2() {
        set = new HashSet<>();
        arr = new Interval[10000];
        intervals = new ArrayList<>();
        list = new TreeSet<>();
    }

    public void addNum(int val) {
        if (set.contains(val)) return;
        set.add(val);
        int small = val - 1;
        int large = val + 1;
        if (small >= 0 && arr[small] != null && arr[large] != null) {
            int end = arr[large].end;
            list.remove(val + 1);
            intervals.remove(arr[large]);
            arr[small].end = end;
            arr[end] = arr[small];
        } else if (small >= 0 && arr[small] != null) {
            arr[small].end = val;
            arr[val] = arr[small];
        } else if (arr[large] != null) {
            arr[large].start = val;
            arr[val] = arr[large];
            list.remove(val + 1);
            list.add(val);
        } else {
            arr[val] = new Interval(val, val);
            intervals.add(arr[val]);
            list.add(val);
        }
    }

    public List<Interval> getIntervals() {
        intervals.clear();
        for (int i : list) {
            intervals.add(arr[i]);
        }
        return intervals;
    }
}
