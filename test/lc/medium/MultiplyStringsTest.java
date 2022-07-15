package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplyStringsTest {
  MultiplyStrings ms;
  
  @BeforeEach
  void setUp() throws Exception {
    ms = new MultiplyStrings();
  }

  @Test
  void test() {
    assertEquals("6", ms.multiply("2", "3"));
  }

  @Test
  void test2() {
    assertEquals("56088", ms.multiply("123", "456"));
  }
}
