package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

  private ContainsDuplicate cd;
  
  @BeforeEach
  void setUp() throws Exception {
    cd = new ContainsDuplicate();
  }

  @Test
  void testContainsDuplicate1() {
    int[] nums = {1,2,3,1};
    
    assertTrue(cd.containsDuplicate(nums));
  }


  @Test
  void testContainsDuplicate2() {
    int[] nums = {1,2,3,4};
    
    assertFalse(cd.containsDuplicate(nums));
  }
  
  @Test
  void testContainsDuplicate3() {
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
    
    assertTrue(cd.containsDuplicate(nums));
  }
}
