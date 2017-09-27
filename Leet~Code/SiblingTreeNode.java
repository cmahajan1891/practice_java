public class SiblingTreeNode {
	public SiblingTreeNode left;
	public SiblingTreeNode right;
	public int data;
	public SiblingTreeNode nextSibling;

	public SiblingTreeNode (int data){
		this.data = data;
		left = null;
		right = null;
		nextSibling = null;
	}

	public SiblingTreeNode(int data, SiblingTreeNode left, SiblingTreeNode right, SiblingTreeNode nextSibling){
		this.data = data;
		this.left = left;
		this.right = right;
		this.nextSibling = nextSibling;
	}

	public int getData(){
		return data;
	}
	public void setData(int data ){
		this.data = data;
	}
	public void setLeft(SiblingTreeNode left){
		this.left = left;
	}
	public SiblingTreeNode getLeft(){
		return this.left;
	}
	public void setRight(SiblingTreeNode right){
		this.right = right;
	}
	public SiblingTreeNode getRight(){
		return right;
	}
	public void setNextSibling(SiblingTreeNode nextSibling){
		this.nextSibling = nextSibling;
	}
	public SiblingTreeNode getNextSibling(){
		return this.nextSibling;
	}
	public boolean isLeaf(){
		return left == null && right == null;
	}
}