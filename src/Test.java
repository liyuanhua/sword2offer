/**
 * Created by liyuanhua on 18/3/12.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.Integer;

public class Test {

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int l = 0;
        int r = a.length-1;
        int key = 2;

        while(true) {
            int n = (l + r) / 2;

            if (a[n] == key) {
                System.out.print(n);
                break;
            }

            if(a[n] < key)
                l = n+1;
            else if(key < a[n])
                r = n-1;
        }



    }
}
