public class PreOrderIterative {
	public ArrayList<Integer> preOrderIterative(BinaryTreeNode root){
		ArrayList<Integer> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Stack<BinaryTreeNode> sk = new Stack<>();
		sk.push(root);

		while (!sk.isEmpty()) {
			BinaryTreeNode tmp = sk.pop();
			
			if (tmp.getRight()!=null) {
				sk.push(tmp.getRight());
			}

			if (tmp.getLeft()!=null) {
				sk.push(tmp.getLeft());
			}
			
			result.add(tmp.getData());
		}
		return result;
	}
}