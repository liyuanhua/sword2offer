/**
 * Created by liyuanhua on 18/3/18.
 */
public class FindNumOf2_Array {

    public boolean findExec(int[][] array, int target){

        int columns = array[0].length;
        int column = columns - 1;
        int rows = array.length;
        int row = 0;

        boolean flag = false;
        while(column >= 0 && row < rows){
            if(target < array[row][column]){
                column--;
            }
            else if(target > array[row][column]){
                row++;
            }
            else{
                flag = true;
                break;
            }
        }

        return flag;
    }


    public static void main(String[] args){
        int[][] array = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15},
        };

        FindNumOf2_Array obj = new FindNumOf2_Array();
        System.out.print(obj.findExec(array, 115));

    }
}
