package datastructure;

/**
 * Created by shu on 2016/9/29.
 */
public class SegementTree {
    static int MAX = 500000;
    Segment[] segments;
    int nNode;
    int lastNode;

    public SegementTree() {
        segments = new Segment[MAX];
        for (int i = 0; i < MAX; i++) {
            segments[i] = new Segment();
        }
    }

    public void build(int l, int r, int root) {
        nNode++;
        if (root > lastNode) lastNode = root;
        segments[root].left = l;
        segments[root].right = r;
        if (l == r) return;
        int mid = (l + r) >> 1;
        build(l, mid, root << 1);
        build(mid, r, (root << 1) + 1);

    }

    public int getNumber() {
        return nNode;
    }

    public int getLastNode() {
        return lastNode;
    }

    class Segment {
        int left;
        int right;
    }

}
