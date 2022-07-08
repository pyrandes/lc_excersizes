package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestConscutiveSequenceTest {

  LongestConscutiveSequence l;
  
  @BeforeEach
  void setUp() throws Exception {
    l = new LongestConscutiveSequence();
  }

  @Test
  void test() {
    int nums[] = {100,4,200,1,3,2};
    
    assertEquals(4, l.longestConsecutive(nums));
  }
  
  @Test
  void test1() {
    int nums[] = {0,3,7,2,5,8,4,6,0,1};
    
    assertEquals(9, l.longestConsecutive(nums));
  }  
  
  @Test
  void test2() {
    int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
    
    assertEquals(7, l.longestConsecutive(nums));
  }  
  
}
