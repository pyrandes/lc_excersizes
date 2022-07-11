package lc.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands 
{
  int numRows, numCols;
  
  
  public int numIslands(char[][] grid) 
  {
    if (grid == null) return 0;
    
    numRows = grid.length;
    numCols = grid[0].length;
    
    int numIslands = 0;
    
    for(int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        if (grid[r][c] == '1') {
          numIslands++;
          findIsland(grid, r, c);
        }
      }
    }
    
    return numIslands;
  }
  
  private void findIsland(char[][] grid, int r, int c)
  {   
    int loc = c + r*numCols;
    Queue<Integer> q = new LinkedList<>();
    q.add(loc);
    while(q.size() > 0) {
      loc = q.poll();
      
      int rLoc = loc / numCols, 
          cLoc = loc % numCols;
//      grid[rLoc][cLoc] = 'v';
      
      if ((rLoc+1 < numRows) && grid[rLoc+1][cLoc] == '1') {
        q.add(cLoc+(rLoc+1)*numCols);
        grid[rLoc+1][cLoc] = 'v';
      }
      if ((rLoc-1 >= 0) && grid[rLoc-1][cLoc] == '1') {
        q.add(cLoc+(rLoc-1)*numCols);
        grid[rLoc-1][cLoc] = 'v';
      }
      if ((cLoc+1 < numCols) && grid[rLoc][cLoc+1] == '1') {
        q.add((cLoc+1)+(rLoc)*numCols);
        grid[rLoc][cLoc+1] = 'v';
      }
      if ((cLoc-1 >= 0) && grid[rLoc][cLoc-1] == '1') {
        q.add((cLoc-1)+(rLoc)*numCols);
        grid[rLoc][cLoc-1] = 'v';
      }
    }
  }
}

