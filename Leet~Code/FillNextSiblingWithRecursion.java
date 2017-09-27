public class FillNextSiblingWithRecursion {
	public void fillNextSiblingWithRecursion(NextSiblingTreeNode root){
		if (root == null) {
			return ;
		}
		if (root.getLeft()!=null) {
			root.getLeft().setNextSibling(root.getRight());
		}
		if (root.getRight()!=null) {
			if (root.getNextSibling()!=null) {
				root.getRight().setNextSibling(root.getNextSibling().getLeft());
			}else{
				root.getRight().setNextSibling(null);
			}
		}
		
		fillNextSiblingWithRecursion(root.getLeft());
		fillNextSiblingWithRecursion(root.getRight());

	}
}