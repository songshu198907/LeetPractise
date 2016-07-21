package algorithm.leet_181_end;


import java.util.*;

/**
 * Created by songheng on 7/21/16.
 */
public class Minimum_Height_Trees_310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        if (n == 1) {
            list.add(0);
            return list;
        }
        Map<Integer, List<Integer>> map = new HashMap();
        int[] d = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int[] edge : edges) {
            int num1 = edge[0];
            int num2 = edge[1];
            if (!map.containsKey(num1)) {
                map.put(num1, new ArrayList<>());
            }
            if (!map.containsKey(num2)) {
                map.put(num2, new ArrayList<>());
            }
            map.get(num1).add(num2);
            d[num1]++;
            map.get(num2).add(num1);
            d[num2]++;
        }
        for (int i = 0; i < n; i++) {
            if (d[i] == 1)
                queue.offer(i);
        }
        while (n > 2) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int ele = queue.poll();
                --n;
                List<Integer> lst = map.get(ele);
                for (Integer integer : lst) {
                    --d[integer];
                    if (d[integer] == 1)
                        queue.offer(integer);
                }
            }
        }
        list.addAll(queue);


        return list;
    }
}
