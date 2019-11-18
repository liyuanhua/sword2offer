/**
 * Created by liyuanhua on 18/4/1.
 */
import java.util.*;

public class StackMin {

    Stack<Integer> stack = new Stack<Integer>();

    StackMin(){
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(0);
        stack.push(16);
        stack.push(9);
    }
    public void push(int node) {
        this.stack.push(node);
    }

    public void pop() {
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int min() {
        Iterator<Integer> iterator = this.stack.iterator();
        int tmp;

        int min = this.stack.peek();
        while(iterator.hasNext()){
            tmp = iterator.next();
            if(min > tmp){
                min = tmp;
            }

        }
        return min;
    }

    public static void main(String[] args){

        StackMin obj = new StackMin();


        System.out.print(obj.min());
    }
}
