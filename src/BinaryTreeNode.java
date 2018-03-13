/**
 * Created by liyuanhua on 18/3/12.
 */
public class BinaryTreeNode {
    private int val;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal(){
        return this.val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public BinaryTreeNode getLeft(){
        return this.left;
    }
    public void setLeft(BinaryTreeNode node){
        this.left = node;
    }
    public BinaryTreeNode getRight(){
        return this.right;
    }
    public void setRight(BinaryTreeNode node){
        this.right = node;
    }
}
