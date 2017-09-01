public class ZigZagTraversal {
	public ArrayList<ArrayList<Integer>> zigZagTraversal (BinaryTreeNode root){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		if (root == null) {
			return  res;
		}

		Queue<BinaryTreeNode> q = new Queue<>();
		BinaryTreeNode tmp = null;

		q.offer(root);
		q.offer(null);

		boolean ltr = true;

		ArrayList<Integer> curr = new ArrayList<>();

		while (!q.isEmpty()) {
			
			tmp = q.poll();
			curr.add(tmp.getData());

			if (tmp!=null) {
				if (tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}

			}else {
				if (ltr) {
					ArrayList<Integer> tmp = new ArrayList<>(curr);
					res.add(tmp);
					curr.clear();			
				}else {
					Stack<Integer> stk = new Stack<>();
					stk.addAll(curr);
					ArrayList<Integer> tmp = new ArrayList<>();
					while (!s.isEmpty()) {
						tmp.add(s.pop());
					}
					res.add(tmp);
					curr.clear();
				}
				if (!q.isEmpty()) {
					q.offer(null);
					ltr=!ltr;
				}
			}
		}
	}
}