package algorithm;

/**
 * Created by songheng on 10/12/16.
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private BinaryNode<T> rootTree;

    public BinarySearchTree() {
        rootTree = null;
    }

    public void clear() {
        rootTree = null;
    }

    public boolean isEmpty() {
        return rootTree == null;
    }

    public boolean contains(T data) {
        return contains(data, rootTree);
    }

    private boolean contains(T t, BinaryNode<T> node) {
        if (node == null) return false;
        int comp = t.compareTo(node.data);
        if (comp > 0) return contains(t, node.right);
        if (comp < 0) return contains(t, node.left);
        return true;
    }

    public T findMin() {
        if (isEmpty()) return null;
        return findMin(rootTree).data;
    }

    public T findMax() {
        if (isEmpty()) return null;
        return findMax(rootTree).data;

    }

    public BinaryNode<T> findMax(BinaryNode<T> node) {
        BinaryNode<T> tmp = node;
        while (tmp.right != null)
            tmp = tmp.right;
        return tmp;
    }

    public void insert(T t) {
        rootTree = insert(t, rootTree);
    }

    public BinaryNode<T> insert(T t, BinaryNode<T> node) {
        if (node == null) return new BinaryNode<T>(t, null, null);
        int comp = t.compareTo(node.data);
        if (comp > 0) node = insert(t, node.right);
        else if (comp < 0) node = insert(t, node.left);
        return node;
    }

    public BinaryNode<T> findMin(BinaryNode<T> node) {
        BinaryNode min = node;
        while (min.left != null) {
            min = min.left;
        }
        return min;
    }

    public T remove(T t) {
        return remove(t, rootTree) == null ? null : remove(t, rootTree).data;
    }

    private BinaryNode<T> remove(T t, BinaryNode<T> node) {
        if (node == null) return node;
        int comp = t.compareTo(node.data);
        if (comp > 0) node.right = remove(t, node.right);
        else if (comp < 0) node.left = remove(t, node.left);
        else if (node.left != null && node.right != null) {
            node.data = findMax(node.right).data;
            node.right = remove(node.data, node.right);
        } else {
            node = (node.left != null) ? node.left : node.right;
        }
        return node;
    }
    static class BinaryNode<T> {
        T data;
        BinaryNode<T> left;
        BinaryNode<T> right;

        public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public BinaryNode() {
            data = null;
            this.left = null;
            this.right = null;
        }

    }
}
