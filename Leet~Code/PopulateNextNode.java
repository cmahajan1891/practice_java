import java.util.*;

class BinaryTreeNode {
  BinaryTreeNode left;
  BinaryTreeNode right;
  int n;
  public BinaryTreeNode(int n) {
    this.n = n;
  }
}
class PopulateNextNode {
  static void populateNext(BinaryTreeNode root) {
    Queue<BinaryTreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      BinaryTreeNode tmp = q.remove();
      if (tmp!=null) {
        System.out.print(tmp.n);
        System.out.print("-->");
        if (tmp.left!=null) {
          q.add(tmp.left);
        }
        if (tmp.right!=null) {
          q.add(tmp.right);
        }
      }else {
        if (!q.isEmpty()) {
          q.add(null);
        }
        System.out.print("NULL");
        System.out.println();
      }
    }
  }
  public static void main(String[] args) {
    BinaryTreeNode b = new BinaryTreeNode(10);
    b.left = new BinaryTreeNode(5);
    b.right = new BinaryTreeNode(15);
    b.left.left = new BinaryTreeNode(2);
    b.left.right = new BinaryTreeNode(7);
    b.right.left = new BinaryTreeNode(12);
    b.right.right = new BinaryTreeNode(17);

    PopulateNextNode p = new PopulateNextNode();
    p.populateNext(b);
  }

}
