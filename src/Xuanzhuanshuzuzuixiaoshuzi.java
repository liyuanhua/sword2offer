/**
 * Created by liyuanhua on 18/3/13.
 */
import java.util.ArrayList;

public class Xuanzhuanshuzuzuixiaoshuzi {

        public int minNumberInRotateArray(int [] array) {
            int min = 0;
            for(int i=0;i<array.length;i++){
                if(array[min] > array[i]){
                    min = i;
                }
            }
            return array[min];
        }



    public static void main(String[] args){
        int[] array = {3,4,1,2,3};

        Xuanzhuanshuzuzuixiaoshuzi x = new Xuanzhuanshuzuzuixiaoshuzi();

        System.out.print(x.minNumberInRotateArray(array));
    }
}
