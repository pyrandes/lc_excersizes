package lc.medium;

public class SetMatrixZeroes {
  public void setZeroes(int[][] matrix) 
  {
    int n = matrix.length, m = matrix[0].length;
    
    boolean zeroRow = false;
    for (int r = 0; r < n; r++) {
      for(int c = 0; c < m; c++) {
        if (matrix[r][c] == 0) {
          if (r>0) matrix[r][0] = 0;
          matrix[0][c] = 0;
        }
        if (r == 0 && matrix[r][c] == 0) zeroRow = true;
      }
    }
   
    for(int r = 1; r < n; r++) {
      for(int c = 1; c < m; c++) {
        if (matrix[r][0] == 0 || matrix[0][c] == 0) 
          matrix[r][c] = 0;
      }
    }
    
    if (matrix[0][0] == 0) {
      for(int r= 0; r < n; r++) {
        matrix[r][0] = 0;
      }
    }
    
    if (zeroRow) {
      for(int c = 0; c < m; c++)
        matrix[0][c] = 0;
    }
  }
}
