package lc.medium;

public class CoinChangeII {
  public int change(int amount, int[] coins) 
  {
    if (coins.length == 0) return 0;
    
    int[] dp = new int[amount+1];
    countCoins(amount, 0, coins, dp);
    return dp[amount];
  }
  
  // need to make *unique* combinations
  void countCoins(int amount, int total, int[] coins, int[] dp)
  {
    if (total >= amount) return;
    
    for(int i = 0; i < coins.length; i++)
    {
      total = total+coins[i];
      if (total > amount) return;
      dp[total]++;
      countCoins(amount, total, coins,  dp);
    }
  }
}
