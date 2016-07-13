package datastructure;

/**
 * Created by shu on 6/18/2016.
 */
public class AVLTree<T extends Comparable<T>> {
    private Node<T> root;

    public AVLTree() {
        root = null;
    }

    private int height(Node<T> node) {
        if (node != null) return node.height;
        return 0;
    }

    public int height() {
        return height(root);
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    private Node<T> lLRotate(Node<T> node) {
        Node<T> left = node.left;
        node.left = left.right;
        left.right = node;
        node.height = max(height(node.left), height(node.right)) + 1;
        left.height = max(node.height, height(left.left)) + 1;
        return left;
    }

    private Node<T> rRRotate(Node<T> node) {
        Node<T> right = node.right;
        node.right = right.left;
        right.left = node;
        node.height = max(height(node.left), height(node.right)) + 1;
        right.height = max(height(node), height(right.right)) + 1;
        return right;
    }

    private Node<T> lRRotate(Node<T> node) {
        node.left = rRRotate(node.left);
        return lLRotate(node);
    }

    private Node<T> rLRotate(Node<T> node) {
        node.right = lLRotate(node.right);
        return rRRotate(node);
    }

    private void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }

    }

    public void inOrder() {
        inOrder(root);
    }

    private void postOrder(Node<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    private void destroy(Node<T> node) {
        if (node == null) return;
        if (node.left != null) destroy(node.left);
        if (node.right != null) destroy(node.right);
        node = null;
    }

    public void clear() {
        destroy(root);

    }

    public void postOrder() {
        postOrder(root);
    }

    public Node<T> search(T key) {
        return search(root, key);
    }


    private Node<T> insert(Node<T> tree, T key) {
        if (tree == null) {
            tree = new Node(key, null, null);
            if (tree == null) {
                System.err.println("ERROR: create avltree node failed!");
                return null;
            }
        } else {
            int cmp = key.compareTo(tree.key);
            if (cmp < 0) {
                tree.left = insert(tree.left, key);
                if (height(tree.left) - height(tree.right) >= 2) {
                    if (key.compareTo((T) tree.left.key) < 0) {
                        tree = lLRotate(tree);
                    } else {
                        tree = lRRotate(tree);
                    }
                }
            } else if (cmp > 0) {
                tree.right = insert(tree.right, key);
                if (height(tree.right) - height(tree.left) >= 2) {
                    if (key.compareTo((T) tree.right.key) > 0)
                        tree = rRRotate(tree);
                    else tree = rLRotate(tree);
                }
            } else {
                System.err.println("Insert same value more than once is not allowed!");
            }
        }
        tree.height = max(height(tree.left), height(tree.right)) + 1;
        return tree;
    }

    public void insert(T key) {
        root = insert(root, key);
    }

    private Node<T> remove(Node<T> tree, Node<T> z) {
        if (tree == null || z == null)
            return null;
        T key = z.key;
        int cmp = key.compareTo(tree.key);
        if (cmp < 0) {
            tree.left = remove(tree.left, z);
            if (height(tree.right) - height(tree.left) == 2) {
                Node<T> r = tree.right;
                if (height(r.left) > height(r.right))
                    tree = rLRotate(tree);
                else tree = rRRotate(tree);
            }
        } else if (cmp > 0) {
            tree.right = remove(tree.right, z);
            if (height(tree.left) - height(tree.right) == 2) {
                Node<T> l = tree.left;
                if (height(l.right) > height(l.left)) {
                    tree = lRRotate(tree);
                } else tree = lLRotate(tree);
            }
        } else {
            if (tree.left != null && tree.right != null) {
                if (height(tree.left) > height(tree.right)) {
                    Node<T> max = maximum(tree.left);
                    tree.key = max.key;
                    tree.left = remove(tree.left, max);
                } else {
                    Node<T> min = minimum(tree.right);
                    tree.key = min.key;
                    tree.right = remove(tree.right, min);
                }
            } else {
                Node<T> tmp = tree;
                tree = (tree.left == null) ? tree.right : tree.left;
                tmp = null;
            }

        }
        return tree;
    }

    public void remove(T key) {
        Node<T> z;
        if ((z = search(root, key)) != null) {
            remove(root, z);
        }
    }

    private Node<T> search(Node<T> tree, T key) {
        if (tree != null) {
            Node<T> tmp = tree;
            while (tmp != null) {
                int cmp = key.compareTo(tmp.key);
                if (cmp == 0) return tmp;
                if (cmp < 0) tmp = tmp.left;
                else tmp = tmp.right;
            }
        }
        return null;
    }


    private Node<T> maximum(Node node) {
        if (node == null) return null;
        while (node.right != null)
            node = node.right;
        return node;
    }

    private Node<T> minimum(Node node) {
        if (node == null) return null;
        while (node.left != null)
            node = node.left;
        return node;
    }

    private void print(Node<T> tree, T key, int direction) {
        if (tree != null) {
            if (direction == 0)    // tree是根节点
                System.out.printf("%2d is root\n", tree.key, key);
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

    public T minimum() {
        Node<T> p = minimum(root);
        if (p != null) {
            return p.key;
        }
        return null;
    }

    public T maximum() {
        Node<T> p = maximum(root);
        if (p != null) {
            return p.key;
        }
        return null;
    }

    private class Node<T extends Comparable<T>> {
        T key;
        Node left;
        Node right;
        int height;

        public Node(T key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.height = 0;
        }
    }

}
