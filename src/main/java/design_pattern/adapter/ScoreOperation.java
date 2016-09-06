package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public interface ScoreOperation {
    int[] sort(int[] arr);

    int search(int arr[], int key);
}
