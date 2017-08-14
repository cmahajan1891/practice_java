public class DeepestNode {
	public BinaryTreeNode findDeepestNode(BinaryTreeNode root){
		
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

		if (root == null) {
			return null;
		}

		BinaryTreeNode temp = null;

		queue.offer(root);
		while (!queue.isEmpty()) {
			temp = queue.poll();

			if (root.getLeft()!=null) {
				queue.offer(root.getLeft());
			}

			if (root.getRight()!=null) {
				queue.offer(root.getRight());
			}
		}
		return temp;
	}
}