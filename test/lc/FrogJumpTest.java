package lc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrogJumpTest {

  FrogJump fj;
  @BeforeEach
  void setUp() throws Exception {
    fj = new FrogJump();
  }

  @Test
  void testCanCross1() {
    int[] stones = {
        0, 1, 3, 5, 6, 8, 12, 17
    };
    assertTrue(fj.canCross(stones));
  }

  
  @Test
  void testCanCross2() {
    int[] stones = {
        0,1,2,3,4,8,9,11
    };
    assertFalse(fj.canCross(stones));
  }
  
  @Test
  void testCanCross3() {
    int[] stones = {
        0,2
    };
    assertFalse(fj.canCross(stones));
  }
  
  @Test
  void testCanCross4() {
    int[] stones = {
        0,1,3,6,10,15,16,21
    };
    assertTrue(fj.canCross(stones));
  }
}
