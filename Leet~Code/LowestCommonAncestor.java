class BSTNode {

  int num;
  BSTNode left;
  BSTNode right;

  public BSTNode(int num){
    this.num = num;
    this.left = null;
    this.right = null;
  }
}
class LowestCommonAncestor{

  BSTNode findLowestCommon(BSTNode a, BSTNode b, BSTNode root) {
        if (root == null) {
          return null;
        }
        if (root.num< a.num && root.num <b.num) {
          return findLowestCommon(a, b, root.right);
        }else if (root.num > a.num && root.num > b.num) {
          return findLowestCommon(a, b, root.left);
        }else {
          return root;
        }
  }

  public static void main(String[] args) {
    BSTNode b = new BSTNode(8);
    LowestCommonAncestor l = new LowestCommonAncestor();
    b.left = new BSTNode(4);
    b.right = new BSTNode(12);
    b.left.left = new BSTNode(2);
    b.left.right = new BSTNode(6);
    b.left.right.left = new BSTNode(5);
    b.left.right.right = new BSTNode(7);

    System.out.println(l.findLowestCommon(new BSTNode(2), new BSTNode(7), b).num);

  }
}
