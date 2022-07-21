package lc.medium;

public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites)
  {
    if (numCourses == prerequisites.length) return false;  // we will have a cycle of prereqs in here
      
    // we need to check for cyclical prereqs; can be done DFS or BFS
    
    
    return true;
  }
  
  void dfs(int[][] prerequisites, int i) 
  {
    if (i < 0 || i >= prerequisites.length) return;
    
    int[] req = prerequisites[i];
    // [0] depends on [1]
    
  }
}
