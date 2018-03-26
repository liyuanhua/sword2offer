/**
 * Created by liyuanhua on 18/3/18.
 */
public class FindSameNodeOf2List {

    public ListNode findSameNodeOf2List(ListNode list1, ListNode list2){
        if(list1==list2){
            return list1;
        }
        int lenList1 = getLength(list1);
        int lenList2 = getLength(list2);


        if(lenList1 > lenList2){
            for(int i=0;i<lenList1-lenList2;i++)
                list1 = list1.next;
        }
        else{
            for(int i=0;i<lenList2-lenList1;i++)
                list2 = list2.next;
        }

        ListNode p = null;
        while(true) {
            if (list1 == null || list2 == null) {
                return null;
            }
            if (list1 == list2) {
                p = list1;
                break;
            }
            else {
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        return p;
    }


    private int getLength(ListNode pHead) {
        int length = 0;

        ListNode current = pHead;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);

        ListNode list2 = list1.next;


        FindSameNodeOf2List obj = new FindSameNodeOf2List();

        ListNode res = obj.findSameNodeOf2List(list1, list2);

        System.out.print(res.val);

    }
}

