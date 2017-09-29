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
  // This method is only correct to display a cloned structure but not modify the actual tree.
  // static void populateNext(BinaryTreeNode root) {
  //   Queue<BinaryTreeNode> q = new LinkedList<>();
  //   q.add(root);
  //   q.add(null);
  //   while (!q.isEmpty()) {
  //     BinaryTreeNode tmp = q.remove();
  //     if (tmp!=null) {
  //       System.out.print(tmp.n);
  //       System.out.print("-->");
  //       if (tmp.left!=null) {
  //         q.add(tmp.left);
  //       }
  //       if (tmp.right!=null) {
  //         q.add(tmp.right);
  //       }
  //     }else {
  //       if (!q.isEmpty()) {
  //         q.add(null);
  //       }
  //       System.out.print("NULL");
  //       System.out.println();
  //     }
  //   }
  // }

  //In order to modfiy the structure of the main tree follow the following algorithm.
  static void populateNext(BinaryTreeNode root) {
    if (root == null) {
      return ;
    }
    Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
    LinkedList<Integer> depthQueue = new LinkedList<>();
    nodeQueue.offer(root);
    depthQueue.offer(1);
    while (!nodeQueue.isEmpty()) {
      BinaryTreeNode tmp = nodeQueue.poll();
      Integer depth = depthQueue.poll();
      if (depthQueue.isEmpty()) {
        tmp.next = null;
      }else if (depthQueue.peek()>depth) {
        tmp.next = null;
      }else {
        tmp.next = nodeQueue.peek();
      }
      if (tmp.left!=null) {
        nodeQueue.offer(tmp.left);
        depthQueue.offer(depth+1);
      }
      if (tmp.right!=null) {
        nodeQueue.offer(tmp.right);
        depthQueue.offer(depth+1);
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
// TODO Practice the other way to solve the problem as well by using the last head, last current, current head and current last.
}
