package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shu on 7/15/2016.
 */
public class Number_of_Islands_II_305 {
    private int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        UnionFind2D union = new UnionFind2D(m, n);
        List<Integer> ans = new ArrayList<>();
        for (int[] pos : positions) {
            int x = pos[0];
            int y = pos[1];
            int p = union.add(x, y);
            for (int[] d : dir) {
                int q = union.getId(x + d[0], y + d[1]);
                if (q > 0 && !union.find(p, q)) {
                    union.unite(p, q);
                }
            }
            ans.add(union.size());
        }
        return ans;
    }
}

class UnionFind2D {
    private int[] id;
    private int[] sz;
    private int m, n, count;

    public UnionFind2D(int m, int n) {
        this.count = 0;
        this.n = n;
        this.m = m;
        this.id = new int[m * n + 1];
        this.sz = new int[m * n + 1];
    }

    public int index(int x, int y) {
        return x * n + y + 1;
    }

    public int size() {
        return count;
    }

    public int getId(int x, int y) {
        int i = index(x, y);
        if (0 <= x && x < m && 0 <= y && y < n)
            return id[i];
        return 0;
    }

    public int add(int x, int y) {
        int i = index(x, y);
        id[i] = i;
        sz[i] = 1;
        ++count;
        return i;
    }

    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public void unite(int p, int q) {
        int i = root(p), j = root(q);
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        --count;
    }

    private int root(int i) {
        for (; i != id[i]; i = id[i]) {
            id[i] = id[id[i]];
        }
        return i;
    }
}
