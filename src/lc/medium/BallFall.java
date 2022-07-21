package lc.medium;

public class BallFall {
  public int[] findBall(int[][] grid) 
  {
    if (grid[0].length == 1) return new int[] {-1};
    
    int[] rslt = new int[grid[0].length];
    
    for(int j = 0; j < rslt.length; j++) {
      rslt[j] = findBall(grid, 0, j);
    }
    return rslt;
  }
  
  int findBall(int[][] grid, int r, int c) 
  {
    if (r == grid.length) {
      return c < grid[0].length ? c : -1;
    }
    if (c < 0 || c >= grid[0].length) return -1;
    
    int dir = grid[r][c];
    if (dir == 1 && c+dir < grid[0].length && grid[r][c+1] == -1) return -1;
    if (dir == -1 && c+dir > -1 && grid[r][c-1] == 1) return -1;
    
    return findBall(grid, r+1, c+dir);
  }
}
 