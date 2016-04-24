package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    public  void print(){
        ListNode node = this;
        StringBuilder sb = new StringBuilder( "[");
        while (node != null ){
            sb.
                    append(node.val).
                    append(",");
            node = node.next;
        }
        String output = sb.toString();
        output = output.substring(0,output.lastIndexOf(","));
        System.out.println(output+"]");

    }
}
