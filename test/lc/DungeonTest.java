package lc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DungeonTest {
  Dungeon t;
  
  @BeforeEach
  void setUp() throws Exception {
    t = new Dungeon();
  }

  @Test
  void test1() {
    int[][] board = 
      {{-2 , -3 , 3 }
      ,{-5 ,-10 , 1 }
      ,{ 10, 30 , -5}};
    assertEquals(7, t.calculateMinimumHP(board));
  }

  
  @Test
  void test2() {
    int[][] board = 
      {{0}};
    assertEquals(1, t.calculateMinimumHP(board));
  }
  
  @Test
  void test3() {
    int[][] board = 
      {{0, -3}};
    assertEquals(4, t.calculateMinimumHP(board));
  }
  
  @Test
  void test4() {
    int[][] board = 
      {{-3, 5}};
    assertEquals(4, t.calculateMinimumHP(board));
  }
}
