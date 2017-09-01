public class MaximumDepthBinaryTreeWithStack{
	public int maximumDepthBinaryTreeWithStack(BinaryTreeNode root){
		int maxDepth = 0; 

		if (root == null) {
			return maxDepth;
		}

		Stack<BinaryTreeNode> stk = new Stack<>();
		stk.push(root);

		BinaryTreeNode prev = null;

		while (!stk.isEmpty()) {
			BinaryTreeNode current = s.peek();
			if (prev == null || prev.getLeft() == current || prev.getRight() == current) {
				if (current.getLeft()!=null) {
					stk.push(current.getLeft());		
				}else if (current.getRight()!=null) {
					stk.push(current.getRight());
				}	
			}else if (current.getLeft() == prev) {
				if (current.getRight()!=null) {
					stk.push(current.getRight());
				}
			}else{
				stk.pop();
			}

			prev = current;
			if (stk.size()>maxDepth) {
				maxDepth = stk.size();
			}
		}
		return maxDepth;
	} 
}