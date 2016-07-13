package datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AStarAlgorithm {

    private final static int ROLD = 0; //通路
    private final static int SELF = 1; //自己
    private final static int STONE = 2; //障碍物
    private final static int DEST = 3; //目标
    static int start_row = 0;
    static int start_column = 0;
    static int dest_row = 0;
    static int dest_column = 0;
    //包含通路的地图测试实例
    private static int[][] graph = {
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 2, 0, 0},
            {1, 2, 0, 0, 0, 0, 0, 2, 0, 3},
            {0, 2, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2, 0, 0}
    };
    //不包含通路的地图测试实例
    private static int[][] graph2 = {
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 2, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 2, 0, 2},
            {1, 2, 0, 0, 0, 0, 0, 2, 2, 2},
            {0, 2, 0, 0, 0, 0, 0, 2, 0, 3},
            {0, 0, 0, 0, 0, 0, 0, 2, 0, 0}
    };
    private static S[][] enableFlag; //用来模拟"开放列表"，"关闭列表"的标记数组
    private static int PRICE_HW = 10; //水平、垂直移动1单位代价
    private static int PRICE_X = 14; //斜着移动1.44的代价

    public static void main(String[] args) {

        AStarAlgorithm aStarAlgorithm = new AStarAlgorithm();

        //测试有解地图
        System.out.println("---测试有解实例---");
        Node[][] nodes = new Node[graph.length][graph[0].length];
        enableFlag = new S[graph.length][graph[0].length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                nodes[i][j] = new Node(i, j, graph[i][j]);
                enableFlag[i][j] = S.INIT; //将状态置为初始状态
            }
        }
        aStarAlgorithm.search(nodes);


        //测试无解地图
        Node[][] nodes2 = new Node[graph.length][graph[0].length];
        System.out.println("\n---测试无解实例---");
        enableFlag = new S[graph2.length][graph2[0].length];
        for (int i = 0; i < graph2.length; i++) {
            for (int j = 0; j < graph2[0].length; j++) {
                nodes2[i][j] = new Node(i, j, graph2[i][j]);
                enableFlag[i][j] = S.INIT; //将状态置为初始状态
            }
        }
        aStarAlgorithm.search(nodes2);
    }

    public void search(Node[][] graph) {


        //打印地图数据
        System.out.println("地图:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j].type + " ");
            }
            System.out.println();
        }

        //检索地图得到起始点和目标点坐标
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j].type == SELF) {
                    start_row = i;
                    start_column = j;
                } else if (graph[i][j].type == DEST) {
                    dest_row = i;
                    dest_column = j;
                }
            }
        }

        //---使用java自带的优先队列---
        Comparator<Node> comparator = new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {
                if ((o1.getCost()) > (o2.getCost())) {
                    return 1;
                } else if ((o1.getCost()) == (o2.getCost())) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        PriorityQueue<Node> queue = new PriorityQueue<>(12, comparator);

        //将起点放置到开放列表中
        queue.add(new Node(start_row, start_column, 1));
        enableFlag[start_row][start_column] = S.OEPN; //将起点打上开放标记

        //搜索不到通路(开放列表为空)，或者搜索到了通路(终点位于开放列表中)
        while (!queue.isEmpty() &&
                enableFlag[dest_row][dest_column] != S.OEPN) {
            Node currNode = queue.poll();
            enableFlag[currNode.row][currNode.column] = S.CLOSE; //放到关闭列表
            for (int i = currNode.row - 1; i < currNode.row + 2; i++) {
                for (int j = currNode.column - 1; j < currNode.column + 2; j++) {

                    if (i >= 0 && i < graph.length && j >= 0 && j < graph[i].length //边界过滤
                            && graph[i][j].type != STONE //不是障碍物
                            && enableFlag[i][j] != S.CLOSE /*不在关闭列表中*/) {

                        if (i != currNode.row && j != currNode.column) { //斜着移动
                            if (graph[i][j].getCost() > currNode.getCost() + PRICE_X) {
                                graph[i][j].setG(currNode.getG() + PRICE_X);
                            }
                        } else { //水平、垂直移动
                            if (graph[i][j].getCost() > currNode.getCost() + PRICE_HW) {
                                graph[i][j].setG(currNode.getG() + PRICE_HW);
                            }
                        }
                        if (enableFlag[i][j] == S.INIT) {
                            queue.add(graph[i][j]);
                            enableFlag[i][j] = S.OEPN;
                        }
                    }
                }
            }
            System.out.print(currNode.row + "," + currNode.column + "=>");
        }
        if (queue.isEmpty()) {
            System.out.println("\n---未搜索到从起点到终点的有效通路!");
        } else {
            System.out.print(dest_row + "," + dest_column);
            System.out.println("\n---搜索到从起点到终点的有效通路!");
        }
    }


    private enum S { //对应三个状态:初始状态中，开放列表中，关闭列表中
        INIT, OEPN, CLOSE
    }

    /**
     * 节点类
     *
     * @author wly
     */
    static class Node {
        Node parentNode; //持有父节点的引用
        int g; //搜索当前节点已发生的开销

        int row, column; //坐标

        int type; //当前节点的类型(障碍物、道路等)

        public Node(int row, int column, int type) {
            super();
            this.row = row;
            this.column = column;
            this.type = type;
        }

        public int getG() {
            return g;
        }

        public void setG(int g) {
            this.g = g;
        }

        public int getCost() {
            return getHValue() + g;
        }

        /**
         * 估算函数
         *
         * @return
         */
        private int getHValue() {
            return (Math.abs(row - dest_row) + Math.abs(column - dest_column)) * PRICE_HW;
        }
    }
}