public class CheckMirrors {
	public boolean areMirrors(BinaryTreeNode root, BinaryTreeNode root2) {
		if (root == null && root2 == null) {
			return true;
		}
		if (root == null || root2 == null) {
			return false;
		}
		if (root.data != root2.data) {
			return false;
		}
		else {
			return areMirrors(root.getLeft(), root2.getRight() && areMirrors(root.getRight(), root2.getLeft()));
		}
	}
}