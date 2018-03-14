/**
 * Created by liyuanhua on 18/3/13.
 */
public class Juxingfugai {
    /*
    n个2*1的矩形覆盖2*n的大矩形
    n=0 : 0
    n=1 : 1
    n=2 : 2
    n=3 : 3
    n=4 : 5
    */
    public int RectCover(int target) {
        if(target ==0)
            return 0;
        if(target <=1)
            return 1;
        if(target == 2)
            return 2;
        return RectCover(target-1) + RectCover(target-2);

    }
}
