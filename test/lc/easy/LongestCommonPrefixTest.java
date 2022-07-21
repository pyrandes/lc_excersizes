package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  @Test
  void test1() {
    String[] strs = {"flower", "flow", "flight"};
    LongestCommonPrefix lcp = new  LongestCommonPrefix();
    assertEquals("fl", lcp.longestCommonPrefix(strs));
  }

  @Test
  void test2() {
    String[] strs = {"dog", "flow", "flight"};
    LongestCommonPrefix lcp = new  LongestCommonPrefix();
    assertEquals("", lcp.longestCommonPrefix(strs));
  }
  
  
  @Test
  void test3() {
    String[] strs = {"a"};
    LongestCommonPrefix lcp = new  LongestCommonPrefix();
    assertEquals("", lcp.longestCommonPrefix(strs));
  }
}
