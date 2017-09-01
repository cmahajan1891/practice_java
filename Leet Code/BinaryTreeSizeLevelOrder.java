public class BinaryTreeSizeLevelOrder{
	public int sizeBinaryTree(BinaryTreeNode root){

		int count = 0;

		if (root == null) {
			return 0;
		}
		
		LinkedList<BinaryTreeNode> queue = new LinkedList<>();
		queue.offer(root);

			while(!queue.isEmpty()){
				BinaryTreeNode t = queue.poll();
				count++;
				if (t.getLeft()!=null) {
					queue.offer(t.getLeft());
				}
				if (t.getRight()!=null) {
					queue.offer(t.getRight());
				}
			}
		
		
		return count;

	}
}