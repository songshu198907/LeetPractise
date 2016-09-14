package design_pattern.iterator;

/**
 * Created by songheng on 9/14/16.
 */
public interface AbstractIterator {
    void next();

    void previous();

    boolean isLast();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();
}
