public class MinInBinaryTreeRecursive {
	public int findMin (BinaryTreeNode root){
		int min = Integer.MAX_VALUE;
		
		if (root == null) {
			return min;
		}

		int leftMin = findMin(root.getLeft());
		int rightMin = findMin(root.getRight());

		if (leftMin<min) {
			min = leftMin;
		}
		if (rightMin<min) {
			min=rightMin;
		}
		if (root.getData()<min) {
			min=root.getData();
		}
	
	return min;

	}
}