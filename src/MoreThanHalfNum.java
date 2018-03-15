/**
 * Created by liyuanhua on 18/3/15.
 */
import java.util.*;

public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i=0;i<array.length;i++)
            map.put(array[i],0);

        int n = array.length;

        int count = 0;
        for(int i=0;i<array.length;i++){
            map.put(array[i], map.get(array[i])+1);
            count = map.get(array[i]);

            if(count > (float)n/2 ){
                return array[i];
            }
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.print((float)9/2);
    }
}
