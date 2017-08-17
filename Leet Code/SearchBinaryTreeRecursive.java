public class SearchBinaryTreeRecursive {
	public boolean searchBinaryTree(BinaryTreeNode root, int data){
		if (root == null) {
			return false;
		}
		if (root.getData()==data) {
			return true;
		}
		return searchBinaryTree(root.getLeft(),data)||searchBinaryTree(root.getRight(),data);
	}
}