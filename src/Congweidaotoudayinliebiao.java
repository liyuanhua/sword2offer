/**
 * Created by liyuanhua on 18/3/11.
 */
import java.util.ArrayList;
import java.util.Stack;

public class Congweidaotoudayinliebiao {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while(!stack.isEmpty()){
            array.add(stack.pop());
        }

        return array;
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
