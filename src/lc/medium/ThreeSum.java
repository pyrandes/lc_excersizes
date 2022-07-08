package lc.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreeSum {
  
  int target = 0;
  
  /**
   * return all triplets of i, j, k in nums such that nums[i] + nums[j] + nums[k] = 0
   *   and i != j, i != k, and j != k
   * @param nums
   * @return
   */
  public List<List<Integer>> threeSum(int[] nums) 
  {
    return findThreeSumsCache(nums);
  }
   
  public List<List<Integer>> findThreeSumsCache(int[] nums) 
  {
    Map<Integer, List<List<Integer>>> sumList = new HashMap<>();
    
    // {-1,0,1,2,-1,-4}
    Arrays.sort(nums);
    // {-4,-1,-1,0,1,2}
    //      1 
    //        -1  +  2 = 1  -- OK
    //         0  +  2 = 2  -- not ok
    //        -1  +  1 = 0  -- not ok
    //        -1  +  0 = 1  -- OK
    
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (i > 0 && nums[i-1] == num) continue;     
      
      int l = i+1, r = nums.length-1;
      while(l < r) {
        int numl = nums[l], numr = nums[r];
        if (num + numl + numr < target) {
          l++;
          continue;
        }
        if (num + numl + numr > target) {
          r--;
          continue;
        }
        if (!sumList.containsKey(num)) sumList.put(num, new ArrayList<>());
        sumList.get(num).add(Arrays.asList(nums[i], numl, numr));
        while (l < r && numl == nums[l])
          l++;
        
      }
    }
    
    return sumList.values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
  }
}
