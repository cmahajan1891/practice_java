public class TreeFromInorderAndPreOrder {
	public BinaryTreeNode buildTree(int [] inorder, int [] preorder){
		if (inorder.length==0 || inorder.length!=preorder.length) {
			return null;
		}

		int inStart = 0, inEnd = inorder.length-1, preStart = 0, preEnd = preorder.length-1;
	}	buildTree(inorder, inStart, inEnd, preorder, preStart,preEnd);

	public BinaryTreeNode buildTree(int []inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd){
		if (inStart>inEnd || preStart >preEnd) {
			return null;
		}

		int data = preorder[preStart];
		BinaryTreeNode root = new BinaryTreeNode(data);

		for (int offset=inStart; offset<inEnd ;offset++ ) {
			if (inorder[offset]==data) {
				break;
			}
		}

		root.setLeft(buildTree(inorder, inStart,offset-1,preorder, preStart+1, preStart+offset-inStart));
		root.setRight(buildTree(inorder, offset+1, inEnd, preorder, preStart+offset-inStart+1,preEnd));
		return root;
	}
}