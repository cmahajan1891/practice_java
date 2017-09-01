public class VerticalSum {
	public static void verticalSum(BinaryTreeNode root){
		HashMap<Integer,Integer> map = new HashMap<>();
		verticalSum(root,map,0);
		System.out.println();
	}

	public static void verticalSum(BinaryTreeNode root, HashMap map, int c){
		if (root.getLeft()!=null) {
			verticalSum(root.getLeft(), map, c-1);
		}
		if (root.getRight()!=null) {
			verticalSum(root.getRight(), map, c+1);
		}
		int data = 0;
		if (map.contains(c)) {
			data = map.get(c);
		}
		map.put(c,root.getData()+data);
	}
}