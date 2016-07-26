package algorithm.leet_321_350;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 7/26/16.
 */
public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {
    public boolean isValidSerialization(String preorder) {
        if (preorder == null || preorder.length() == 0) return true;
        String tmp[] = preorder.split(",");
        Queue<String> queue = new LinkedList<>();
        if (tmp[0].trim().equals("#")) {
            return tmp.length == 1;
        }
        queue.offer(tmp[0]);
        int cnt = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                queue.poll();
                if (cnt < tmp.length) {
                    String str = tmp[cnt++];
//                    if(!str.trim().equals("#"))
                }
            }
        }


        return true;
    }
}
