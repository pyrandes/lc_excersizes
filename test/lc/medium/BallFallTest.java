package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallFallTest {

  @Test
  void test1() {
    int[][] grid = {
        { 1, 1, 1,-1,-1},
        { 1, 1, 1,-1,-1},
        {-1,-1,-1, 1, 1},
        { 1, 1, 1, 1,-1},
        {-1,-1,-1,-1,-1}
    };
    
    int[] rslt = {1,-1,-1,-1,-1};
    
    BallFall bf = new BallFall();
    assertArrayEquals(rslt, bf.findBall(grid));
  }

  @Test
  void test2() {
    int[][] grid = {
        { -1}
    };
    
    int[] rslt = {-1};
    
    BallFall bf = new BallFall();
    assertArrayEquals(rslt, bf.findBall(grid));
  }
  
  @Test
  void test2a() {
    int[][] grid = {
        {1}
    };
    
    int[] rslt = {-1};
    
    BallFall bf = new BallFall();
    assertArrayEquals(rslt, bf.findBall(grid));
  }
  
  @Test
  void test3() {
    int[][] grid = {
        { 1, 1, 1, 1, 1, 1},
        {-1,-1,-1,-1,-1,-1},
        { 1, 1, 1, 1, 1, 1},
        {-1,-1,-1,-1,-1,-1}
    };
    
    int[] rslt = {0, 1, 2, 3, 4, -1};
    
    BallFall bf = new BallFall();
    assertArrayEquals(rslt, bf.findBall(grid));
  }
  
  @Test
  void test4() {
    int[][] grid = {
        { 1, 1, 1, 1, 1},
        { 1, 1, 1, 1, 1}
    };
    
    int[] rslt = {2,3,4,-1,-1};
    
    BallFall bf = new BallFall();
    assertArrayEquals(rslt, bf.findBall(grid));
  }

}
