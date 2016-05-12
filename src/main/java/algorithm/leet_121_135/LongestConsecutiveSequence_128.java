package algorithm.leet_121_135;

import java.util.*;

/**
 * Created by songheng on 5/12/16.
 */
public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        List<Node> nodeList = new ArrayList<>();
        Map<Integer, List<Node>> map = new HashMap<>();
        for (int num : nums) {
            Node node = new Node(num);
            if (!map.containsKey(num)) {
                nodeList.add(node);

            } else {
                List<Node> nodes = map.get(num);
                for (Node nd : nodes) {
                    if (nd.val > num) {
                        node.right = nd;
                        nd.left = node;
                    } else {
                        nd.right = node;
                        node.left = nd;
                    }

                }

            }

            if (!map.containsKey(num + 1)) {
                map.put(num + 1, new ArrayList<>());
            }
            if (!map.containsKey(num - 1)) {
                map.put(num - 1, new ArrayList<>());
            }
            map.get(num + 1).add(node);
            map.get(num - 1).add(node);
        }
        Set<Integer> set = new HashSet<>();
        for (Node node : nodeList) {
            if (!set.contains(node.val)) {
                res = Math.max(res, node.count(set));
            }
        }
        return res;
    }

    public int longestConsecutive2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int down = nums[i] - 1;
            while (set.contains(down)) {
                set.remove(down);
                down--;
            }

            int up = nums[i] + 1;
            while (set.contains(up)) {
                set.remove(up);
                up++;
            }

            longest = Math.max(longest, up - down - 1);
        }

        return longest;
    }

    class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }

        int count(Set<Integer> set) {
            int cnt = 0;
            Node node = this.right;
            while (node != null) {
                cnt++;
                set.add(node.val);
                node = node.right;
            }
            node = this.left;
            while (node != null) {
                cnt++;
                set.add(node.val);
                node = node.left;
            }
            return cnt + 1
                    ;
        }
    }
}
