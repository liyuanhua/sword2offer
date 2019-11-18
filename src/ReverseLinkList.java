import java.util.List;

/**
 * Created by liyuanhua on 18/3/14.
 */


public class ReverseLinkList {

    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;

        ListNode after = null;
        ListNode before = null;


        while(head != null){
            after = head.next;
            head.next = before;
            before = head;
            head = after;
        }
        return before;
    }

    public static void main(String[] args){
        ListNode root = new ListNode(0);
        root.next = new ListNode(1);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);   // 0 -> 1 -> 2 -> 3

        ReverseLinkList r = new ReverseLinkList();
        root = r.ReverseList(root);


        while(root!=null){
            System.out.print(root.val);
            root = root.next;

        }
    }
}
