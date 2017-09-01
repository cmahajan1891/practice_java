public class MaxInTreeLevelOrder {
	public int findmax(BinaryTreeNode root){
		if (root==null) {
			return Integer.MIN_VALUE;
		}

		int max = Integer.MIN_VALUE;
		Queue<BinaryTreeNode> q = new LinkedList<>();

		q.offer(root);
		BinaryTreeNode tmp = null;

		while (!q.isEmpty()) {
			tmp = q.poll();

			if (tmp.getData()>max) {
				max = tmp.getData();
			}

			if (tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}

			if (tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}

		}
	
		return max;

	}
}