public class MaxDepthInBinaryTreeWithLevelOrder{
	public int maxDepthInBinaryTreeWithLevelOrder(BinaryTreeNode root){
		int maxDepth = 0;

		if (root == null) {
			return 0;
		}

		Queue<BinaryTreeNode> q = new LinkedList<>();
		
		BinaryTreeNode tmp = null;

		q.offer(root);
		q.offer(null);
		
		while (!q.isEmpty()) {
			tmp = q.pop();
			
			if (tmp!=null) {
				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}

				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
			}else{
				if (!q.isEmpty()) {
					q.offer(null);
				}
				maxDepth++;
			}
			
		}

	return  maxDepth;	
	
	}
}