public class TreeFromInOrderAndPostOrder {
	public BinaryTreeNode buildBT(int[] inorder, int [] postorder){
		if (postorder.length==0 || postorder.length!=inorder.length) {
			return null;
		}
		return buildBT(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
	}

	public BinaryTreeNode buildBT(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
		if (postStart>postEnd||inStart>inEnd) {
			return  null;
		}
		int data = postorder[postEnd];
		BinaryTreeNode curr = new BinaryTreeNode(data);
		for (int offset = inStart;offset<inEnd;offset++) {
			if(inorder[offset]==data){
				break;
			}
		}

		curr.setLeft(buildBT(inorder, inStart, offset-1, postorder, postStart, postStart+offset-1-instart));
		curr.setRight(buildBT(inorder, offset+1, inEnd, postorder, postStart+offset-instart,postEnd-1));
		return curr;
	}
}