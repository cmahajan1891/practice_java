public class MaxDepthRecursive {
	public int maxDepth(BinaryTreeNode root){
		if (root == null) {
			return 0;
		}
		int maxLeft = maxDepth(root.getLeft());
		int maxRight = maxDepth(root.getRight());

		return (maxLeft > maxRight)? maxLeft + 1: maxRight + 1;
	}
}