package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 5/24/16.
 */
public class Course_Schedule_207 {
    private HashMap<Integer, ArrayList<Integer>> map;
    private int totalAva = 0;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] arr = new int[numCourses];
        totalAva = numCourses;
        map = new HashMap<>();
        loadMap(prerequisites, arr);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int val = queue.poll();
                if (arr[val] == 0 && map.containsKey(val)) {
                    ArrayList<Integer> integers = map.get(val);
                    for (Integer integer : integers) {
                        arr[integer]--;
                        if (arr[integer] == 0) {
                            queue.offer(integer);
                            totalAva++;
                        }
                    }
                    map.remove(val);
                }
            }
        }


        return totalAva == numCourses;

    }

    private void loadMap(int[][] prerequisites, int[] arr) {
        for (int[] prerequisite : prerequisites) {
            int value = prerequisite[0];
            int key = prerequisite[1];
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(value);
            if (arr[value] == 0) {
                totalAva--;
                arr[value] = 1;
            } else arr[value]++;
        }
    }
}
