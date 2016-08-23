package algorithm.leet_351_365;

import java.util.*;

/**
 * Created by shu on 2016/8/22.
 */
public class Russian_Doll_Envelopes_354 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> rows = new ArrayList<>();
        for (int[] arr : envelopes) {
            int key = arr[0];
            int val = arr[1];
            if (map.containsKey(key)) {
                map.get(key).add(val);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(val);
                map.put(key, list);
            }
            if (!rows.contains(key)) rows.add(key);
        }
        Collections.sort(rows);
        for (Integer row : rows) {
            Collections.sort(map.get(row));
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows.size(); i++) {
            queue.offer(new int[]{rows.get(i), map.get(rows.get(i)).get(0)});
        }
        int layer = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Map<Integer, Integer> min = new HashMap<>();
            for (int i = 0; i < size; i++) {
                int[] arr = queue.poll();
                int pos = rows.indexOf(arr[0]);
                for (int j = pos + 1; j < rows.size(); j++) {
                    int r = rows.get(j);
                    if (min.containsKey(r)) {
                        int minNum = min.get(r);
                        for (Integer it : map.get(r)) {
                            if (it >= minNum) break;
                            if (it > arr[1] && it < minNum) {
                                min.put(r, minNum);
                                queue.offer(new int[]{r, minNum});
                                break;
                            }
                        }
                    } else {
                        for (Integer it : map.get(r)) {
                            if (it > arr[1]) {
                                min.put(r, it);
                                queue.offer(new int[]{r, it});
                                break;
                            }
                        }
                    }
                }
            }
            layer++;
        }
        return layer;
    }
}
