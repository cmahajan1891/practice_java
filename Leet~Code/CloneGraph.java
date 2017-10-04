import java.awt.Queue;
import java.util.ArrayList;
import java.util.HashMap;

class UndirectedGraphNode {

  int label;
  ArrayList <UndirectedGraphNode> neighbors;
  UndirectedGraphNode (int label){
    this.label = label;
    this.neighbors = new ArrayList<>();
  }
}

class CloneGraph {
  public UndirectedGraphNode CloneGraph(UndirectedGraphNode g){
    if (g == null) {
      return null;
    }
    Queue<UndirectedGraphNode> q = new LinkedList<>();
    HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
    UndirectedGraphNode newHead = new UndirectedGraphNode(g.label);
    q.offer(newHead);
    map.put(g, newHead);
    while (!q.isEmpty()) {
      UndirectedGraphNode curr = q.poll();
      ArrayList<UndirectedGraphNode> neighbors = curr.neighbors;
      for (UndirectedGraphNode node : neighbors) {
        if (!map.containsKey(node)) {
          UndirectedGraphNode cpy = new UndirectedGraphNode(node.label);
          map.put(node, cpy);
          map.get(curr).neighbors.add(cpy);
          q.offer(neighbors);
        }else {
          map.get(curr).neighbors.add(map.get(node));
        }
      }

    }
  return newHead;
  }

  public static void main(String[] args) {

  }
}
