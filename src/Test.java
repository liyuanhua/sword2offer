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

        a = Arrays.copyOfRange(a,0,2);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
