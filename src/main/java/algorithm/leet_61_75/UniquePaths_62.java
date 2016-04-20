package algorithm.leet_61_75;

/**
 * Created by songheng on 3/30/16.
 */
public class UniquePaths_62 {
    private int path ;
    public int uniquePaths(int m, int n) {

        if(m<=0 || n<=0)
            return 0;
        int[] res = new int[n];
        res[0] = 1;
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                res[j] += res[j-1];
            }
        }
        return res[n-1];

    }
    private void runner(int row ,int col ,int m, int n){
        if(row >= m || col >= n){
            return;
        }
        if(row == m - 1 && col == n -1){
            path++;
        }
        runner(row+1,col,m,n);
        runner(row,col+1,m,n);

    }
    private int getPathNumber(int row , int col ){
        int sum = 0 ;
       if(row == 0 && col == 0){
           return 0 ;
       }
        if(row > 0 ){
            sum += getPathNumber(row - 1,col);
        }
        if(col > 0){
            sum += getPathNumber(row,col-1);
        }
        return sum;
    }
}
