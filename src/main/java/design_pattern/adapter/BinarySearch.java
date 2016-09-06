package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            }
            if (midVal > key) {
                high = mid - 1;
            }
            if (midVal == key) return mid;
        }
        return -1;
    }
}
