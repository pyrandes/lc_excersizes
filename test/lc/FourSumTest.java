package lc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FourSumTest {

  FourSum ts;
  
  @BeforeEach
  void setUp() throws Exception {
    ts = new FourSum();
    
  }

  @Test
  void testFourSum() {
    int[] nums = {1,0,-1,0,-2,2};
    int target = 0;
    
    List<List<Integer>> rslt = ts.fourSum(nums, target);
    
    List<Integer> l1 = Arrays.asList(-2, -1, 1, 2);
    List<Integer> l2 = Arrays.asList(-2, 0, 0, 2);
    List<Integer> l3 = Arrays.asList(-1, 0, 0, 1);
    
    for(List<Integer> l: rslt) {
      assertTrue(l.containsAll(l1) || l.containsAll(l2) || l.containsAll(l3));
    }
  }

  
  @Test
  void testFourSum1() {
    int[] nums = {2,2,2,2,2};
    int target = 8;
    
    List<List<Integer>> rslt = ts.fourSum(nums, target);
    
    List<Integer> l1 = Arrays.asList(2, 2, 2, 2);
    
    for(List<Integer> l: rslt) {
      assertTrue(l.containsAll(l1));
    }
  }
  
  @Test
  void testFourSum2() {
    int[] nums = {0,0,0,0};
    int target = 0;
    
    List<List<Integer>> rslt = ts.fourSum(nums, target);
    
    List<Integer> l1 = Arrays.asList(0, 0, 0, 0);
    
    for(List<Integer> l: rslt) {
      assertTrue(l.containsAll(l1));
    }
  }
      

  @Test
  void testFourSum3() {
    int[] nums = {1000000000,1000000000,1000000000,1000000000};
    long target = -294967296;
    
    List<List<Integer>> rslt = ts.fourSum(nums, target);
    
    assertTrue(rslt.isEmpty());
  }
}
