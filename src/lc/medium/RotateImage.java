package lc.medium;

public class RotateImage {
  public void rotate(int[][] matrix) 
  {
    int l = 0, r = matrix.length-1;
    while(l < r) {
      for(int i = 0; i < r-l; i++) {
        int tmp = matrix[l][l+i];
        
        matrix[l][l+i] = matrix[r-i][l];
        matrix[r-i][l] = matrix[r][r-i];
        matrix[r][r-i] = matrix[l+i][r];
        matrix[l+i][r] = tmp;
        
      }
      l++; r--;
    }     
  }
  
  public void mirrorDiagonal(int[][] matrix) 
  {
    for(int r = 0; r < matrix.length; r++) {
      for(int c = 0; c < r; c++) {
        int tmp = matrix[c][r];
        matrix[c][r] = matrix[r][c];        
        matrix[r][c] = tmp;
      }
    }
  }     

  public void mirrorSecondaryDiagonal(int[][] matrix) 
  {
    int n = matrix.length;
    for(int r = n-1; r >= 0; r--) {
      for(int c = 0; c < n-r-1; c++) {
        int tmp = matrix[r][c];
        matrix[r][c] = matrix[n-c-1][n-r-1];        
        matrix[n-c-1][n-r-1] = tmp;
      }
    }
  }     

  
}
