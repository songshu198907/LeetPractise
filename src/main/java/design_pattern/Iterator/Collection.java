package design_pattern.Iterator;


/**
 * Created by shu on 6/21/2016.
 */
public interface Collection {
    Iterator iterator();

    Object get(int i);

    int size();
}

