public class InOrderIterative {
	public ArrayList<Integer> inOrderIterative(BinaryTreeNode root) {

		ArrayList<Integer> list = new ArrayList<>();

	// 	if (root == null) {
	// 		return list;
	// 	}

	// 	Stack<BinaryTreeNode> stk = new Stack<>();
	// 	stk.push(root);

	// 	BinaryTreeNode tmp = null;

	// 	while (!stk.isEmpty()) {
			
	// 		tmp = stk.top();
	// 		if (tmp.getRight()!=null) {
	// 			stk.push(tmp.getRight());
	// 		}
	// 		if (tmp.getLeft()!=null) {
	// 			stk.push(tmp.getLeft());
	// 		}

	// 		list.add(stk.pop());

	// 	}
	// return list;

		Stack<BinaryTreeNode> stk = new Stack<>();
		boolean done = false;
		BinaryTreeNode currentNode = root;

		while(!done){
			if (currentNode!=null) {
				stk.push(currentNode);
				currentNode = currentNode.getLeft();
			}else {
				if (stk.isEmpty()) {
					done = true;
				}

				currentNode = stk.pop();
				list.add(currentNode.getData());
				currentNode = currentNode.getRight():
			}

		}
	return list;

	}
} 