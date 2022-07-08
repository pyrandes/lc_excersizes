package lc.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate 
{
  public boolean containsDuplicate(int[] nums)
  {
    return containsDuplicateBF(nums);
  }
  
  // brute force
  private boolean containsDuplicateBF(int[] nums)
  {
    Set<Integer> hs = new HashSet<>(nums.length); 
    for(int num: nums) {
      if (hs.contains(num)) return true;
      hs.add(num);
    }
    return false;
  }
}
