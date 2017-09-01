public class LCABST {
	public BinaryTreeNode lcaBST(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b){
		if (root == null) {
			return null;
		}
		if (root == a || root == b) {
			return root;
		}
		if (Math.max(a.getData(),b.getData())<root.getData()) {
			return lcaBST(root.getLeft(),a,b);
		}
		else if (Math.min(a.getData(),b.getData())>root.getData()) {
			return lcaBST(root.getRight(),a,b);
		}else{
			return root;
		}
	}
}