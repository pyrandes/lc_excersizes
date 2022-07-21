package lc.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> pascRows = new ArrayList<>(numRows);
    List<Integer> baseRow = new ArrayList<>(1);
    baseRow.add(1);
    pascRows.add(baseRow);
    for(int i = 1; i < numRows; i++) {
      List<Integer> newRow = new ArrayList<>(i+1);
      List<Integer> prevRow = pascRows.get(i-1);
      
      newRow.add(1);
      for(int j = 1; j < i; j++) {
        newRow.add(prevRow.get(j-1) + prevRow.get(j));
      }
      newRow.add(1);
      
      
      pascRows.add(newRow);
    }
    
    
    return pascRows;
  }
}
