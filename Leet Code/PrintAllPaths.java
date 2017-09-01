public class PrintAllPaths {
	public void printPath(BinaryTreeNode root){
		int [] pa = new int [256];
		printPath(pa, root, 0);
	}

	private void printPath(int[] pa, BinaryTreeNode root, int pathLength){
		if (root == null) {
			return;
		}
		pa[pathLength] = root.getData();
		pathLength++;

		if (root.getLeft()==null && root.getRight()==null) {
			return printData(pa, pathLength);
		}else {
			printPath(pa, root.getLeft(), pathLength);
			printPath(pa, root.getRight(), pathLength);
		}
	}

	private void printData(int[] pa, int pathLength){
		for (int i=0; i<pathLength ;i++) {
			System.out.println(pa[i]+" ");
		}
		System.out.println();
	}
}