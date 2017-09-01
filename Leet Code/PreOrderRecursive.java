public class PreOrderRecursive{
	public void preOrderRecursive(BinaryTreeNode root){
		if (root!=null) {
			System.out.println(root.getData());
			preOrderRecursive(root.getLeft());
			preOrderRecursive(root.getRight());
		}
	}
}