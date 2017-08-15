public class FillNextSiblingLevelOrder {
	public static void fillNextSibling(NextSiblingTreeNode root){
		
		if (root == null) {
			return ;
		}
		
		Queue<NextSiblingTreeNode> qu = new LinkedList<NextSiblingTreeNode>();
		qu.offer(root);
		qu.offer(null);

		while (!qu.isEmpty()) {
			NextSiblingTreeNode tmp = qu.poll();

			if (tmp!=null) {
				tmp.setNextSibling(qu.peek());
				if (tmp.getLeft()!=null) {
					qu.offer(tmp.getLeft());
				}
				if (tmp.getRight()!=null) {
					qu.offer(tmp.getRight());
				}
			}else{
				if (!qu.isEmpty()) {
					qu.offer(null);
				}
			}
		}
	}
}