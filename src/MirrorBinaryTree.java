/**
 * Created by liyuanhua on 18/3/14.
 */
public class MirrorBinaryTree {

    public void pre(TreeNode root){
        if(root == null)
            return;

        System.out.print(root.val + " ");
        pre(root.left);
        pre(root.right);
    }

    public void Mirror(TreeNode root) {
        if(root == null)
            return;

        TreeNode node = null;


        node = root.left;
        root.left = root.right;
        root.right = node;

        Mirror(root.left);
        Mirror(root.right);


    }



    public static void main(String[] args){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

        MirrorBinaryTree m = new MirrorBinaryTree();
        m.Mirror(root);
        m.pre(root);

    }
}
