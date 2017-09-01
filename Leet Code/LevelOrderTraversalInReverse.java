public class LevelOrderTraversalInReverse {
	public static void levelOrderTraversalInReverse(BinaryTreeNode root){
		if (root == null) {
			return ;
		}

		Queue<BinaryTreeNode> q = new LinkedList<>();
		Stack<BinaryTreeNode> stk = new Stack<>();
		BinaryTreeNode tmp = null;

		q.offer(root);

		while (!q.isEmpty()) {
			tmp = q.pop();
			stk.push(tmp);

			if (tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			
			if (tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
		}

		while (!stk.isEmpty()){
			System.out.println(stk.pop().getData() + " ");
		}
	}
}