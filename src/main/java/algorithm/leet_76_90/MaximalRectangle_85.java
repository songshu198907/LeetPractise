package algorithm.leet_76_90;

import java.util.Stack;

/**
 * Created by songheng on 4/29/16.
 */
public class MaximalRectangle_85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        int[][] height = new int[m][n + 1];
        int maxArea = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '0'){
                    height[i][j] = 0;
                }else {
                    height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            int area = maxAreaInHist(height[i]);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    private int maxAreaInHist(int[] height){
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int maxArea = 0;
        while(i < height.length){
            if(stack.isEmpty() || height[stack.peek()] <= height[i]){
                stack.push(i++);
            }else {
                int t = stack.pop();
                maxArea = Math.max(maxArea, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return maxArea;
    }

}
