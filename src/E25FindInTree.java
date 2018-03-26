/**
 * Created by liyuanhua on 18/3/19.
 */
import java.util.*;

public class E25FindInTree {

    public boolean findPath(BinaryTreeNode root, int k) {
        boolean result;
        Stack<Integer> stack = new Stack<Integer>();
        result = findPath(root, k, stack);
        return result;
    }

    public boolean findPath(BinaryTreeNode root, int k, Stack<Integer> stack) {
        boolean result = false;

        if (root == null) {
            result = false;
            return result;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            if (root.getVal() == k) {
                for (int i : stack) {
                    System.out.print(i);
                }
                result = true;
            }
        } else {
            stack.push(root.getVal());
            findPath(root.getLeft(), k, stack);
            findPath(root.getRight(), k, stack);
            stack.pop();
        }

        return result;
    }

}
