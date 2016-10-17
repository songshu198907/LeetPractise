package algorithm.second_round.leet_211_240;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by songheng on 10/17/16.
 */
public class TheSkyProblem_218 {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> res = new ArrayList<>();
        List<int[]> lines = new ArrayList<>();
        for (int[] building : buildings) {
            lines.add(new int[]{building[0], -building[2]});
            lines.add(new int[]{building[1], building[2]});
        }
        Collections.sort(lines, (o1, o2) ->
                o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]
        );
        int prev = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(11, (o1, o2) -> o2 - o1);
        queue.offer(0);
        for (int[] line : lines) {
            if (line[1] >= 0) {
                queue.remove(line[1]);
            } else {
                queue.offer(-line[1]);
            }
            if (prev != queue.peek()) {
                res.add(new int[]{line[0], queue.peek()});
                prev = queue.peek();
            }
        }
        return res;
    }
}
