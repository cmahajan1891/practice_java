public class PostOrderRecursive {
	public void postOrderRecursive(BinaryTreeNode root){
		if (root != null) {
			postOrderRecursive(root.getLeft());
			postOrderRecursive(root.getRight());
			System.out.println(root.getData());	
		}
		
	}
}