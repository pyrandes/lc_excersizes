package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordDictionaryTest {

  WordDictionary t;
  
  @BeforeEach
  void setUp() throws Exception {
    t = new WordDictionary();
    t.addWord("bad");
    t.addWord("dad");
    t.addWord("mad");
  }

  @Test
  void test1() {
    assertFalse(t.search("pad"));
  }

  @Test
  void test2() {
    assertTrue(t.search("bad"));
  }
  @Test
  void test3() {
    assertTrue(t.search(".ad"));
  }
  @Test
  void test4() {
    assertTrue(t.search("b.."));
  }
}
