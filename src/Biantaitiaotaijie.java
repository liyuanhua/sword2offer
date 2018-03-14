/**
 * Created by liyuanhua on 18/3/13.
 */
public class Biantaitiaotaijie {
    public int JumpFloorII(int target) {
        if (target == 0)
            return -1;
        if (target == 1)
            return 1;
        else
            return 2 * JumpFloorII(target - 1);
    }



}