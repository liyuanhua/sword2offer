import java.util.ArrayList;

/**
 * Created by liyuanhua on 18/3/14.
 */
public class Tiaozhengshuzushunxu {

    public void reOrderArray(int[] array) {

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0 && array[j+1]%2==1){
                    int tmp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = tmp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        Tiaozhengshuzushunxu t = new Tiaozhengshuzushunxu();

        t.reOrderArray(array);

        for(int i = 0; i < 10; i++)
            System.out.print(array[i]);

    }
}
