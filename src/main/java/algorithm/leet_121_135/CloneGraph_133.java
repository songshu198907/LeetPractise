package algorithm.leet_121_135;

import algorithm.UndirectedGraphNode;

import java.util.*;

/**
 * Created by songheng on 5/13/16.
 */
public class CloneGraph_133 {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        UndirectedGraphNode nNode = new UndirectedGraphNode(node.label);
        nNode.neighbors = new ArrayList<>();
        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (neighbor.label != node.label) {
                nNode.neighbors.add(cloneGraph(neighbor));
            } else
                nNode.neighbors.add(nNode);
        }
        return nNode;
    }

    public UndirectedGraphNode cloneGraph2(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        UndirectedGraphNode root = null;
        queue.offer(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode nd = queue.poll();
            UndirectedGraphNode cloned;
            if (map.containsKey(nd.label))
                cloned = map.get(nd.label);
            else {
                cloned = new UndirectedGraphNode(nd.label);
                map.put(nd.label, cloned);
            }
            if (root == null) {
                root = cloned;
            }
            for (UndirectedGraphNode neighbor : nd.neighbors) {
                UndirectedGraphNode nei;
                if (map.containsKey(neighbor.label)) {
                    nei = map.get(neighbor.label);
                } else {
                    nei = new UndirectedGraphNode(neighbor.label);
                    queue.offer(neighbor);
                    map.put(nei.label, nei);
                }
                cloned.neighbors.add(nei);

            }

        }
        return root;
    }

}
