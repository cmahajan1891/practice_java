public class MaximumLevelSum {
	public int maxLevelSum(BinaryTreeNode root){
		int max = 0, currentSum = 0;

		if (root == null) {
			return 0;
		}

		BinaryTreeNode tmp = null;

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);

		while (!q.isEmpty()) {
			tmp = q.poll();
			currentSum += tmp.getData();
			
			if (tmp!=null) {
				if (tmp.getLeft()!=null) {		
					q.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
			}else {
				if (currentSum > max) {
					max = currentSum;
				}
				currentSum = 0;
				
				if (!q.isEmpty()) {
					q.offer(null);
				}
			}
		}
	}
}