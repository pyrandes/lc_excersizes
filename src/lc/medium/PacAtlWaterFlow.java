package lc.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacAtlWaterFlow 
{
  int rowSize, colSize;
  
  public List<List<Integer>> pacificAtlantic(int[][] heights)
  {
    if (heights == null) return new ArrayList<>();
   
    rowSize = heights.length;
    colSize = heights[0].length;
    if (rowSize == 1 && colSize == 1) {
      List<Integer> coord = Arrays.asList(0, 0);
      return Arrays.asList(coord);
    }
    
    Set<Integer> pacSet = new HashSet<>(), atlSet = new HashSet<>();
    for(int c = 0; c < colSize; c++) {
      dfs(heights, 0, c, pacSet, heights[0][c]);
      dfs(heights, rowSize-1, c, atlSet, heights[rowSize-1][c]);
    }
    
    for(int r = 0; r < rowSize; r++) {
      dfs(heights, r, 0, pacSet, heights[r][0]);
      dfs(heights, r, colSize-1, atlSet, heights[r][colSize-1]);
    }    

    List<List<Integer>> flowList = new ArrayList<>();
    for(int r = 0; r < rowSize; r++) {
      for (int c = 0; c < colSize; c++) {
        int code = r*colSize+c;    
        if (pacSet.contains(code) && atlSet.contains(code)) {
          flowList.add(Arrays.asList(r, c));
          continue;
        }
      }
    }
    
    
    return flowList;
  }
  
  private void dfs(int[][] heights, int r, int c, Set<Integer> visited, int lastHeight) 
  {
    if (r < 0 || r >= rowSize || c < 0 || c >= colSize) return;
    int code = r*colSize+c;
    if (visited.contains(code)) return;
    if (heights[r][c] < lastHeight) return;
    
    visited.add(code);
    dfs(heights, r+1, c, visited, heights[r][c]);
    dfs(heights, r-1, c, visited, heights[r][c]);
    dfs(heights, r, c+1, visited, heights[r][c]);
    dfs(heights, r, c-1, visited, heights[r][c]);
  }
  
   /**                colSize-1
                          |    
                [ 1 2 2 3 5 ] - 0
                [ 3 2 3 4 4 ]
                [ 2 4 5 3 1 ]
                [ 6 7 1 4 5 ]
   rowSize-1  - [ 5 1 1 2 4 ]
                  |
                  0
   */
}
