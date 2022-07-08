package lc.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lc.medium.MostWater;

class MostWaterTest {

  private MostWater test;
  @BeforeEach
  void init()
  {
    test = new MostWater();
  }
  
  @Test
  void testMaxArea1() {
    // 1 8 (8 - 1 -> 7 * 7 -> 49)
    assertEquals(49, test.maxArea(new int[] {1,8,6,2,5,4,8,3,7})); 
  }
  
  @Test
  void testMaxArea2() {
    assertEquals(1, test.maxArea(new int[] {1,1})); 
  }
  
  @Test
  void testMaxArea3() {
    assertEquals(2, test.maxArea(new int[] {1,2,1})); 
  }
  
  @Test
  void testMaxArea4() {
    // 2 6 (6 - 2 -> 4 * 30 -> 120)
    assertEquals(120, test.maxArea(new int[] {1,3,100,7,50,20,30,6,1})); 
  }
}
