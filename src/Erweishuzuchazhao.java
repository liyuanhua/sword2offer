/**
 * Created by liyuanhua on 18/3/11.
 */
public class Erweishuzuchazhao {
    public boolean Find(int target, int [][] array) {
        boolean flag;

        flag = false;
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[i].length;j++){
                if(target == array[i][j])
                    return true;
            }
        return flag;
    }

    public static void main(String[] args){
        int[][] array = {{1,2,3},{4,5,6}};

        Erweishuzuchazhao e = new Erweishuzuchazhao();
        boolean res = e.Find(7,array);

        System.out.printf("res is:%s", res);
    }
}