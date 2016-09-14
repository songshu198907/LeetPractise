package design_pattern.iterator;

import java.util.List;

/**
 * Created by songheng on 9/14/16.
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List Objects) {
        super(Objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
