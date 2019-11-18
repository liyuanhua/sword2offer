/**
 * Created by liyuanhua on 18/3/13.
 */
public class Qingwatiao {
    public int returnFibonacciNum(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            return returnFibonacciNum(n-2) + returnFibonacciNum(n-1);
        }

    }

    public static void main(String[] args){
        Fibonacci f = new Fibonacci();

        for(int i=1;i<10;i++)
            System.out.print(f.returnFibonacciNum(i));

    }
}
