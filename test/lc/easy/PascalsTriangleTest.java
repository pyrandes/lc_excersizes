package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

  @BeforeEach
  void setUp() throws Exception {
  }

  @Test
  void test() {
    PascalsTriangle p = new PascalsTriangle();
    
    p.generate(5);
  }

}
