package algorithm.leet_181_end;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shu on 6/5/2016.
 */
public class Maximal_Square_221 {
    public int maximalSquare(char[][] matrix) {
        int res = 0;
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int rowLen = matrix.length;
        int coLen = matrix[0].length;
        int arr[] = new int[coLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < coLen; j++) {
                if (matrix[i][j] == '1') {
                    arr[j] = arr[j] + 1;
                } else arr[j] = 0;

            }
            Queue<Integer> queue = new LinkedList<>();
            int min = 0;
            for (int j = 0; j < coLen; j++) {
                if (j >= coLen) break;
                if (queue.isEmpty()) {
                    if (arr[j] != 0) {
                        queue.offer(arr[j]);
                        min = queue.peek();
                    }
                } else {
                    if (arr[j] != 0) {
                        if (min == queue.size()) {
                            res = Math.max(res, min * min);
                            int size = queue.size();
                            for (int k = 0; k < size; k++) {
                                if (queue.peek() != min) queue.poll();
                                else {
                                    queue.poll();
                                    min = queue.isEmpty() ? 0 : queue.peek();
                                    break;
                                }
                            }
                            if(arr[j] > 1 ){
                                queue.offer(arr[j]);
                            } else {
                                queue.clear();
                                res = Math.max(1, res);
                            }
                        } else {
                            queue.offer(arr[j]);
                            if (queue.size() == arr[j]) {
                                res = Math.max(res, arr[j] * arr[j]);
                            } else {
                                if (arr[j] < queue.size()) {
                                    res = (int) Math.max(res, Math.pow(queue.size() - 1, 2));
                                    queue.clear();
                                    min = arr[j];
                                    queue.offer(arr[j]);
                                } else {
                                    min = Math.min(min, arr[j]);
                                }
                            }

                        }
                    } else {
                        res = Math.max(res, queue.size() * queue.size());
                        queue.clear();
                    }


                }
            }
            if (!queue.isEmpty()){

                res = Math.max(res, queue.size() * queue.size());
                queue.clear();
            }


        }
        return res;
    }
}
