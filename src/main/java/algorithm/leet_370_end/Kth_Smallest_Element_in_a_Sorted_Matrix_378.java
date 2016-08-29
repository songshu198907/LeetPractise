package algorithm.leet_370_end;

import java.util.PriorityQueue;

/**
 * Created by songheng on 8/29/16.
 */
public class Kth_Smallest_Element_in_a_Sorted_Matrix_378 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }
        int n = matrix.length;
        boolean[][] help = new boolean[n][n];
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        queue.offer(new Node(matrix[0][0], 0, 0));
        help[0][0] = true;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            k--;
            if (k == 0) return node.val;
            int row = node.row;
            int col = node.col;
            if (row + 1 < n && !help[row + 1][col]) {
                queue.offer(new Node(matrix[row + 1][col], row + 1, col));
                help[row + 1][col] = true;
            }
            if (col + 1 < n && !help[row][col + 1]) {
                queue.offer(new Node(matrix[row][col + 1], row, col + 1));
                help[row][col + 1] = true;
            }
        }
        return -2;
    }

    class Node {
        int val;
        int row;
        int col;

        public Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o1) {
            if (o1 instanceof Node) {
                Node that = (Node) o1;
                return this.row == that.row && this.col == that.col;
            }
            return false;
        }
    }
}
