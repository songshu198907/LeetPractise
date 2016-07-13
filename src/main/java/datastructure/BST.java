package datastructure;

/**
 * Created by shu on 6/18/2016.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;

    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = x.key.compareTo(key);
            if (cmp == 0) return x.val;
            else if (cmp > 0) x = x.left;
            else x = x.right;
        }
        return null;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = x.left.color;
        x.left.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = x.right.color;
        x.right.color = RED;
        return x;
    }

    private Node colorFlip(Node h) {
        h.color = !h.color;
        h.right.color = !h.right.color;
        h.left.color = !h.left.color;
        return h;
    }

    private Node insert(Node h, Key key, Value val) {
        if (h == null) {
            return new Node(key, val, RED);
        }
        int cmp = h.key.compareTo(key);
        if (cmp == 0) h.val = val;
        else if (cmp > 0) h.right = insert(h.right, key, val);
        else if (cmp < 0) h.left = insert(h.left, key, val);

        if (h.right.color) {
            h = rotateLeft(h);
        }
        if (h.left.color && h.left.left.color) {
            h = rotateRight(h);
        }
        if (h.right.color && h.left.color) {
            h = colorFlip(h);
        }
        return h;

    }

    private Node moveRedRight(Node h) {
        colorFlip(h);
        if (h.left.left.color) {
            h = rotateRight(h);
            colorFlip(h);
        }
        return h;
    }

    private class Node {
        Key key;
        Value val;
        Node left, right;
        boolean color;

        Node(Key key, Value val, boolean color) {
            this.key = key;
            this.val = val;
            this.color = color;
        }
    }

}
