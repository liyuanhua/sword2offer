/**
 * Created by liyuanhua on 18/3/15.
 */
import java.util.*;
import java.util.Arrays;

public class GetLeast4Numbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(input);

        if(k > input.length)
            return res;

        for(int i=0;i<k;i++){
            res.add(input[i]);
        }

        return res;
    }
}
