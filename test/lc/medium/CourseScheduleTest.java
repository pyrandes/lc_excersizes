package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseScheduleTest {

  CourseSchedule cs;
  
  @BeforeEach
  void setUp() throws Exception {
    cs = new CourseSchedule();
  }

  @Test
  void test1() {
    int[][] prerequisites = {
        {1,0}  
    };
    
    assertTrue(cs.canFinish(2, prerequisites));
  }

  @Test
  void test2() {
    int[][] prerequisites = {
        {1,0},
        {0,1}
    };
    
    assertFalse(cs.canFinish(2, prerequisites));
  }

  @Test
  void test3() {
    int[][] prerequisites = {
        {5,4},
        {4,3},
        {4,2},
        {2,1}
    };
    
    assertTrue(cs.canFinish(5, prerequisites));
  }
  
  @Test
  void test4() {
    int[][] prerequisites = {
        {3,1},
        {2,1}
    };
    
    assertTrue(cs.canFinish(3, prerequisites));
  }
  
  @Test
  void test5() {
    int[][] prerequisites = {
        {3,1},
        {1,3}
    };
    
    assertFalse(cs.canFinish(3, prerequisites));
  }
  
  @Test
  void test6() {
    int[][] prerequisites = {
        {3,1},
        {1,4},
        {4,3}
    };
    
    assertFalse(cs.canFinish(4, prerequisites));
  }
}
