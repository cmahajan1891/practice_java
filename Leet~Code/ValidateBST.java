class ValidateBST {
  boolean isValidBST(TreeNode root) {
  double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY;
      return isValidBST(root, min, max);
}
  public boolean isValidBST(TreeNode root, double min, double max){
      if(root == null) return true;
      if(root.val <= min || root.val >= max) return false;
      return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
  }

  public static void main(String[] args) {

  }
}
