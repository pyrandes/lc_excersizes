package lc.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph 
{

  public Node cloneGraph(Node node) 
  {    
    if (node == null) return null;
    if (node.neighbors.size() == 0) return new Node(node.val);
    
    Map<Integer, Node> nodeMap = new HashMap<>();
    return cloneGraphDFS(node, nodeMap);
  }
  
  // it works, but is less efficient
  public Node cloneGraphBFS(Node node, Map<Integer, Node> visited) 
  {
    Node cpNode = new Node(node.val);
    visited.put(node.val, cpNode);
    
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while(!q.isEmpty()) {
      Node n = q.poll();
      
      for(Node neighbor: n.neighbors) {
        if (!visited.containsKey(neighbor.val)) {
          visited.put(neighbor.val, new Node(neighbor.val));
          q.add(neighbor);
        }
        visited.get(n.val).neighbors.add(visited.get(neighbor.val));
            
      }
    }
    return cpNode;
  }
  
  // in this case, DFS is slightly more efficient
  public Node cloneGraphDFS(Node node, Map<Integer, Node> visited) 
  {
    if (visited.containsKey(node.val)) return visited.get(node.val);
    
    Node cpNode = new Node(node.val);
    visited.put(node.val, cpNode);
    for(Node neighbor: node.neighbors) {
      cpNode.neighbors.add(cloneGraphDFS(neighbor, visited));
    }
    return cpNode;
  }
  
  
  public static class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
  }
}
