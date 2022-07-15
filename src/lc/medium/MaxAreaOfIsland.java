package lc.medium;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {
  int numRows, numCols;
  
  public int maxAreaOfIsland(int[][] grid) 
  {
    if (grid == null) return 0;
    
    numRows = grid.length;
    numCols = grid[0].length;
    
    int maxArea = 0;
    for(int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        if (grid[r][c] == 1) {
          maxArea = Math.max(maxArea, findIsland(grid, r, c));
        }
      }
    }
    return maxArea;
  }
  
  private int findIsland(int[][] grid, int r, int c)
  {   
    int area = 1;
    grid[r][c] = 2;
    int loc = c + r*numCols;
    Queue<Integer> q = new LinkedList<>();
    q.add(loc);
    while(q.size() > 0) {
      loc = q.poll();
      int rLoc = loc / numCols, 
          cLoc = loc % numCols;
      
      if ((rLoc+1 < numRows) && grid[rLoc+1][cLoc] == 1) {
        area += 1;
        q.add(cLoc+(rLoc+1)*numCols);
        grid[rLoc+1][cLoc] = 2;
      }
      if ((rLoc-1 >= 0) && grid[rLoc-1][cLoc] == 1) {
        area += 1;

        q.add(cLoc+(rLoc-1)*numCols);
        grid[rLoc-1][cLoc] = 2;
      }
      if ((cLoc+1 < numCols) && grid[rLoc][cLoc+1] == 1) {
        area += 1;

        q.add((cLoc+1)+(rLoc)*numCols);
        grid[rLoc][cLoc+1] = 2;
      }
      if ((cLoc-1 >= 0) && grid[rLoc][cLoc-1] == 1) {
        area += 1;

        q.add((cLoc-1)+(rLoc)*numCols);
        grid[rLoc][cLoc-1] = 2;
      }
    }
    return area;
  }
}
