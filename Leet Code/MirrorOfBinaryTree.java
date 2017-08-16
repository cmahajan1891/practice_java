public class MirrorOfBinaryTree {
	public BinaryTreeNode mirrorOfBinaryTree(BinaryTreeNode root){
		if (root == null) {
			return null;
		}

		mirrorOfBinaryTree(root.getLeft());
		mirrorOfBinaryTree(root.getRight());

		BinaryTreeNode tmp = null;

		tmp = root.getLeft();
		root.setLeft(roo.getRight());
		root.setRight(tmp);

		return root;
	}
}