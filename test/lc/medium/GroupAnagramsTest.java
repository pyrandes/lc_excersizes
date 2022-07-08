package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

  GroupAnagrams ga;
  
  @BeforeEach
  void setUp() throws Exception {
    ga = new GroupAnagrams();
  }

  @Test
  void test() {
    String[] str = {"eat","tea","tan","ate","nat","bat"};
    
    List<List<String>> grpAna = ga.groupAnagrams(str);
    
    assertFalse(grpAna.isEmpty());
    assertEquals(3, grpAna.size());
    
    
  }

  @Test
  void test1() {
    String[] str = {};
    
    List<List<String>> grpAna = ga.groupAnagrams(str);
    
    assertTrue(grpAna.isEmpty());    
  }
  
  @Test
  void test2() {
    String[] str = {"a"};
    
    List<List<String>> grpAna = ga.groupAnagrams(str);
    
    assertFalse(grpAna.isEmpty());
    assertEquals(1, grpAna.size());
    assertEquals(1, grpAna.get(0).size());
  
    assertEquals("a", grpAna.get(0).get(0));
  }
  
}
