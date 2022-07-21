package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

  @BeforeEach
  void setUp() throws Exception {
  }

  @Test
  void test1() {
    HappyNumber hn = new HappyNumber();
    
    assertTrue(hn.isHappy(19));
  }

  @Test
  void test2() {
    HappyNumber hn = new HappyNumber();
    
    assertFalse(hn.isHappy(2));
  }
  
  @Test
  void test3() {
    HappyNumber hn = new HappyNumber();
    
    assertFalse(hn.isHappy(30));
  }
}
