package algorithm.leet_370_end;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shu on 2016/9/27.
 */
public class Perfect_Rectangle_391 {
    public boolean isRectangleCover(int[][] rectangles) {
        int lx = Integer.MAX_VALUE, ly = Integer.MAX_VALUE, mx = 0, my = 0;
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        for (int[] rec : rectangles) {
            lx = Math.min(lx, rec[0]);
            ly = Math.min(ly, rec[1]);
            mx = Math.max(mx, rec[2]);
            my = Math.max(my, rec[3]);
            sum += (rec[2] - rec[0]) * (rec[3] - rec[1]);
            String leftBot = rec[0] + " " + rec[1];
            String rightTop = rec[2] + " " + rec[3];
            String leftTop = rec[0] + " " + rec[3];
            String rightBot = rec[2] + " " + rec[1];
            if (overlap(leftBot, 1, map)) return false;
            if (overlap(leftTop, 2, map)) return false;
            if (overlap(rightTop, 4, map)) return false;
            if (overlap(rightBot, 8, map)) return false;
        }
        int count = 0;
        for (Integer key : map.values()) {
            if (key != 15 && key != 3 && key != 5 && key != 9 && key != 6 && key != 10 && key != 12) count++;
        }
        return sum == (ly - my) * (lx - mx) && count == 4;
    }

    private boolean overlap(String str, int type, Map<String, Integer> map) {
        Integer it = map.get(str);
        if (it == null) it = type;
        else if ((it & type) != 0) return true;
        else it |= type;
        map.put(str, it);
        return false;
    }
}
