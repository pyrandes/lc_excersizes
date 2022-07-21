package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfMatchingSubsequencesTest {

  @Test
  void test1() {
    NumberOfMatchingSubsequences match = new NumberOfMatchingSubsequences();
    
    String s = "abcde";
    String[] words = {"a", "bb", "acd", "ace"};
    
    assertEquals(3, match.numMatchingSubseq(s, words));
  }

  
  @Test
  void test2() {
    NumberOfMatchingSubsequences match = new NumberOfMatchingSubsequences();
    
    String s = "dsahjpjauf";
    String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
    
    assertEquals(2, match.numMatchingSubseq(s, words));
  }

}
