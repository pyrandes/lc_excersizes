package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SprialMatrixTest {

  @BeforeEach
  void setUp() throws Exception {
  }

  @Test
  void test() {
    int[][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    final List<Integer> expResult = Arrays.asList(1,2,3,6,9,8,7,4,5); 
    
    SpiralMatrix sm = new SpiralMatrix();
    final List<Integer> actResult= sm.spiralOrder(matrix);
    
    IntStream.range(0, actResult.size()).boxed()
      .forEach(i -> assertEquals(expResult.get(i), actResult.get(i)));
    ;
  }

  @Test
  void test2() {
    int[][] matrix = {
        { 1, 2, 3, 4},
        { 5, 6, 7, 8},
        { 9,10,11,12}
    };
    final List<Integer> expResult = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7); 
    
    SpiralMatrix sm = new SpiralMatrix();
    final List<Integer> actResult= sm.spiralOrder(matrix);
    
    IntStream.range(0, actResult.size()).boxed()
      .forEach(i -> assertEquals(expResult.get(i), actResult.get(i)));
    ;
  }
  
}
