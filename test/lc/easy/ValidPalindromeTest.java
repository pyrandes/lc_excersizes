package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  ValidPalindrome v;
  
  @BeforeEach
  void setUp() throws Exception {
    v = new ValidPalindrome();
  }

  @Test
  void test() {
    String s = "A man, a plan, a canal: Panama";
    
    assertTrue(v.isPalindrome(s));
  }

  @Test
  void test1() {
    String s = "race a car";
    
    assertFalse(v.isPalindrome(s));
  }
  
  @Test
  void test2() {
    String s = " ";
    
    assertTrue(v.isPalindrome(s));
  }  
}
