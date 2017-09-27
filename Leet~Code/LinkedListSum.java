import java.util.LinkedList;

class LinkedListNode {
  int num;
  LinkedListNode next;
  public LinkedListNode(int num){
    this.num = num;
  }
}

class LinkedListSum {
  static void findSum(LinkedListNode a, LinkedListNode b) {

    if (a == null) return ;
    if (b == null) return ;

    LinkedListNode tmp = null, prev = null;

    a = reverseListNode(a);
    b = reverseListNode(b);

    int sum = 0;
    while (a!=null || b!=null) {

      if(a!=null && b!=null){
          tmp = new LinkedListNode(a.num+b.num);
          tmp.next = prev;
          prev = tmp;
          a = a.next;
          b = b.next;
      }
      else if (a!=null) {
        tmp = new LinkedListNode(a.num);
        tmp.next = prev;
        prev = tmp;
        a = a.next;
      }else {
        tmp=new LinkedListNode(b.num);
        tmp.next = prev;
        prev = tmp;
        b = b.next;
      }
    }

    while (tmp!=null) {
      System.out.println(tmp.num);
      tmp = tmp.next;
    }

  }

  static LinkedListNode reverseListNode(LinkedListNode root) {
    LinkedListNode n = root, prev = null;
    LinkedListNode tmp = null;
    while(n!=null){
      tmp = new LinkedListNode(n.num);
      tmp.next = prev;
      prev = tmp;
      n = n.next;
    }
    //Solved it after so much difficulty and paitience.
    //Let me explain the concept now, we need 2 pointers, one to keep iterating the list
    //second one to updating the new list. and then assigning the new number in the list as the prev one.
    // while (tmp!=null) {
    //   System.out.print(tmp.num);
    //   tmp = tmp.next;
    // }
    return tmp;
  }


  public static void main(String[] args) {
    LinkedListSum lls = new LinkedListSum();
    LinkedListNode a = new LinkedListNode(1);
    LinkedListNode b = new LinkedListNode(4);
    a.next = new LinkedListNode(2);
    a.next.next = new LinkedListNode(3);
    //a.next.next.next = new LinkedListNode(9);
    b.next = new LinkedListNode(5);
    b.next.next = new LinkedListNode(6);
    //b.next.next.next = new LinkedListNode(0);
    lls.findSum(a,b);
  }
}
