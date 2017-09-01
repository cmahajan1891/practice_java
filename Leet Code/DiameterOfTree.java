public class DiameterOfTree {

	public static int diameter = 0;

	public int diameterOfBinaryTree(BinaryTreeNode root) {
        findDiameter(root);
        return diameter;
    }

	public int findDiameter(BinaryTreeNode root){
		
		int left = 0, right = 0;
		if (root == null) {
			return 0;
		}

		
		left = findDiameter(root.getLeft());
		right = findDiameter(root.getRight());

		if (left + right > diameter) {
			diameter = left + right;	
		}
		
		return Math.max(left, right) + 1;
	}

	//Alternative method to find the diameter of the tree.
	public int findDiameterAlt(BinaryTreeNode root){
		
		if (root == null) {
			return 0;
		}

		int len1 = height(root.getRight()) + height(root.getLeft());
		int len2 = Math.max(findDiameterAlt(root.getLeft()), findDiameterAlt(root.getRight()));

		return Math.max(len1, len2);
	}

	public int height (BinaryTreeNode root){
		if (root == null) {
			return 0;
		}

		int leftDepth = height(root.getLeft());
		int rightDepth = height(root.getRight());

		return Math.max(leftDepth, rightDepth) + 1;
	}
}