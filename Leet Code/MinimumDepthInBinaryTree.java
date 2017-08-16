public class MinimumDepthInBinaryTree {
	public int minimumDepth(BinaryTreeNode root){
		int minDepth = 0;

		if (root == null) {
			return minDepth;
		}

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);

		int count = 1;

		BinaryTreeNode tmp = null;

		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp!=null) {

				if (tmp.getLeft()==null && tmp.getRight()==null) {
					return count;
				}

				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}

				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
				
			}else {
				if (!q.isEmpty()) {
					count++;
					q.offer(null);
				}
			}
		}
		return count;
	}
}