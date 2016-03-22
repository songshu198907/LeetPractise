package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class SwapNodesinPairs_24 {
    public ListNode swapPairs(ListNode head) {
       if (head == null || head.next ==null){
           return head;
       } else {
           ListNode first, second;
           boolean flag = true;
           first = head;
           ListNode previous = null;
           while ( first != null && first.next != null){
               second = first.next;
               first.next = second.next;
               second.next = first;
               if(flag){
                   head = second;
                   flag = false;
                   previous = first;
               }
               else {
                   previous.next = second;
                   previous = first;

               }
               first = first.next;
           }
           return head;
       }

    }
    public  ListNode buildList(int[] a ){
        ListNode head = new ListNode(a[0]);
        ListNode tail = head;
        for(int i = 1; i < a.length ; i++){
            ListNode node = new ListNode(a[i]);
            tail.next = node;
            tail = tail.next;
        }
        return head;
    }
}
