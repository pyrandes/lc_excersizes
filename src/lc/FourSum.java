package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FourSum { 
  int[] nums; 
  List<List<Integer>> uSums;
  Stack<Integer> quads;
   
  public List<List<Integer>> fourSum(int[] nums, long target)
  {
    Arrays.sort(nums);
    this.nums = nums;
    uSums = new ArrayList<>();
    quads = new Stack<>();
    
    sumK(4, 0, target);
    return uSums;
  }
   
  private void sumK(int k, int start, long target)
  {
    if (k > 2) {
      for(int i = start; i <= nums.length-k; i++) {
        quads.push(nums[i]);
        sumK(k-1, i+1, target-nums[i]);
        quads.pop();
      }
      return;
    }
    
    // standard 2-sum here
    int l = start, r = nums.length-1;
    while(l < r) {
      int sum = nums[l] + nums[r];
      if (sum < target ) {
        l++;
        continue;
      }
      if (sum > target ) {
        r--;
        continue;
      }
      List<Integer> numstoadd = new ArrayList<>(quads);
      numstoadd.add(nums[l]);
      numstoadd.add(nums[r]);
      uSums.add(numstoadd);
            
      l++;
      while(l < r && nums[l-1] == nums[l]) {
        l++;
      }
    }
  }
}
