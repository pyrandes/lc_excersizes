package lc.medium;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> spiral = new LinkedList<>();
    
    int b = matrix.length,
        r = matrix[0].length,
        u = 0,
        l = 0;
        
    
    int i = u, j = l;
    boolean moveR = true, moveD = false, moveL = false, moveU = false;
    // start at 0,0, and spiral around
    while(u < b && l < r) {
      spiral.add(matrix[i][j]);
      
      
      if (j == r-1 && moveR) {
        u++;
        moveR = false;
        moveD = true;
      } else if (i == b-1 && moveD) {
        r--;
        moveD = false;
        moveL = true;
      } else if (j-1 == l-1 && moveL) {
        b--;
        moveL= false;
        moveU= true;
      } else if (i-1 == u-1 && moveU) {
        l++;
        moveU= false;
        moveR = true;
      }
      
      if(moveR) j++;
      if(moveD) i++;
      if(moveL) j--;
      if(moveU) i--;
    }
    
    
    return spiral;
  }
}
