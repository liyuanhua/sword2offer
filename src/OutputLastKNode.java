/**
 * Created by liyuanhua on 18/3/14.
 */
import java.util.*;

public class OutputLastKNode {

    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<ListNode>();

        ListNode node = head;
        ListNode knode=null;

        while(node!=null) {
            stack.push(node);
            node = node.next;
        }
        if(k>stack.size())
            return null;

        for(int i=0;i<k;i++){
            knode = stack.pop();
        }

        return knode;
    }
}
