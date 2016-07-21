package algorithm.leet_181_end;

/**
 * Created by songheng on 7/21/16.
 */
public class Sparse_Matrix_Multiplication_311 {
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] product = new int[A.length][B[0].length];
        for (int pi = 0; pi < A.length; pi++)
            for (int pj = 0; pj < B[0].length; pj++) {
                int res = 0;
                for (int aj = 0; aj < A[pi].length; aj++) {
                    if (A[pi][aj] == 0 || B[aj][pj] == 0) continue;
                    res += A[pi][aj] * B[aj][pj];
                }
                product[pi][pj] = res;
            }
        return product;

    }
}
