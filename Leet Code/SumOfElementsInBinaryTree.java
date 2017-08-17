public class SumOfElementsInBinaryTree {
	public int findSum(BinaryTreeNode root){
		int sum = 0;
		if (root == null) {
			return 0;
		}

		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);

		BinaryTreeNode tmp = null;
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp!=null) {
				sum+=tmp.getData();
				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
			}
		}
	return sum;
	}
}