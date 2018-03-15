/**
 * Created by liyuanhua on 18/3/15.
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PrintBinaryTree_Up2Down {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode node;

        if (root == null)
            return list;

        queue.offer(root);
        while (!queue.isEmpty()) {
            node = queue.poll();
            list.add(node.val);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }

        return list;


    }
}
