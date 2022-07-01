package lc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Card24GameTest {

  Card24Game c;
  @BeforeEach
  void setUp() throws Exception {
    c = new Card24Game();
  }

  @Test
  void test1() {
    
    int[] cards = {9, 3, 2, 1};
    assertTrue(c.judgePoint24(cards));
  }
  
  @Test
  void test2() {
    
    int[] cards = {4, 1, 8, 7};
    assertTrue(c.judgePoint24(cards));
  }
  
  @Test
  void test3() {
    
    int[] cards = {2, 1, 2, 1};
    assertFalse(c.judgePoint24(cards));
  }
}
