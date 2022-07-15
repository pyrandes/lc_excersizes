package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoinChangeIITest {

  CoinChangeII cc;
  
  @BeforeEach
  void setUp() throws Exception {
    cc = new CoinChangeII();
  }

  @Test
  void test1() {
    int[] coins = {1,2,5};
    
    assertEquals(4, cc.change(5, coins));
  }

  
  @Test
  void test2() {
    int[] coins = {2};
    
    assertEquals(0, cc.change(3, coins));
  }
  
  @Test
  void test3() {
    int[] coins = {10};
    
    assertEquals(1, cc.change(10, coins));
  }
}
