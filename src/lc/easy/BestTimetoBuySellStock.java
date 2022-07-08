package lc.easy;

public class BestTimetoBuySellStock 
{
  public int maxProfit(int[] prices)
  {
    return findMaxProfit(prices, 0, prices.length-1);
  }
  
  private int findMaxProfit(int[] prices, int buyDay, int sellDay) 
  {
    if (sellDay < buyDay) return 0;
  
    int profit = prices[sellDay] - prices[buyDay];
    int lprofit = findMaxProfit(prices, buyDay+1, sellDay);
    int rprofit = findMaxProfit(prices, buyDay, sellDay-1);
    
    return (profit > lprofit && profit > rprofit) ? profit
        : (lprofit < rprofit) ? rprofit
        : lprofit;
        
  }
}
