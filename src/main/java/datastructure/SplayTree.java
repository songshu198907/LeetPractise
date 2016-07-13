package datastructure;

/**
 * Created by shu on 6/18/2016.
 */
public class SplayTree<T extends Comparable<T>> {
    private Node<T> root;

    public SplayTree() {
        root = null;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.print(tree.key + " ");
            inOrder(tree.right);

        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    private Node<T> search(Node<T> tree, T key) {
        if (tree != null) {
            Node<T> cur = tree;
            while (cur != null) {
                int cmp = key.compareTo(tree.key);
                if (cmp == 0) return tree;
                if (cmp > 0) tree = tree.right;
                else tree = tree.left;
            }
        }
        return null;
    }

    public Node<T> search(T key) {
        return search(root, key);
    }

    private Node<T> minimum(Node<T> tree) {
        if (tree == null) return null;
        Node<T> cur = tree;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public T minimum() {
        Node<T> p = minimum(root);
        if (p != null) {
            return p.key;
        }
        return null;
    }

    private Node<T> maximum(Node<T> tree) {
        if (tree == null) return null;
        Node<T> cur = tree;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur;
    }

    public T maximum() {
        Node<T> node = maximum(root);
        if (node != null)
            return node.key;
        return null;
    }

    private Node splay(Node<T> tree, T key) {
        if (tree == null)
            return tree;
        Node<T> n = new Node<>();
        Node<T> l = n;
        Node<T> r = n;
        Node<T> c;
        while (true) {
            int cmp = key.compareTo(tree.key);
            if (cmp < 0) {
                if (tree.left == null) {
                    break;
                }
                if (key.compareTo((T) tree.left.key) < 0) {
                    tree = rotateWithLeftNode(tree);
                }
                if (tree.left == null) break;
                r.left = tree;
                r = tree;
                tree = tree.left;
            } else if (cmp > 0) {
                if (tree.right == null) break;
                if (key.compareTo((T) tree.right.key) > 0) {
                    tree = rotateWithRightNode(tree);
                }
                if (tree.right == null) break;
                l.right = tree;
                l = tree;
                tree = tree.right;
            } else break;
        }
        l.right = tree.left;
        r.left = tree.right;
        tree.left = n.right;
        tree.right = n.left;
        return tree;

    }

    public void splay(T key) {
        root = splay(root, key);
    }

    public void insert(T key) {
        Node<T> node = new Node<>(key);
        if (node == null) return;
        root = insert(root, node);
        root = splay(root, key);
    }

    private Node<T> insert(Node<T> tree, Node<T> node) {
        int cmp;
        Node<T> tmp = tree;
        if (tree == null) {
            tree = node;
        } else {
            while (tmp != null) {
                cmp = node.key.compareTo(tmp.key);
                if (cmp == 0) {
                    break;
                } else if (cmp < 0) {
                    if (tmp.left == null) {
                        tmp.left = node;
                    } else tmp = tmp.left;
                } else {
                    if (tmp.right == null)
                        tmp.right = node;
                    else tmp = tmp.right;
                }
            }
        }
        return tree;
    }

    private Node<T> rotateWithLeftNode(Node<T> node) {
        Node<T> x = node.left;
        node.left = x.right;
        x.right = node;
        return x;
    }

    private Node<T> rotateWithRightNode(Node<T> node) {
        Node<T> x = node.right;
        node.right = x.left;
        x.left = node;
        return x;
    }

    public void remove(T key) {
        root = remove(root, key);
    }

    private Node<T> remove(Node<T> tree, T key) {
        Node<T> x;
        if (tree == null) return null;
        if (search(tree, key) == null) return tree;
        tree = splay(tree, key);
        if (tree.left != null) {
            x = splay(tree.left, key);
            x.right = tree.right;
        } else x = tree.right;
        tree = null;
        return x;

    }

    private void destory(Node<T> tree) {
        if (tree == null) return;
        if (tree.left != null) destory(tree.left);
        if (tree.right != null) destory(tree.right);
        tree = null;
    }

    public void clear() {
        destory(root);
        root = null;
    }

    private void print(Node<T> tree, T key, int direction) {

        if (tree != null) {

            if (direction == 0)    // tree是根节点
                System.out.printf("%2d is root\n", tree.key);
            else                // tree是分支节点
                System.out.printf("%2d is %2d's %6s child\n", tree.key, key, direction == 1 ? "right" : "left");

            print(tree.left, tree.key, -1);
            print(tree.right, tree.key, 1);
        }
    }

    public void print() {
        if (root != null)
            print(root, root.key, 0);
    }


    private class Node<T extends Comparable<T>> {
        T key;
        Node left;
        Node right;

        public Node(T key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        public Node(T key) {
            this(key, null, null);
        }

        public Node() {
            this.left = null;
            this.right = null;
        }
    }
}
