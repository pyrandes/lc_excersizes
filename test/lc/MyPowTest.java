package lc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyPowTest {
  MyPow m;
  
  @BeforeEach
  void init()
  {
    m = new MyPow();
    
  }
  
  @Test
  void test() {
    System.out.println(m.myPow(2, -2147483648));
  }

}
