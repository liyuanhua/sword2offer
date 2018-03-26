import java.util.*;

/**
 * Created by liyuanhua on 18/3/12.
 */
public class Erchashubianli {
    public void preOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.getVal());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    public void inOrder(BinaryTreeNode root){
        if(root != null){
            inOrder(root.getLeft());
            System.out.println(root.getVal());
            inOrder(root.getRight());
        }
    }
    public void postOrder(BinaryTreeNode root){
        if(root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getVal());
        }
    }
    public void levelOrder(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
        BinaryTreeNode node;

        if(root == null)
            return;

        queue.offer(root);
        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.print(node.getVal());
            if(node.getLeft() != null)
                queue.offer(node.getLeft());
            if(node.getRight() != null)
                queue.offer(node.getRight());
        }
    }



    public void preOrderF(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode node;

        if(root == null)
            return;

        stack.push(root);

        while(!stack.isEmpty()){
            node = stack.pop();
            System.out.print(node.getVal());

            if(node.getRight() != null)
                stack.push(node.getRight());
            if(node.getLeft() != null)
                stack.push(node.getLeft());
        }



    }
    public void inOrderF(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode node;

        if(root == null)
            return;

        while(root != null){
            stack.push(root);
            root = root.getLeft();
        }

        while(!stack.isEmpty()) {
            node = stack.pop();
            System.out.print(node.getVal());
            if (node.getRight() != null)
                stack.push(node.getRight());
        }

    }

    public int getDepth(BinaryTreeNode root){

        if(root == null){
            return 0;
        }

        return Math.max(getDepth(root.getLeft()), getDepth(root.getRight())) + 1;

    }

    public int getMaxWidth(BinaryTreeNode root){

        int maxWidth = 0;
        Queue<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
        BinaryTreeNode node;

        if(root == null)
            return 0;

        queue.offer(root);
        while(!queue.isEmpty()){
            node = queue.poll();

            if(node.getLeft() != null)
                queue.offer(node.getLeft());
            if(node.getRight() != null)
                queue.offer(node.getRight());

            if(maxWidth < queue.size())
                maxWidth = queue.size();
        }

        return maxWidth;
    }


    public static void main(String[] args){
        BinaryTreeNode node8 = new BinaryTreeNode(8, null, null);
        BinaryTreeNode node7 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode node6 = new BinaryTreeNode(6, null, node8);
        BinaryTreeNode node5 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode node4 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode node3 = new BinaryTreeNode(3, node7, null);
        BinaryTreeNode node2 = new BinaryTreeNode(2, node5, node6);
        BinaryTreeNode node1 = new BinaryTreeNode(1, node3, node4);
        BinaryTreeNode root = new BinaryTreeNode(0, node1, node2);

        Erchashubianli e = new Erchashubianli();

        //System.out.print(e.getMaxWidth(root));

        //System.out.print(e.returnHighNum(root));
        //e.preOrder(root);
        System.out.print(e.getMaxWidth(root));
    }
}
