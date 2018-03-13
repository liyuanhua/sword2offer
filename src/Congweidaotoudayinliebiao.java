/**
 * Created by liyuanhua on 18/3/11.
 */
import java.util.ArrayList;

public class Congweidaotoudayinliebiao {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        ListNode n = listNode;
        while(n != null) {
            list1.add(n.val);
            n = n.next;

        }

        for(int i=list1.size()-1;i>=0;i--){
            list2.add(list1.get(i));

        }
        return list2;
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
