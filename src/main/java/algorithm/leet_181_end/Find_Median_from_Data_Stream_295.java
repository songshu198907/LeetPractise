package algorithm.leet_181_end;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by shu on 7/12/2016.
 */
public class Find_Median_from_Data_Stream_295 {
    class MedianFinder {
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Adds a number into the data structure.
        public void addNum(int num) {
            maxheap.offer(num);
            minheap.offer(maxheap.poll());
            if (maxheap.size() < minheap.size()) {
                maxheap.offer(minheap.poll());
            }
        }

        // Returns the median of current data stream
        public double findMedian() {
            return maxheap.size() == minheap.size() ? (double) (maxheap.peek() + minheap.peek()) / 2.0 : maxheap.peek();
        }

    }

}
