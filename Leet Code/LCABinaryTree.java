public class LCABinaryTree{
	public BinaryTreeNode lcaBinaryTree (BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b){
		
		BinaryTreeNode left = null, right = null;

		if (root == null) {
			return root;
		}
		if (root == a || root == b) {
			return root;
		}

		left = lcaBinaryTree(root.getLeft(), a, b);
		right = lcaBinaryTree(root.getRight(), a, b);

		if (left!=null && right!=null) {
			return root;
		}
		else {
			return left == null ? right : left;
		}
	}
}