public class MaxInBinaryTreeRecursive {
	public int max findMax(BinaryTreeNode root){
		
		int max = Integer.MIN_VALUE;
		if (root == null) {
			return max;
		}

		int leftMax = findMax(root.getLeft());
		int rightMax = findMax(root.getRight());

		if (leftMax>max) {
			max = leftMax;
		}
		if (rightMax>max) {
			max=rightMax;
		}
		if (root.getData()>max) {
			max=root.getData();
		}
	
	return max;

	}
}