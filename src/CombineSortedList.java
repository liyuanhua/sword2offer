/**
 * Created by liyuanhua on 18/3/14.
 */
public class CombineSortedList {

    public static ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 == null)
                return list1;

        ListNode head = null;
        if(list1.val <= list2.val){
            head = list1;
            head.next = merge(list1.next, list2);
        }
        else {
            head = list2;
            head.next = merge(list1, list2.next);
        }

        return head;
    }


    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);

        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);
        list2.next.next.next = new ListNode(6);

        ListNode res = merge(list1, list2);

        while(res != null){
            System.out.print(res.val);
            res = res.next;
        }


    }

}
