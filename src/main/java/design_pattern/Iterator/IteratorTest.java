package design_pattern.Iterator;

/**
 * Created by shu on 6/21/2016.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = new MyIterator(collection);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
