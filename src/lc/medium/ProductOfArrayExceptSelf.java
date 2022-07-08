package lc.medium;

public class ProductOfArrayExceptSelf 
{
  public int[] productExceptSelf(int[] nums)
  {
    int[] ans = new int[nums.length];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = 1;
    }
    
    // first fill in a "prefix" matrix of values into [ans]
    for(int i = 1; i < ans.length; i++) {
      ans[i] = ans[i-1]*nums[i-1];
    }
    
    // now work backwards to calculate a "suffix" matrix back into [ans]
    for(int i = nums.length-1, suff = 1; i >= 0; i--) {
      ans[i] *= suff;
      suff *= nums[i];
    }
    
    return ans;
  }

}
