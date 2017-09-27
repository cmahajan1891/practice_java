public class ConstructMirror {
	public BinaryTreeNode constructMirror(BinaryTreeNode root){

		BinaryTreeNode temp = null;
		
		if (root!=null) {
			constructMirror(root.getLeft());
			constructMirror(root.getRight());	
		
		//Swap the left and the right to create a mirror.
			temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
	
		return root;
	}
}