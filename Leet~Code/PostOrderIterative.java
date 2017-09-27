public class PostOrderIterative {
	public ArrayList<Integer> postOrder(BinaryTreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}

		Stack<BinaryTreeNode> stk = new Stack<>();
		stk.push(root);

		BinaryTreeNode prev = null;

		while (!stk.isEmpty()) {
			BinaryTreeNode currentNode = stk.peek();
			if (prev == null || prev.getLeft() == currentNode || prev.getRight()==currentNode) {
				if (currentNode.getLeft()!=null) {
					currentNode = currentNode.getLeft();
				}
				if (currentNode.getRight()!=null) {
					currentNode = currentNode.getRight();
				}
			}else {
				if (currentNode.getLeft()==prev) {
					if (currentNode.getRight()!=null) {
						currentNode.getRight();
					}
				}else {
					result.add(currentNode.getData());
					stk.pop();
				}
				prev = currentNode;

			}	
		}
	return result;
	}
}