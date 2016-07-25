package algorithm.leet_181_320;

/**
 * Created by songheng on 6/8/16.
 */
public class Rectangle_Area_223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        int area = area1 + area2;
        int dup = 0;
        if (A >= G || B >= H || E >= C || F >= D) return area;
        int top = Math.min(D, H);
        int right = Math.min(C, G);
        int bot = Math.max(B, F);
        int left = Math.max(A, E);
        dup = (top - bot) * (right - left);


        return area - dup;
    }


}
