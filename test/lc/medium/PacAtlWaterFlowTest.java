package lc.medium;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PacAtlWaterFlowTest {

  PacAtlWaterFlow p;
  
  @BeforeEach
  void setUp() throws Exception {
    p = new PacAtlWaterFlow();
  }

  @Test
  void test() {
    int[][] heights = {
        {1,2,2,3,5},
        {3,2,3,4,4},
        {2,4,5,3,1},
        {6,7,1,4,5},
        {5,1,1,2,4}
    };
    
    List<List<Integer>> waterFlow  = p.pacificAtlantic(heights);
    
  }

}
