/**
 * Created by liyuanhua on 18/3/14.
 */
public class CombineSortedList {

    public ListNode Merge(ListNode list1,ListNode list2) {

        ListNode head = null;

        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;


        if(list1.val <= list2.val){
            head = list1;
            head.next = Merge(list1.next, list2);
        }
        else {
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        return head;
    }

}
