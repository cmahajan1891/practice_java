public class SearchInBinaryTreeLevelOrder {
	public boolean searchInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
		if (root == null) {
			return false;
		}
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		BinaryTreeNode tmp = null;
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp.getData()==data) {
				return true;
			}
			if (tmp!=null) {
				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
			}
		}
	return false;
	}
}