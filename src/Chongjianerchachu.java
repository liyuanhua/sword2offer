import java.util.Arrays;

/**
 * Created by liyuanhua on 18/3/12.
 */

public class Chongjianerchachu {

    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {

        TreeNode root = new TreeNode(pre[0]);
        int index = 0;

        for(int i=0;i<in.length;i++) {
            if(in[i] == pre[0])
                index = i;

            root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index+1 ), Arrays.copyOfRange(in, 0, index));
            root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index+1, in.length));

            break;
        }
        return root;
    }
}
