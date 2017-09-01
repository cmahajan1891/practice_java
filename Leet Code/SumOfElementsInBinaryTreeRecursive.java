public class SumOfElementsInBinaryTreeRecursive {
	public int findSum(BinaryTreeNode root){
		if (root == null) {
			return 0;
		}
		else return root.getData() + findSum(root.getLeft()) + findSum(root.getRight());
	}
}