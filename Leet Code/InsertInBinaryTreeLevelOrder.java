public class InsertInBinaryTreeLevelOrder {
	public BinaryTreeNode insertInBinaryTree(BinaryTreeNode root, int data){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		if (root == null) {
			root == new BinaryTreeNode(data);
			return root;
		}

		q.offer(root);
		q.offer(null);

		BinaryTreeNode tmp = null;

		while (!q.isEmpty()) {

			tmp = q.poll();
			if (tmp!=null) {

				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}else {
					tmp.setLeft(new BinaryTreeNode(data));
					return root;
				}

				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}else {
					tmp.setRight(new BinaryTreeNode(data));
					return root;
				}
			}else {
				if (!q.isEmpty()) {
					q.offer(null);
				}
			}


		}

		

	}
}