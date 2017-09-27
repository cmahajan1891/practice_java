public class WidthOfTheTree{
	public int width(BinaryTreeNode root){
		int height = 0;
		int max = 0;

		height = maxDepthRecursive(root);
		for (int i=0;i<height;i++) {
			int tmp = findWidth(root,i);
			if (max<tmp) {
				max = tmp;
			}
		}
		retun max;
	}

	public int findWidth(BinaryTreeNode root, int depth){
		if (root == null) {
			return 0;
		}else{
			if (depth == 0) {
				return 1;
			}else{
				return findWidth(root.getLeft(),depth-1) + findWidth(root.getRight(),depth-1);
			}
		}
	}

	public int maxDepthRecursive(BinaryTreeNode root){
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepthRecursive(root.getLeft());
		int rightDepth = maxDepthRecursive(root.getRight());
		return leftDepth>rightDepth?leftDepth+1;rightDepth+1;
	}
}