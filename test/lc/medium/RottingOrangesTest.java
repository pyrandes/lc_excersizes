package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RottingOrangesTest {

  RottingOranges ro;
  
  @BeforeEach
  void setup() {
    ro = new RottingOranges();
  }
  
  @Test
  void test1() {
    int[][] grid = {
        {2,1,1},
        {1,1,0},
        {0,1,1}
    };
    
    assertEquals(4, ro.orangesRotting(grid));
  }

  
  @Test
  void test2() {
    int[][] grid = {
        {2,1,1},
        {1,1,0},
        {1,0,1}
    };
    
    assertEquals(-1, ro.orangesRotting(grid));
  }
  
  @Test
  void test4() {
    int[][] grid = {
        {2,1,1,0,1},
        {1,1,0,1,2},
        {1,0,1,1,0}
    };
    
    assertEquals(3, ro.orangesRotting(grid));
  }
  
  @Test
  void test3() {
    int[][] grid = {
        {0,2}
    };
    
    assertEquals(0, ro.orangesRotting(grid));
  }
}
