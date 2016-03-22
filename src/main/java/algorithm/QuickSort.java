package algorithm;

import java.util.Arrays;

/**
 * Created by songheng on 3/2/16.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));

        swap(a, 2, 5);
        System.out.println(Arrays.toString(a));


    }

    public static int findMedian(int[] arr,int left,int right) {
        int median = -1;
        if (arr == null || arr.length < 3) {
            throw new RuntimeException("This array is not compatible with findMedian function! ");

        } else {

            int center = (left + right) / 2;
            if (arr[left] > arr[center]) {
                swap(arr, left, center);
            }
            if (arr[left] > arr[right]) {
                swap(arr, left, right);
            }
            if (arr[center] > arr[right]) {
                swap(arr, center, right);
            }
            swap(arr, center, right - 1);
            median = arr[right - 1];
        }
        return median;
    }

    public static void swap(int[] arr, int a, int b) {
        if (arr == null || arr.length < b || a > b) {
            throw new RuntimeException("Failed to use swap function");

        } else {
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
    }

    public int[] qucikSort(int[] arr, int left ,int right) {

        if (arr == null) {
            throw new RuntimeException("arr cannot be null");
        } else if (right-left<=4) {
//            arr = InsertSort.mSort(arr);
        } else {
            int i = left, j =right -1;
            int pivot = findMedian(arr,left,right);
            while (true) {
                while (arr[++i] < pivot) {
                    continue;
                }
                while (arr[--j] > pivot) {
                    continue;
                }
                if (i < j) {
                    swap(arr, i, j);
                } else {
                    break;
                }

            }
            swap(arr, i, arr.length - 2);
            int[] leftarr = qucikSort(arr,left,i-1);
            int[] rightarr = qucikSort(arr,i+1,right);

        }

        return null;

    }
}
