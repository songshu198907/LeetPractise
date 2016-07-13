package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shu on 7/9/2016.
 */
public class Perfect_Squares_279 {

    public int numSquares(int n) {
        int res = 0;
        boolean found = false;
        if (n <= 0) return 0;
        List<Integer> list = new ArrayList<>();
        int cnt = 1, prod = 1;
        do {
            prod = cnt * cnt;
            list.add(prod);
            cnt++;
        } while (prod <= n);
        list.remove(list.size() - 1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            for (int i = 0; i < size && found == false; i++) {
                int val = queue.poll();
                for (int j = list.size() - 1; j >= 0; j--) {
                    int num = list.get(j);
                    int diff = val - num;
                    if (diff == 0) {
                        found = true;
                        break;
                    }
                    if (diff > 0) {
                        queue.offer(diff);
                    }
                }

            }
            res++;
        }

        return res;
    }


}
