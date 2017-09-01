public class CheckPathForSum {
	public boolean hasPathSum(BinaryTreeNode root, int sum){
		if (root == null) {
			return false;
		}
		if (root.getLeft() == null && root.getRight() == null && root.data == sum) {
			return true;
		}
		return hasPathSum(root.getLeft(), sum - root.data) || hasPathSum(root.getRight(), sum - root.data);
	}
}