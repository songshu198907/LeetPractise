package algorithm.leet_181_320;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by songheng on 5/27/16.
 */
public class The_Skyline_Problem_218 {
    private int insert = 0;

    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> skylines = new ArrayList<>();
        if (buildings.length == 0)
            return skylines;
        if (buildings.length == 1) {
            skylines.add(new int[]{buildings[0][0], buildings[0][2]});
            skylines.add(new int[]{buildings[0][1], 0});
            return skylines;
        }
        LinkedList<Range> rangeList = new LinkedList<>();
        rangeList.add(new Range(buildings[0][0], buildings[0][1], buildings[0][2]));
        for (int i = 1; i < buildings.length; i++) {
            helper(buildings[i], rangeList);
        }
        for (Range range : rangeList) {
            skylines.add(new int[]{range.start, range.h});
        }
        skylines.add(new int[]{rangeList.get(rangeList.size() - 1).end, 0});
        return skylines;
    }

    private void helper(int[] nums, LinkedList<Range> rangeList) {
        int start = nums[0];
        int end = nums[1];
        int h = nums[2];
        Range nRange = new Range(start, end, h);
        checkLater(rangeList,nRange);


    }

    private void checkLater(List<Range> rangeList, Range nRange) {
        int pos = -1;
        ArrayList<Range> toDel = new ArrayList<>();
        for (int i = insert; i < rangeList.size(); i++) {
            Range range = rangeList.get(i);
            if (range.start >= nRange.end) break;
            if (nRange.start >= nRange.end) break;
            if (range.end <= nRange.start) continue;
            if (range.h < nRange.h) {
                if (range.start >= nRange.start && range.end <= nRange.end) {
                    toDel.add(range);
                    pos = i;
                } else if (range.start >= nRange.start && range.start <= nRange.end) {
                    range.start = nRange.end;
                    pos = i + 1;
                } else if (range.end >= nRange.start && range.end <= nRange.end) {
                    range.end = nRange.start;
                    pos = i + 1;
                } else {
                    int tmp = range.end;
                    range.end = nRange.start;
                    Range split = new Range(nRange.end, tmp, range.h);
                    pos = i + 1;
                    rangeList.add(i + 1, split);
                }
            } else {
                if (nRange.start >= range.start && nRange.end <= range.end) return;
                if (nRange.start <= range.start && nRange.end >= range.end) {
                    Range split = new Range(nRange.start, range.start, nRange.h);
                    rangeList.add(i, split);
                    nRange.start = range.end;
                } else if (nRange.start <= range.start && nRange.end >= range.start) {
                    nRange.end = range.start;
                    pos = i ;
                } else {
                    nRange.start = range.end;
                }

            }
        }
        Range last = rangeList.get(rangeList.size()-1);
        if(pos < 0 && last.end <= nRange.start){
            if(last.end < nRange.start){
                rangeList.add(new Range(last.end,nRange.start,0));
            }
            pos = rangeList.size();
        }


        rangeList.removeAll(toDel);
        if(pos>=0)
            rangeList.add(pos,nRange);

    }


    private class Range {
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
