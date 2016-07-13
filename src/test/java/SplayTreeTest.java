import datastructure.SplayTree;

/**
 * Created by shu on 6/18/2016.
 */
public class SplayTreeTest {
    private static final int arr[] = {10, 50, 40, 30, 20, 60};

    public static void main(String[] args) {
        int i, ilen;
        SplayTree<Integer> tree = new SplayTree<Integer>();

        System.out.print("== �������: ");
        ilen = arr.length;
        for (i = 0; i < ilen; i++) {
            System.out.print(arr[i] + " ");
            tree.insert(arr[i]);
        }

        System.out.print("\n== ǰ�����: ");
        tree.preOrder();

        System.out.print("\n== �������: ");
        tree.inOrder();

        System.out.print("\n== �������: ");
        tree.postOrder();
        System.out.println();

        System.out.println("== ��Сֵ: " + tree.minimum());
        System.out.println("== ���ֵ: " + tree.maximum());
        System.out.println("== ������ϸ��Ϣ: ");
        tree.print();

        i = 30;
        System.out.printf("\n== ��ת�ڵ�(%d)Ϊ���ڵ�\n", i);
        tree.splay(i);
        System.out.printf("== ������ϸ��Ϣ: \n");
        tree.print();

        // ���ٶ�����
        tree.clear();
    }
}
