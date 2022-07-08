package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum 
{
  List<List<Integer>> comboList;
  Stack<Integer> stack;
  
  // candidates are constrained to be unique
  // we also need to find unique combos
  public List<List<Integer>> combinationSum(int[] candidates, int target)
  {
    comboList = new ArrayList<>();
    stack = new Stack<>();
    
    findCombos(candidates, target, 0);
    
    return comboList;
  }
  
  public void findCombos(int[] candidates, int target, int i) {
    if (target <= 0) 
      return;
    if (i >= candidates.length || candidates[i] > target) 
       return;
    if (candidates[i] == target) {
      List<Integer> combo = new ArrayList<>(stack);
      combo.add(candidates[i]);
      comboList.add(combo);
      return;
    }
      
    stack.push(candidates[i]);
    findCombos(candidates, target-candidates[i], i);
    stack.pop();
    findCombos(candidates, target, i+1);
  }
}
