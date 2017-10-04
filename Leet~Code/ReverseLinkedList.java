class ListNode {
  int val;
  ListNode next;
  public ListNode(int val){
    this.val = val;
  }
}
class ReverseLinkedList {
  void reverse(ListNode root) {
    ListNode curr = root, prev = null, next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
        // ListNode r = new ListNode(tmp.val);
        //next = tmp.next;
        //r.next = prev;
        //prev = r;
        //tmp = tmp.next;
    }
    //root = prev; return prev O(1) Space

    while (prev != null) {
      System.out.println(prev.val);
      prev = prev.next;
    }

  }

  public static void main(String[] args) {
    ReverseLinkedList r = new ReverseLinkedList();
    ListNode l = new ListNode(1);
    l.next = new ListNode(2);
    l.next.next = new ListNode(3);
    l.next.next.next = new ListNode(4);
    l.next.next.next.next = new ListNode(5);
    r.reverse(l);
  }
}
