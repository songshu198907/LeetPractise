package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class QuickSort {
    public int[] quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int start, int end) {
        if (start < end) {
            int q = partition(arr, start, end);
            sort(arr, start, q - 1);
            sort(arr, q + 1, end);
        }

    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int j = p - 1;
        for (int i = p; i <= r - 1; i++) {
            if (a[i] <= x) {
                j++;
                swap(a, j, i);
            }
        }
        swap(a, j + 1, r);
        return j + 1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
