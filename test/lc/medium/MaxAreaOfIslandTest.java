package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxAreaOfIslandTest {

  MaxAreaOfIsland m;
  
  @BeforeEach
  void setUp() throws Exception {
    m = new MaxAreaOfIsland();
  }

  @Test
  void test1() {
    int[][] grid = {
        {0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}
    };
    
    assertEquals(6, m.maxAreaOfIsland(grid));
  }

  @Test
  void test2() {
    int[][] grid = {
        {1}
    };
    
    assertEquals(1, m.maxAreaOfIsland(grid));
  }
  
}
