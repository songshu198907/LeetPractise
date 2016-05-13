package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by songheng on 5/13/16.
 */
public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    public static UndirectedGraphNode build(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        UndirectedGraphNode root = null;
        String[] nodes = str.split("#");
        for (String node : nodes) {
            String[] ele = node.split(",");
            int lable = Integer.parseInt(ele[0]);
            UndirectedGraphNode tmp;
            if (map.containsKey(lable)) {
                tmp = map.get(lable);

            } else {
                tmp = new UndirectedGraphNode(lable);
                if (root == null) {
                    root = tmp;
                }
                map.put(lable, tmp);


            }
            if (ele.length > 1) {
                if (tmp.neighbors == null)
                    tmp.neighbors = new ArrayList<>();
                for (int i = 1; i < ele.length; i++) {
                    int nLabel = Integer.parseInt(ele[i]);
                    UndirectedGraphNode nei;
                    if (map.containsKey(nLabel)) {
                        nei = map.get(nLabel);
                    } else {
                        nei = new UndirectedGraphNode(nLabel);
                    }
                    tmp.neighbors.add(nei);
                    map.put(Integer.parseInt(ele[i]), nei);
                }
            }
        }
        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UndirectedGraphNode that = (UndirectedGraphNode) o;

        if (label != that.label) return false;
        List<Integer> thislabels = new ArrayList<>();
        List<Integer> thatlabels = new ArrayList<>();
        neighbors.forEach(neighbor -> thislabels.add(neighbor.label));
        that.neighbors.forEach(neighbor -> thatlabels.add(neighbor.label));
        if (!thislabels.equals(thatlabels)) return false;
        while (neighbors.indexOf(this) > -1) {
            neighbors.remove(this);
        }
        while (that.neighbors.indexOf(that) > -1) {
            that.neighbors.remove(that);
        }
        return neighbors != null ? neighbors.equals(that.neighbors) : that.neighbors == null;

    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + (neighbors != null ? neighbors.hashCode() : 0);
        return result;
    }
}