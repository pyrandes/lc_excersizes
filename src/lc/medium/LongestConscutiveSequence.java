package lc.medium;

import java.util.Arrays;

public class LongestConscutiveSequence 
{
  public int longestConsecutive(int[] nums)
  {
    Arrays.sort(nums);
    
    int len = 0, ilen = 0;
    for(int i = 0; i < nums.length; i++) {
      if (i == 0) {
        ilen++;
        continue;
      }
      
      int diff = nums[i] - nums[i-1]; 
      if (diff == 0) {
        continue;        
      }
      if (diff >= 2) {
        if (len < ilen) len = ilen;
        ilen = 1;
        continue;
      }
      ilen++;
    }
    if (len < ilen) len = ilen;
    return len;
  }
}
