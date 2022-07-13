package lc.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateImageTest {

  RotateImage r;
  
  @BeforeEach
  public void setup()
  {
    r = new RotateImage();
  }
  
  @Test
  public void test() {
    int[][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    
    printMatrix(matrix);
    r.rotate(matrix);
    printMatrix(matrix);
  }

  @Test
  public void test1() {
    int[][] matrix = {
        {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}
    };
    
    printMatrix(matrix);
    r.rotate(matrix);
    printMatrix(matrix);
  }
  
  @Test
  public void test2() {
    int[][] matrix = {
        {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}
    };
    
    System.out.println("Test2");
    printMatrix(matrix);
    r.mirrorDiagonal(matrix);
    printMatrix(matrix);
  }
  
  @Test
  public void test3() {
    int[][] matrix = {
        {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}
    };
    
    System.out.println("Test3");
    printMatrix(matrix);
    r.mirrorSecondaryDiagonal(matrix);
    printMatrix(matrix);
  }
  
  private void printMatrix(int[][] matrix) {
    for(int[] rows: matrix) {
      for(int col: rows) {
        System.out.print(String.format("%-3d", col));
      }
      System.out.println();
    }
    System.out.println();
  }
}
