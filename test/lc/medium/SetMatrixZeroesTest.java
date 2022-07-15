package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {

  SetMatrixZeroes smz;
  
  @BeforeEach
  void setUp() throws Exception {
    smz = new SetMatrixZeroes();
  }

  @Test
  void test() {
    int[][] matrix = {
        {1,2,3,4},
        {5,0,7,8},
        {0,10,11,12},
        {13,14,15,0},
    };
    
    int[][] rsltMatrix = {
        {0,0,3,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},        
    };
    
    smz.setZeroes(matrix);
    assertArrayEquals(rsltMatrix, matrix);
  }

  @Test
  void test2() {
    int[][] matrix = {
        {0, 1, 2, 0},
        {3, 4, 5, 2},
        {1, 3, 1, 5}
    };
    
    int[][] rsltMatrix = {
        {0, 0, 0, 0},
        {0, 4, 5, 0},
        {0, 3, 1, 0}        
    };
    
    smz.setZeroes(matrix);
    assertArrayEquals(rsltMatrix, matrix);
  }
  
}
