public class CheckStructurallySameTrees  {
	public boolean hasSameStructure(BinaryTreeNode root, BinaryTreeNode root2){
		if (root == null && root2 == null) {
			return true;
		}
		if (root2 == null || root == null) {
			return false;
		}
		return hasSameStructure(root.getLeft(), root2.getRight()) && hasSameStructure(root.getRight(), root2.getLeft()); 
	}
}