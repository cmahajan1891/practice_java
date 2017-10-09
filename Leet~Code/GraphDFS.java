import java.util.*;

class GraphNode {
  int n;
  GraphNode[] neighbors;
  boolean visited;
  GraphNode(int n){
    this.n = n;
  }
}

class GraphDFS {
  public static void dfs(GraphNode root) {
    Stack<GraphNode> stk = new Stack<>();
    stk.push(root);
    System.out.print(root.n);
    root.visited = true;
    while (!stk.isEmpty()) {
        GraphNode tmp = stk.pop();
        for (GraphNode c : tmp.neighbors) {
          if (c.visited == false) {
            System.out.print(c.n);
            c.visited = true;
            stk.push(c);
          }
        }
    }
  }

  public static void main(String[] args) {
    GraphNode n1 = new GraphNode(1); // 1 --> 2 , 3, 5
    GraphNode n2 = new GraphNode(2); // 2 --> 4
		GraphNode n3 = new GraphNode(3); // 3 --> 1, 4, 5
		GraphNode n4 = new GraphNode(4); // 4 --> 2, 3, 5
		GraphNode n5 = new GraphNode(5); // 5 --> 1, 3, 4

		n1.neighbors = new GraphNode[]{n2,n3,n5};
		n2.neighbors = new GraphNode[]{n1,n4};
		n3.neighbors = new GraphNode[]{n1,n4,n5};
		n4.neighbors = new GraphNode[]{n2,n3,n5};
		n5.neighbors = new GraphNode[]{n1,n3,n4};

    dfs(n1);
  }
}
