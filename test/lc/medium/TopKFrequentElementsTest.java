package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

  TopKFrequentElements top;
  
  @BeforeEach
  void setUp() throws Exception {
    top = new TopKFrequentElements();
  }

  @Test
  void test() {
    int[] nums = {1,1,1,2,2,3};
    int k = 2;
    
    int[] freq = top.topKFrequent(nums, k);
    assertArrayEquals(new int[] {1, 2}, freq);
  }

  @Test
  void test1() {
    int[] nums = {1};
    int k = 1;
    
    int[] freq = top.topKFrequent(nums, k);
    assertArrayEquals(new int[] {1}, freq);
  }
 
  
  @Test
  void test2() {
    int[] nums = {1,2};
    int k = 2;
    
    int[] freq = top.topKFrequent(nums, k);
    assertArrayEquals(new int[] {1,2}, freq);
  }
}
