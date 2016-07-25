package algorithm.leet_321_350;

/**
 * Created by songheng on 7/25/16.
 */
public class Number_of_Connected_Components_in_an_Undirected_Graph_323 {
    public int countComponents(int n, int[][] edges) {
        int cnt = n;
        int[] arr = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            weight[i] = 1;
        }
        for (int[] edge : edges) {
            int num1 = edge[0];
            int num2 = edge[1];
            if (find(arr, num1, num2)) continue;
            int root1 = root(arr, num1);
            int root2 = root(arr, num2);
            if (weight[root1] >= weight[root2]) {
                arr[root2] = root1;
                weight[root1] += weight[root2];
            } else {
                arr[root1] = root2;
                weight[root2] += weight[root1];
            }
            cnt--;
        }
        return cnt;
    }

    private boolean find(int[] arr, int a, int b) {
        return root(arr, a) == root(arr, b);
    }

    private int root(int[] arr, int number) {
        int tmp = number;
        while (arr[tmp] != tmp) {
            arr[tmp] = arr[arr[tmp]];
            tmp = arr[tmp];
        }
        return tmp;
    }

}
