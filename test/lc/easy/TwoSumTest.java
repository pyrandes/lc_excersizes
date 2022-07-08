package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  TwoSum ts;
  
  
  @BeforeEach
  void setUp() throws Exception {
    ts = new TwoSum();
  }

  @Test
  void test1() {
    int[] nums = {2,7,11,15};
    int target = 9;
    
    assertArrayEquals(new int[] {0, 1}, ts.twoSum(nums, target));
  }

  @Test
  void test2() {
    int[] nums = {3,2,4};
    int target = 6;
    
    assertArrayEquals(new int[] {1, 2}, ts.twoSum(nums, target));
  }
  
  @Test
  void test3() {
    int[] nums = {3,3};
    int target = 6;
    
    assertArrayEquals(new int[] {0, 1}, ts.twoSum(nums, target));
  }
}
