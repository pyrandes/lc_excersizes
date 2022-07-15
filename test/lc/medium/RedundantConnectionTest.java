package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedundantConnectionTest {

  RedundantConnection rc;
  
  @BeforeEach
  void setUp() throws Exception {
    rc = new RedundantConnection();
  }

  @Test
  void test1() {
    int[][] edges = {
        {1,2}, 
        {1,3}, 
        {2,3}
    };
    assertArrayEquals(new int[] {2, 3}, rc.findRedundantConnection(edges));
  }

  @Test
  void test2() {
    int[][] edges = {
        {1,2}, 
        {2,3}, 
        {3,4}, 
        {1,4}, 
        {1,5} 
    };
    assertArrayEquals(new int[] {1, 4}, rc.findRedundantConnection(edges));
  }
  
  @Test
  void test3() {
    int[][] edges = {
        {1,3}, 
        {3,4}, 
        {1,5}, 
        {3,5}, 
        {2,3} 
    };
    assertArrayEquals(new int[] {3, 5}, rc.findRedundantConnection(edges));
  }
}
