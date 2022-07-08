package lc.medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

  ProductOfArrayExceptSelf prod;
  
  @BeforeEach
  void setUp() throws Exception {
    prod = new ProductOfArrayExceptSelf();
  }

  @Test
  void test() {
    int nums[] = {1,2,3,4};
    
    assertArrayEquals(new int[] {24,12,8,6}, prod.productExceptSelf(nums));
  }

  @Test
  void test1() {
    int nums[] = {-1,1,-0,-3,3};
    
    assertArrayEquals(new int[] {0,0,9,0,0}, prod.productExceptSelf(nums));
  }
}
