package lc.medium;

import java.util.HashMap;
import java.util.Map;

public class NumMatrix {
  int[][] matrix;
  int n, m;
  
  public NumMatrix(int[][] matrix) {
    this.matrix = matrix;
    n = matrix.length;
    m = matrix[0].length;
  }
  
  public int sumRegion(int row1, int col1, int row2, int col2) 
  {
    return sumRegion(row1, col1, row2, col2, new HashMap<>());
  }
  
  private int sumRegion(int r1, int c1, int r2, int c2, Map<Integer, Map<Integer, Integer>> sums) 
  {
    if (c2 < c1) return 0;
    if (r2 < r1) return 0;

    if (c2 == c1 && r2 == r1) return matrix[r1][c1];
    
    int code1 = codify(r1, c1), code2 = codify(r2, c2);
    if (sums.containsKey(code1) && sums.get(code1).containsKey(code2)) return sums.get(code1).get(code2);
    
    // sum between code1 and code 2 is:
    //   the element at code2 +
    //   the sum between code1 and <r2,c2-1> + 
    //   the sum between code1 and <r2-1,c2> -
    //   the sum between code1 and <r2-1,c2-1>
    
    
    int sum = matrix[r2][c2] +
           sumRegion(r1, c1, r2,c2-1, sums) +
           sumRegion(r1, c1, r2-1,c2, sums) -
           sumRegion(r1, c1, r2-1,c2-1, sums)
    ;
    
    sums.computeIfAbsent(code1, HashMap::new);
    sums.get(code1).put(code2, sum);
    return sum;
  }
  
  // some helper functions to codify 2-d coord's into a 1-d array
  private int codify(int r, int c) {
    return c + r*m;
  }
}
