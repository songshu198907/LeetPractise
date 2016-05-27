package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/27/16.
 */
public class The_Skyline_Problem_218 {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> skylines = new ArrayList<>();
        if (buildings.length == 0)
            return skylines;
        int fend = 0;
        int last = 0;
        int impacted = 0;
        Range[] ranges = new Range[20000];
        for (int[] building : buildings) {
            int start = building[0];
            int end = building[1];
            int h = building[2];
            int pos = 0;
            if (last == 0) {
                ranges[last++] = new Range(start, end, h);

                fend = end;
                continue;
            }
            while (pos < ranges.length && ranges[pos] != null) {
                for (int i = impacted + 1; ranges[i] != null; i++) {

                }
                Range range = ranges[pos++];
                int rangeEnd = range.end;
                if (range.h < h) {
                    if (start < rangeEnd) {
                        range.end = start;
                        ranges[last++] = new Range(start, end, h);

                        if (rangeEnd > end) {
                            ranges[last++] = new Range(end, rangeEnd, range.h);

                        } else {
                            fend = end;
                        }

                    } else {
                        ranges[last++] = new Range(start, end, h);
                        fend = end;
                    }
                } else if (range.h == h) {
                    range.end = Math.max(end, range.end);
                    fend = range.end;
                } else {
                    if (end > range.end) {
                        ranges[last++] = new Range(range.end, end, h);
                        fend = end;
                    }

                }
            }
        }
        for (int i = 0; i < last; i++) {
            Range range = ranges[i];
            skylines.add(new int[]{range.start, range.h});
        }
        skylines.add(new int[]{fend, 0});
        return skylines;
    }

    class Range {
        int start;
        int end;
        int h;

        public Range(int start, int end, int h) {
            this.start = start;
            this.end = end;
            this.h = h;
        }
    }
}
