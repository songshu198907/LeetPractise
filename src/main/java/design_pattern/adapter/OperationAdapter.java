package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class OperationAdapter implements ScoreOperation {

    private BinarySearch search;
    private QuickSort sort;

    public OperationAdapter() {
        search = new BinarySearch();
        sort = new QuickSort();
    }

    @Override
    public int[] sort(int[] arr) {
        return sort.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int key) {
        return search.binarySearch(arr, key);
    }
}
