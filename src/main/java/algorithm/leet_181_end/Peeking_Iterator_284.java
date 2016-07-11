package algorithm.leet_181_end;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songheng on 7/11/16.
 */
public class Peeking_Iterator_284 {
    class PeekingIterator implements Iterator<Integer> {
        private Queue<Integer> queue;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            queue = new LinkedList();
            while (iterator.hasNext())
                queue.offer(iterator.next());

        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return queue.peek();


        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            return queue.poll();
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();

        }
    }
}
