package lc.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RedundantConnection {
  public int[] findRedundantConnection(int[][] edges)
  {
    Map<Integer, Integer> destToParent = new HashMap<>();
    Set<Integer> parentSet = findParents(edges);
    List<int[]> extraEdges = new ArrayList<>(); 
    for(int[] edge: edges) {
      int par  = edge[0];
      int dest = edge[1];
      if (parentSet.contains(dest) ) {
        par = edge[1];
        dest = edge[0];
      }
      
      if (!destToParent.containsKey(dest)) {
        parentSet.add(par);
        destToParent.put(dest, par);
        continue;
      }
      
      extraEdges.add(edge);
    }
    
    
    if (extraEdges.size() > 0)
      return extraEdges.get(extraEdges.size()-1);
    return new int[] {};
  }

  Set<Integer> findParents(int[][] edges) {
    Map<Integer, Integer> edgeCnt = new HashMap<>();
    for(int[] edge: edges) {    
      edgeCnt.compute(edge[0], (k, v) -> v == null ? 1 : v+1);
      edgeCnt.compute(edge[1], (k, v) -> v == null ? 1 : v+1);
    }
    return edgeCnt.entrySet()
        .parallelStream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toSet());
  }
}
