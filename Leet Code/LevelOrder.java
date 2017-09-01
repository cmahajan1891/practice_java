public class LevelOrder {
	public ArrayLis<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root){

		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		if (root == null) {
			return result;	
		}

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);

		BinaryTreeNode tmp = null;
		ArrayList<Integer> currentList = new ArrayList<>();

		while (!q.isEmpty()) {

			tmp = q.poll();
			if (tmp!=null) {
				currentList.add(tmp.getData());
				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}		
			}else{
				ArrayList<Integer> c_curr = new ArrayList<>(currentList);
				result.add(c_curr);
				currentList.clear();
				if (!q.isEmpty()) {
					q.offer(null);
				}
			}
		}

		return result;
	}
}