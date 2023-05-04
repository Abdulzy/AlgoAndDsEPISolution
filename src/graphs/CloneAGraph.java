package graphs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// using a map to check if it exist and if it doesnt add it to the edges
public class CloneAGraph {

  public Node cloneGraph(Node node) {
    return cloneGraphHelper(node, new HashMap<>());
  }
  public Node cloneGraphHelper(Node node, Map<Node, Node> visited) {
    if (node == null) return null;

    if (visited.containsKey(node)) return visited.get(node);

    Node newNode = new Node(node.val);
    visited.put(node, newNode);

    for (Node child: node.neighbors) {
      newNode.neighbors.add(cloneGraphHelper(child, visited));
    }
    return newNode;
  }
}
