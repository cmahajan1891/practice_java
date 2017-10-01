import java.math.*;

class BinaryTreeNode{
  int num;
  BinaryTreeNode left;
  BinaryTreeNode right;
  public BinaryTreeNode(int n){
    num = n;
    left = null;
    right = null;
  }
}
class BalancedBinaryTree {
  boolean isBalanced(BinaryTreeNode main) {
    if (main == null) {
      return false;
    }
    // if (isBalanced(main.left) && isBalanced(main.right)) {
    //   return true;
    // }
    return Math.abs(height(main.left) - height(main.right)) <= 1 && isBalanced(main.left) && isBalanced(main.right);
  }

  int height(BinaryTreeNode t) {
    if (t == null) {
      return 0;
    }
    return Math.max(height(t.left), height(t.right)) + 1;
  }

  public static void main(String[] args) {
    BalancedBinaryTree t = new BalancedBinaryTree();
    BinaryTreeNode b1 = new BinaryTreeNode(1);
    b1.left = new BinaryTreeNode(2);
    b1.left.left = new BinaryTreeNode(3);
    b1.left.left.left = new BinaryTreeNode(4);
    b1.right = new BinaryTreeNode(2);
    b1.right.right = new BinaryTreeNode(2);
    b1.right.right.right = new BinaryTreeNode(2);
    System.out.print(t.isBalanced(b1));
  }
}
