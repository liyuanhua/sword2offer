/**
 * Created by liyuanhua on 18/3/11.
 */
import java.util.ArrayList;
import java.util.Stack;

public class DeleteListSomeNode {
    public ListNode deleteListSomeNode(ListNode listNode, int num) {

        ListNode n = listNode;
        ListNode p = null;
        ListNode head = null;


        if(listNode.val == num){
            head = listNode.next;
            return head;
        }

        head = n;
        while(n != null){
            if(n.val != num){
                p = n;
                n = n.next;
            }
            if(n.val == num){
                p.next = n.next;
                break;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode listnode = new ListNode(1);
        listnode.next = new ListNode(2);
        listnode.next.next = new ListNode(3);
        listnode.next.next.next = new ListNode(4);
        DeleteListSomeNode obj = new DeleteListSomeNode();
        listnode = obj.deleteListSomeNode(listnode, 4);


        while(listnode != null){
            System.out.print(listnode.val);
            listnode = listnode.next;
        }

    }
}
