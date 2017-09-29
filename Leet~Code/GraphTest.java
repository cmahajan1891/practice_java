class GraphNode {
  int val;
  GraphNode next;
  GraphNode [] neighbors;
  boolean visited;

  GraphNode(int x){
    val = x;
  }
  GraphNode(int x, GraphNode[] n){
    val = x;
    neighbors = n;
  }
  public String toString(){
    return "value: " + this.val;
  }
  // void method() throws  {
  //
  // }

  // public static void main(String[] args) {
  //
  // }
}

class Queue {
  GraphNode first, last;
  public void enqueue(GraphNode n){
    if (first == null) {
      first = n;
      last = first;
    }else {
      last.next = n;
      last = n;
    }
  }
  public GraphNode dequeue(){
    if (first == null) {
      return null;
    }else {
      GraphNode tmp = new GraphNode(first.val, first.neighbors);
      first = first.next;
      return tmp;
    }
  }
}

class GraphTest {
  public static void main(String[] args) {
    GraphNode n1 = new GraphNode(1);
    GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);

		n1.neighbors = new GraphNode[]{n2,n3,n5};
		n2.neighbors = new GraphNode[]{n1,n4};
		n3.neighbors = new GraphNode[]{n1,n4,n5};
		n4.neighbors = new GraphNode[]{n2,n3,n5};
		n5.neighbors = new GraphNode[]{n1,n3,n4};
    breathFirstSearch(n1, 5);
  }
  public static void breathFirstSearch(GraphNode root, int x){
    if (root.val == x) {
      System.out.print("find in root");
      }
      Queue q = new Queue();
      root.visited = true;
      q.enqueue(root);

      while (q.first!=null) {
        GraphNode tmp = q.dequeue();
        for (GraphNode g : tmp.neighbors ) {
          if (!g.visited) {
            System.out.print(g + " ");
            g.visited = true;
            if (g.val == x) {
              System.out.println("Find: " + g);
            }
            q.enqueue(g);
          }
        }
      }
  }
}
