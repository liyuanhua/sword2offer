/**
 * Created by liyuanhua on 18/3/12.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.Integer;

public class Test {
    public static void binarySearch(int[] array, int k){

        int l = 0;
        int r = array.length - 1;
        int mid ;

        while(l <= r) {
            mid = ( l + r ) / 2;
            if (array[mid] == k) {
                System.out.print(mid);
                return;
            } else if (array[mid] < k){
                l = mid + 1;
            }
            else
                r = mid - 1;
        }
    }

    public static void main(String[] args){
        int[] a = {1,3,4,5,8,9};

        binarySearch(a, 8);


    }
}
