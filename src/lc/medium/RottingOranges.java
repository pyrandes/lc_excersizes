package lc.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RottingOranges {
  int n, m;
  List<Set<Integer>> groupedOranges;
  
  public int orangesRotting(int[][] grid) 
  {   
    n = grid.length;
    m = grid[0].length;
    groupedOranges = new LinkedList<>();
    for (int r = 0; r < n; r++) {
      for(int c = 0; c < m; c++) {
        if (grid[r][c] > 0 && grid[r][c] < 3) findOrangeGroups(grid, r, c);
      }
    }
    
    Queue<Integer> rottenQueue = new LinkedList<>();
    for(Set<Integer> grp: groupedOranges) {
      if (checkOrangeGroupNoRotted(grp, grid)) 
        return -1;
    }
    
    for(Set<Integer> grp: groupedOranges) {
      for(int loc: grp) {
        int r = loc / m, c = loc % m;
        if (grid[r][c] != 4) continue;

        if (r+1 < n && grid[r+1][c] == 3) {
          int newLoc = c + (r+1)*m;          
          rottenQueue.add(newLoc);
        } 
        if (r-1 > -1 && grid[r-1][c] == 3) {
          int newLoc = c + (r+-11)*m;          
          rottenQueue.add(newLoc);
        } 
        if (c+1 < m && grid[r][c+1] == 3) {
          int newLoc = (c+1) + r*m;          
          rottenQueue.add(newLoc);
        } 
        if (c-1 > -1 && grid[r][c-1] == 3) {
          int newLoc = (c-1) + r*m;          
          rottenQueue.add(newLoc);
        }
      }
    }
    
    int time = 0;
    boolean noRotted = true;
    while(noRotted) {     
      
      Queue<Integer> newQ = new LinkedList<>();
      while(!rottenQueue.isEmpty()) {        
        int loc = rottenQueue.poll();
        int r = loc / m, c = loc % m;
        grid[r][c] = 4;
//        System.out.println(r + "," + c);
        
        if (r+1 < n && grid[r+1][c] == 3) {
          int newLoc = c + (r+1)*m;          
          if(!newQ.contains(newLoc)) newQ.add(newLoc);
        } 
        if (r-1 > -1 && grid[r-1][c] == 3) {
          int newLoc = c + (r-1)*m;
          if(!newQ.contains(newLoc)) newQ.add(newLoc);
        } 
        if (c+1 < m && grid[r][c+1] == 3) {
          int newLoc = (c+1) + r*m;
          if(!newQ.contains(newLoc)) newQ.add(newLoc);
        } 
        if (c-1 > -1 && grid[r][c-1] == 3) {
          int newLoc = (c-1) + r*m;
          if(!newQ.contains(newLoc)) newQ.add(newLoc);
        }
      }
      time++;
      rottenQueue = newQ;
      if (rottenQueue.isEmpty()) noRotted = false;
    }
    return time;    
  }
  
  boolean checkOrangeGroupNoRotted(Set<Integer> grp, int[][] grid) {
    for(int loc: grp) {
      int r = loc / m, c = loc % m;
      
      if (grid[r][c] == 4) return false;
    }
    return true;
  }
  
  void findOrangeGroups(int[][] grid, int r, int c) {
    int loc = c + r*m;
    Queue<Integer> q = new LinkedList<>();
    grid[r][c] = grid[r][c] == 1 ? 3 : 4;
    q.add(loc);
    Set<Integer> groupList = new HashSet<>();
    while(q.size() > 0) {
      loc = q.poll();
      if (!groupList.contains(loc)) groupList.add(loc);
      
      int rLoc = loc / m, 
          cLoc = loc % m;
     
      if ((rLoc+1 < n) && (grid[rLoc+1][cLoc] == 1 || grid[rLoc+1][cLoc] == 2)) {
        q.add(cLoc+(rLoc+1)*m);
        grid[rLoc+1][cLoc] = grid[rLoc+1][cLoc] == 1 ? 3 : 4;
      }
      if ((rLoc-1 >= 0) && (grid[rLoc-1][cLoc] == 1 || grid[rLoc-1][cLoc] == 2)) {
        q.add(cLoc+(rLoc-1)*m);
        grid[rLoc-1][cLoc] = grid[rLoc-1][cLoc] == 1 ? 3 : 4;
      }
      if ((cLoc+1 < m) && (grid[rLoc][cLoc+1] == 1 || grid[rLoc][cLoc+1] == 2)) {
        q.add((cLoc+1)+(rLoc)*m);
        grid[rLoc][cLoc+1] = grid[rLoc][cLoc+1] == 1 ? 3 : 4;
      }
      if ((cLoc-1 >= 0) && (grid[rLoc][cLoc-1] == 1 || grid[rLoc][cLoc-1] == 2)) {
        q.add((cLoc-1)+(rLoc)*m);
        grid[rLoc][cLoc-1] = grid[rLoc][cLoc-1] == 1 ? 3 : 4;
      }
    }
    groupedOranges.add(groupList);
  }
}
 