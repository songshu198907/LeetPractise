package algorithm;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by songheng on 3/2/16.
 */
public class InsertSort {
    public static void main(String[] args) {
        System.out.println("kan kan neng bu neng yong !");
        int[] a = new int[1000];
        int[] b = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int value = (int) (new Random().nextDouble() * 10000);
            a[i] = value;
            b[i] = value;
        }
        System.out.println("before:\t" + Arrays.toString(a));
        testPara(a);
        testPara(b);
        System.out.println("after:\t" + Arrays.toString(a));
        Date start = new Date();
        mSort(a, 0, a.length - 1);
        System.out.println("After sort: " + Arrays.toString(a));
        Date end = new Date();
        long diff = end.getTime() - start.getTime();
        System.out.println("Duration" + diff * 1.0 / 1000 + "  s");
        Arrays.sort(b);
        Assert.assertArrayEquals("A should equal to B",a,b);
    }

    public static void testPara(int[] arr) {
        if (arr.length < 3) {
            System.out.println("The length shoud be larger than 3");
        } else {
            arr[2] = 32;
        }
    }

    ;

    public static void mSort(int[] arr, int left, int right) {
        int center = 0;
        if (right > left) {
            center = (left + right) / 2;
            mSort(arr, left, center);
            mSort(arr, center + 1, right);
            merge(arr, left, center + 1, right);

        }


    }


    public static void merge(int[] arr, int left, int povit, int right) {
        int[] tmp = new int[right - left + 1];
        int l = left, r = povit, pos = 0;
        while (l < povit && r <= right) {
            if (arr[l] < arr[r]) {
                tmp[pos] = arr[l];
                l++;
            } else {
                tmp[pos] = arr[r];
                r++;
            }
            pos++;
        }
        while (r <= right) {
            tmp[pos] = arr[r++];
            pos++;
        }
        while (l < povit) {
            tmp[pos] = arr[l++];
            pos++;
        }
        for (int i = 0; i < tmp.length; i++) {
            arr[left + i] = tmp[i];
        }
        tmp = null;

    }
}
