package algorithm.second_round.leet_121_150;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shu on 2016-10-16.
 */
public class MaxPointsonLine_149 {
    public int maxPoints(Point[] points) {
        Map<Double, Integer> map = new HashMap<>();
        if (points == null || points.length == 0) return 0;
        int max = 1;
        for (int i = 0; i < points.length - 1; i++) {

            int times = 0;
            int same = 1;
            Point first = points[i];
            map.clear();
            for (int j = i + 1; j < points.length; j++) {
                Point second = points[j];
                if (second.x == first.x && second.y == first.y) {
                    same++;
                } else {
                    double k = (second.x == first.x) ? Integer.MIN_VALUE : 0.0 + (second.y - first.y) * 1.0 / (second.x - first.x);
                    if (map.containsKey(k)) {
                        int value = map.get(k) + 1;
                        times = Math.max(value, times);
                        map.put(k, value);
                    } else {
                        map.put(k, 1);
                        times = Math.max(times, 1);
                    }
                }
            }
            max = Math.max(times + same, max);

        }

        return max;

    }

    public static class Point {
        int x;
        int y;

        public Point(int a, int b) {
            this.x = a;
            this.y = b;
        }

        public Point() {
            this(0, 0);
        }
    }

}
