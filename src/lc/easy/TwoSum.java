package lc.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) 
  {
    Map<Integer, Integer> idxMap = new HashMap<>();    

    for(int i = 0; i < nums.length; i++)
    {
      int rslt = target - nums[i];
      if (idxMap.containsKey(rslt)) return new int[] {idxMap.get(rslt), i};
      
      idxMap.put(nums[i], i);
    }
    
    return new int[] {}; // no indicies can be found
  }
}


// {2,7,11,15}, target = 9
/* 0] rslt = 9 - 2 = 7
 * 1] rslt = 9 - 7 = 2  
 */
