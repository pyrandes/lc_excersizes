package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BestTimetoBuySellStockTest {

  BestTimetoBuySellStock best;

  @BeforeEach
  void setUp() throws Exception {
    best = new BestTimetoBuySellStock();
  }

  @Test
  void test() {
    int prices[] = {7,1,5,3,6,4};
    
    assertEquals(5, best.maxProfit(prices));
  }

  
  @Test
  void test1() {
    int prices[] = {7,6,5,3,1};
    
    assertEquals(0, best.maxProfit(prices));
  }
  
  @Test
  void test2() {
    int prices[] = {2,1,4};
    
    assertEquals(3, best.maxProfit(prices));
  }
  @Test
  void test3() {
    int prices[] = {2,4,1};
    
    assertEquals(2, best.maxProfit(prices));
  }
  
}
