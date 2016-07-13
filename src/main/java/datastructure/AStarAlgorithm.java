package datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AStarAlgorithm {

    private final static int ROLD = 0; //ͨ·
    private final static int SELF = 1; //�Լ�
    private final static int STONE = 2; //�ϰ���
    private final static int DEST = 3; //Ŀ��
    static int start_row = 0;
    static int start_column = 0;
    static int dest_row = 0;
    static int dest_column = 0;
    //����ͨ·�ĵ�ͼ����ʵ��
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
    //������ͨ·�ĵ�ͼ����ʵ��
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
    private static S[][] enableFlag; //����ģ��"�����б�"��"�ر��б�"�ı������
    private static int PRICE_HW = 10; //ˮƽ����ֱ�ƶ�1��λ����
    private static int PRICE_X = 14; //б���ƶ�1.44�Ĵ���

    public static void main(String[] args) {

        AStarAlgorithm aStarAlgorithm = new AStarAlgorithm();

        //�����н��ͼ
        System.out.println("---�����н�ʵ��---");
        Node[][] nodes = new Node[graph.length][graph[0].length];
        enableFlag = new S[graph.length][graph[0].length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                nodes[i][j] = new Node(i, j, graph[i][j]);
                enableFlag[i][j] = S.INIT; //��״̬��Ϊ��ʼ״̬
            }
        }
        aStarAlgorithm.search(nodes);


        //�����޽��ͼ
        Node[][] nodes2 = new Node[graph.length][graph[0].length];
        System.out.println("\n---�����޽�ʵ��---");
        enableFlag = new S[graph2.length][graph2[0].length];
        for (int i = 0; i < graph2.length; i++) {
            for (int j = 0; j < graph2[0].length; j++) {
                nodes2[i][j] = new Node(i, j, graph2[i][j]);
                enableFlag[i][j] = S.INIT; //��״̬��Ϊ��ʼ״̬
            }
        }
        aStarAlgorithm.search(nodes2);
    }

    public void search(Node[][] graph) {


        //��ӡ��ͼ����
        System.out.println("��ͼ:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j].type + " ");
            }
            System.out.println();
        }

        //������ͼ�õ���ʼ���Ŀ�������
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

        //---ʹ��java�Դ������ȶ���---
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

        //�������õ������б���
        queue.add(new Node(start_row, start_column, 1));
        enableFlag[start_row][start_column] = S.OEPN; //�������Ͽ��ű��

        //��������ͨ·(�����б�Ϊ��)��������������ͨ·(�յ�λ�ڿ����б���)
        while (!queue.isEmpty() &&
                enableFlag[dest_row][dest_column] != S.OEPN) {
            Node currNode = queue.poll();
            enableFlag[currNode.row][currNode.column] = S.CLOSE; //�ŵ��ر��б�
            for (int i = currNode.row - 1; i < currNode.row + 2; i++) {
                for (int j = currNode.column - 1; j < currNode.column + 2; j++) {

                    if (i >= 0 && i < graph.length && j >= 0 && j < graph[i].length //�߽����
                            && graph[i][j].type != STONE //�����ϰ���
                            && enableFlag[i][j] != S.CLOSE /*���ڹر��б���*/) {

                        if (i != currNode.row && j != currNode.column) { //б���ƶ�
                            if (graph[i][j].getCost() > currNode.getCost() + PRICE_X) {
                                graph[i][j].setG(currNode.getG() + PRICE_X);
                            }
                        } else { //ˮƽ����ֱ�ƶ�
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
            System.out.println("\n---δ����������㵽�յ����Чͨ·!");
        } else {
            System.out.print(dest_row + "," + dest_column);
            System.out.println("\n---����������㵽�յ����Чͨ·!");
        }
    }


    private enum S { //��Ӧ����״̬:��ʼ״̬�У������б��У��ر��б���
        INIT, OEPN, CLOSE
    }

    /**
     * �ڵ���
     *
     * @author wly
     */
    static class Node {
        Node parentNode; //���и��ڵ������
        int g; //������ǰ�ڵ��ѷ����Ŀ���

        int row, column; //����

        int type; //��ǰ�ڵ������(�ϰ����·��)

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
         * ���㺯��
         *
         * @return
         */
        private int getHValue() {
            return (Math.abs(row - dest_row) + Math.abs(column - dest_column)) * PRICE_HW;
        }
    }
}