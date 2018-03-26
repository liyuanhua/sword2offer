/**
 * Created by liyuanhua on 18/3/11.
 */
import java.util.ArrayList;
import java.util.Stack;

public class Congweidaotoudayinliebiao {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;

        }

        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }



    public static void main(String[] args){
        ListNode listnode = new ListNode(1);
        listnode.next = new ListNode(2);
        listnode.next.next = new ListNode(3);


        Congweidaotoudayinliebiao c = new Congweidaotoudayinliebiao();

        ArrayList<Integer> array = c.printListFromTailToHead(listnode);
        for(int i = 0;i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
