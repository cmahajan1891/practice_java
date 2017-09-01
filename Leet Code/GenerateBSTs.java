public class GenerateBSTs {
	public ArrayList<BinarySearchTreeNode> generateBSTs (int n){
		if (n == 0) {
			return generateBSTs(1,0);
		}else{
			return generateBSTs(1,n);
		}
	}

	public ArrayList<BinarySearchTreeNode> generateBSTs (int start, int end){
		ArrayList<BinarySearchTreeNode> subtrees = new ArrayList<>();

		if (start > end) {
			subtrees.add(null);
			return subtrees;
		}

		for (int i = start; i <= end ; i++) {
			for (BinarySearchTreeNode left : generateBSTs(start, i-1)) {
				for (BinarySearchTreeNode right : generateBSTs(i+1, end)) {

					BinarySearchTreeNode node = new BinarySearchTreeNode(i);
					node.setLeft(left);
					node.setRight(right);
					subtrees.add(node);
				}
			}
		}
	
	return subtrees;

	}
}