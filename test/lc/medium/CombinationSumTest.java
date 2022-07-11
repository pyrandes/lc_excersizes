package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lc.medium.CombinationSum;

class CombinationSumTest {

  CombinationSum c;
  
  @BeforeEach
  void setUp() throws Exception {
    c = new CombinationSum();
  }

  @Test
  void testCombinationSum1() {
    int[] candidates = {2, 3, 6, 7};
    int target = 7;
    
    List<List<Integer>> comboList = c.combinationSum(candidates, target);
    assertFalse(comboList.isEmpty());
    assertTrue(comboList.size() == 2);
    
    List<Integer> l1 = Arrays.asList(7);
    List<Integer> l2 = Arrays.asList(2,2,3);
    
    
  }

}
