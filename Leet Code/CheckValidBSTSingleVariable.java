public  class CheckValidBSTSingleVariable {
	private int prev = Integer.MIN_VALUE;

	public checkValidBSTSingleVariable (BinarySearchTreeNode root){
		isValidBST(root);
	}

	public isValidBST(BinarySearchTreeNode root) {
		if (root == null) {
			return true;
		}
		if (!isValidBST(root.getLeft())) {
			return false;
		}
		if (root.data < prev) {
			return false;
		}
		prev = root.data;
		
		return isValidBST(root.getRight());
	}
}