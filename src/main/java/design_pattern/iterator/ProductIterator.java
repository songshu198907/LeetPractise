package design_pattern.iterator;

import java.util.List;

/**
 * Created by songheng on 9/14/16.
 */
public class ProductIterator implements AbstractIterator {
    private ProductList productList;
    private List products;
    private int cur1;
    private int cur2;

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjects();
        cur1 = 0;
        cur2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cur1 < products.size()) {
            cur1++;
        }

    }

    @Override
    public void previous() {
        if (cur2 >= 0)
            cur2--;

    }

    @Override
    public boolean isLast() {
        return cur1 == products.size();
    }

    @Override
    public boolean isFirst() {
        return cur2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cur1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cur2);
    }
}
