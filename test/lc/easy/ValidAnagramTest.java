package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

  ValidAnagram va;
  
  @BeforeEach
  void setUp() throws Exception {
    va = new ValidAnagram();
  }

  @Test
  void test1() {
    String s = "anagram", t= "nagaram";
    
    assertTrue(va.isAnagram(s, t));
  }

  @Test
  void test2() {
    String s = "rat", t= "car";
    
    assertFalse(va.isAnagram(s, t));
  }
  
}
