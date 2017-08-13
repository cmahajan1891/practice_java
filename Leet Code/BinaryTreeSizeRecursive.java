public class BinaryTreeSizeRecursive {
	int sizeRecursive(BinaryTreeNode root){

		int leftCount = root.getLeft() == null ? 0 : sizeRecursive(root.getLeft());
		int rightCount = root.getRight() == null ? 0 : sizeRecursive(root.getRight());
		return 1 + leftCount + rightCount;
	}
}