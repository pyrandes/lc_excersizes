package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lc.medium.ThreeSum;

class ThreeSumTest {

  ThreeSum ts;
  
  @BeforeEach
  void setUp() throws Exception {
    ts = new ThreeSum();
    
  }

  @Test
  void testThreeSum() {
    int[] nums = {-1,0,1,2,-1,-4};
    
    List<List<Integer>> rslt = ts.threeSum(nums);
    
    List<Integer> l1 = Arrays.asList(-1, -1, 2);
    List<Integer> l2 = Arrays.asList(-1,0,-1);
    
    for(List<Integer> l: rslt) {
      assertTrue(l.containsAll(l1) || l.containsAll(l2));
    }
  }

}
