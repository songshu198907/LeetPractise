package design_pattern.Iterator;

/**
 * Created by shu on 6/21/2016.
 */
public interface Iterator {
    Object previous();

    Object next();

    boolean hasNext();

    Object first();
}
