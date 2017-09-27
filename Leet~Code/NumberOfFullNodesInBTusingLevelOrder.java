public class NumberOfFullNodesInBTusingLevelOrder {
	public int numberOfFullNodesInBTusingLevelOrder(BinaryTreeNode root){
		if (root == null) {
			return 0;
		}

		BinaryTreeNode tmp = null;
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);

		int count=0;

		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp.getLeft()!=null && tmp.getRight()!=null) {
				count++:
			}

			if (tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if (tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
		}
		return count;
	}
}