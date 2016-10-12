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

    private BinaryNode<T> findMin(BinaryNode<T> node) {
        BinaryNode min = node;
        while (min.left != null) {
            min = min.left;
        }
        return min;
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
