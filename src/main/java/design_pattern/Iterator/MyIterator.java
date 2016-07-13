package design_pattern.Iterator;

/**
 * Created by shu on 6/21/2016.
 */
public class MyIterator implements Iterator {
    private int pos = -1;
    private Collection collection;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos < 0) return null;
        else return collection.get(--pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            return collection.get(++pos);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return pos < collection.size() - 1;
    }

    @Override
    public Object first() {
        return collection.size() == 0 ? null : collection.get(0);
    }
}
