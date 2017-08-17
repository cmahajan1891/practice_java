public class SortedArrayToBST{
	public BinarySearchTreeNode sortedListToBST(ListNode head){
		int len = 0;
		ListNode currentNode = head;
		while (currentNode!=null) {
		 	len++;
		 	currentNode = currentNode.next;
		 }
		 return construct(head, 0, len-1);
	}

	public BinarySearchTreeNode construct(ListNode head, int start, int end){
		if (start>end) {
			return null;
		}
		int mid = start+(end-start)/2;

		BinarySearchTreeNode left = construct(head, start, mid-1);
		BinarySearchTreeNode root = new BinarySearchTreeNode(head.data);
		root.left=left;
		if (head.next!=null) {
			head.data = head.next.data;
			head.next = head.next.next; 
		}
		BinarySearchTreeNode right = construct(head, mid+1, end);
		return root;
	}
}