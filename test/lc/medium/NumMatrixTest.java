package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumMatrixTest {

  @Test
  void test() {
    int[][] matrix = {
        {3, 0, 1, 4, 2}, 
        {5, 6, 3, 2, 1}, 
        {1, 2, 0, 1, 5}, 
        {4, 1, 0, 1, 7}, 
        {1, 0, 3, 0, 5}
    };
    
    NumMatrix nm = new NumMatrix(matrix);
    assertEquals(8, nm.sumRegion(2,1,4,3));
    assertEquals(11, nm.sumRegion(1,1,2,2));
    assertEquals(12, nm.sumRegion(1,2,2,4));
  }

  @Test
  void test2() {
    int[][] matrix = {
        { 1}, 
        {-7} 
    };
    
    NumMatrix nm = new NumMatrix(matrix);
    assertEquals(1, nm.sumRegion(0,0,0,0));
    assertEquals(-7, nm.sumRegion(1,0,1,0));
    assertEquals(-6, nm.sumRegion(0,0,1,0));
  }
}
