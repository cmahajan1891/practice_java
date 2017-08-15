public class InsertInBinaryTreeRecursive {
	public BinaryTreeNode insertInBinaryTreeRecursive(BinaryTreeNode root, int data) {
		if (root == null) {
			return new BinaryTreeNode(data);
		}else{
			return insertHelper(root, data);
		}
	}

	public insertHelper(BinaryTreeNode root, int data){
		if (root.getLeft()!=null) {
			return insertHelper(root.getLeft(),data);
		}else{
			root.setLeft(new BinaryTreeNode(data));
			return root;
		}
		if (root.getRight()!=null) {
			return insertHelper(root.getRight(), data);
		}else {
			root.setRight(new BinaryTreeNode(data));
			return root;
		}
	}
}