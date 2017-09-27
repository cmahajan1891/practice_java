class Node{
  int num;
  Node next;
  public Node(int num){
    this.num = num;
    this.next = null;
  }
}

class LinkedList {
  Node root;

  public void LinkedList(){
    root = null;
  }

  void addAtEnd(Node n) {
    if (root == null) {
      root = n;
      return;
    }else {
      Node tmp = root;
      while (tmp.next!=null) {
        tmp = tmp.next;
      }
      tmp.next = n;
    }
    return;
  }

  void deleteNode() {
    if (root == null || root.next == null) {
      root = null;
      return;
    }else {

      Node tmp = root.next;
      Node prev = root;

      while (tmp.next!=null) {
        prev = tmp;
        tmp = tmp.next;
      }
      prev.next = null;
    }
    return ;
  }

  public static void displayAll(Node root){
    Node tmp = root;
    while(tmp!=null){
        System.out.println(tmp.num);
        tmp = tmp.next;
    }
  }


  public static void main(String[] args) {
    Node root = new Node(5);
    LinkedList l = new LinkedList();
    l.addAtEnd(root);
    l.addAtEnd(new Node(6));
    l.addAtEnd(new Node(7));
    l.addAtEnd(new Node(8));
    LinkedList.displayAll(root);
    l.deleteNode();
    l.deleteNode();
    LinkedList.displayAll(root);
  }
}
