package algorithm;

/**
 * Created by songheng on 3/21/16.
 */
public class MergekSortedLists_23_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if ( lists == null || lists.length == 0){
            return null;
        } else  if (lists.length == 1){
            return lists[0];
        }
        else {
            ListNode head = null;
            for(int i = 0 ; i < lists.length ; i++){
                head = merge2Lists(head,lists[i]);
            }
            return head;
        }

    }
    public ListNode merge2Lists(ListNode list1 , ListNode list2){

        if(list1 == null && list2 == null){
            return null;
        } else  if ( list1 == null){
            return list2;
        } else if( list2 == null){
            return list1;
        }
        else{
            ListNode head = null;
            ListNode tail = null;
            while(list1 != null && list2 != null){
                if ( list1.val <= list2.val){
                    if(head == null ){
                        head = list1;
                        tail=head;
                    }
                    else {
                        tail.next = list1;
                        tail = tail.next;

                    }
                    list1 = list1.next;
                }else{
                    if(head == null ){
                        head = list2;
                        tail=head;
                    }
                    else {
                        tail.next = list2;
                        tail = tail.next;

                    }
                    list2 = list2.next;
                }
            }
            while(list1 != null ){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            }
            while (list2 != null){
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }


            return head;
        }

    }
}
