package datastructure;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by shu on 6/20/2016.
 */
public class Sorting implements Serializable, Cloneable {
    private static int[] countingSort(int[] a, int k) {
        int n = a.length;
        int[] c = new int[k];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            b[c[a[j]] - 1] = a[j];
            c[a[j]]--;
        }
        return b;

    }

    private static int[] countingSort_r(int[] a, int k, int[] d) {
        int n = a.length;
        int[] c = new int[k];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            b[c[a[j]] - 1] = d[j];
            c[a[j]]--;
        }
        return b;

    }

    private static int[] radixSort(int[] d, int wordLength) {
        int n = d.length;
        int[] tmp = new int[n];
        int base = 1;
        while (wordLength != 0) {
            base = base * 10;
            for (int i = 0; i < n; i++) {
                tmp[i] = d[i] % base;
                tmp[i] /= base / 10;
            }
            int[] sorted = countingSort_r(tmp, 10, d);
            for (int i = 0; i < n; i++) {
                d[i] = sorted[i];
            }
            wordLength--;

        }
        return d;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (10 << i) - i;
        }
        System.out.println("Before \n" + Arrays.toString(arr));
        System.out.println("After\n" + Arrays.toString(countingSort(arr, (10 << 10))));
        System.out.println("After\n" + Arrays.toString(radixSort(arr, 10)));
    }
}
