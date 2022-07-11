package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrieTest {

  Trie t;
  
  @BeforeEach
  void setUp() throws Exception {
    t = new Trie();
  }

  @Test
  void test() {
    t.insert("apple");
    assertTrue(t.search("apple"));
    assertFalse(t.search("app"));
    assertTrue(t.startsWith("apple"));
    
    t.insert("app");
    assertTrue(t.search("app"));
  }

}
