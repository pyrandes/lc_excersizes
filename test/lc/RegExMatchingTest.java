package lc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegExMatchingTest {

  private RegExMatching test;
  
  @BeforeEach
  private void setup()
  {
    
    test = new RegExMatching();
  }
  
  @Test
  void test6() {
    String x = "aadbbbbbbc",
           p = "a**dbb*c";
    assertFalse(test.isMatch(x, p));  // should be false?    
  }
  
  @Test
  void test5() {
    String x = "aadbbbbbbc",
           p = "a*dbb*c";
    assertTrue(test.isMatch(x, p));   
  }
  
  @Test
  void test4() {
    String x = "aaabbbbbbb",
    p = "aaab*";
    assertTrue(test.isMatch(x, p));   
  }
  
  @Test
  void test3() {
    String x = "aa",
    p = "aa";
    assertTrue(test.isMatch(x, p));   
  }
  
  @Test
  void test2() {
    String x = "aaaab",
    p = "a*";
    assertFalse(test.isMatch(x, p));   
  }
  
  @Test
  void test1() {
    String x = "0000-42a1234",
        p = ".*";
    assertTrue(test.isMatch(x, p));
  }

  @Test
  void test7() {
    String x = "dbaccbaddbeb",
        p = "d.*a";
    assertFalse(test.isMatch(x, p));
  }
}
