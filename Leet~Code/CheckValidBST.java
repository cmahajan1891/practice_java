public class CheckValidBST {
	public boolean isValidBST(BinarySearchTreeNode root){
		isvalid(BinarySearchTreeNode root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isvalid(BinarySearchTreeNode root, int min, int max){
		if (root == null) {
			return true;
		}
		return	(root.data > min && root.data < max && isvalid(root.getLeft(), min root.data) && isvalid(root.getRight(), root.data, max));
	}
}