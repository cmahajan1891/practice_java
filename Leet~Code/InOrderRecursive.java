public class InOrderRecursive {
	public void recursiveInOrder(BinaryTreeNode root){
		if (root!=null) {
			recursiveInOrder(root.getLeft());
			System.out.println(root.getData());
			recursiveInOrder(root.getRight());	
		}
		
	} 
}