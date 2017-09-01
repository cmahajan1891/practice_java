public class BinaryTreeNode {
	
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	public BinaryTreeNode (int data, BinaryTreeNode left, BinaryTreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData(){
		return data;
	}
	public setData(int data){
		this.data = data;
	}
	public setLeft(BinaryTreeNode left){
		this.left = left;
	}
	public BinaryTreeNode getLeft(){
		return this.left;
	}
	public BinaryTreeNode getRight(){
		this.right;
	}
	public setRight(BinaryTreeNode right){
		this.right = right;
	}
	public String toString1(){
		return Integer.toString(data);
	}
	public boolean isLeaf(){
		return this.left == null && this.right == null;
	}

	public static boolean findInBT(BinaryTreeNode root, int data){
		if(root == null) return false;
		if(root.getData() == data) return true;
		return findInBT(root.getLeft(),data) || findInBT(root.getRight(),data);
	}
	public String toString(){
		if (isLeaf()) {
			return this.toString1();
		}
		else{
			String root="", left="null", right="null";
			root = this.toString1();
			if (getLeft()!=null) {
				left = this.getLeft().toString();
			}
			if (getRight()!=null) {
				right = this.getRight().toString();
			}
			return root + " (" + left + ", " + right + " )";
		}
	}

	public int hashCode(){
		int result = this.hashCode();
		if (getLeft()!=null) {
			result += 3* getLeft().hashCode(); 
		}
		if (getRight()!=null) {
			result += 7* getRight().hashCode();
		}
		return result;
	}

	public int numberOfNodes(){
		int leftCount = this.left == null ? 0: left.numberOfNodes();
		int rightCount = this.right == null ? 0: right.numberOfNodes();
		return 1 + leftCount + rightCount;
	}

	public BinaryTreeNode copy() {
		BinaryTreeNode left = null, right = null;
		if (this.getLeft()!=null) {
			left = this.getLeft().copy();
		}
		if (this.getRight()!=null) {
			right = this.getRight().copy();
		}
		return new BinaryTreeNode(this.data, left, right);
	}

	public BinaryTreeNode reverse(){
		BinaryTreeNode left = null, right = null;
		if (this.getLeft()!=null) {
			left = this.getLeft().reverse();
		}
		if (this.getRight()!=null) {
			right = this.getRight().reverse();
		}
		return new BinaryTreeNode(this.data, right, left);
	}

	public BinaryTreeNode reverseInPlace(){
		if (getLeft()!=null) {
			left.reverseInPlace();
		}
		if (getRight()!=null) {
			right.reverseInPlace();
		}
		BinaryTreeNode tmp = this.left;
		this.setLeft(this.right);
		this.setRight(tmp);

	}
}