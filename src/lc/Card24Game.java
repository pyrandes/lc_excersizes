package lc;

public class Card24Game {

  int trgt = 24;
  /**
   * goal is to arrange the 4 elements of cards[] in a way to
   *  total "24", utilizing operations: +, -, *, / and using (, )
   *  for separators as appropriate
   *  
   *  so given [9, 3, 2, 1] we could have 9*3 - (2+1) =? 27 - 3 = 24, so return true
   *  or given [2, 1, 2, 1] return false, since no combination will result in 24
   * 
   * @param cards -- 4 numbers from 1-9
   * @return
   */
  public boolean judgePoint24(int[] cards) 
  {   
    
    
    return false;
  }
  
  /** 
   * considerations for dfs:
   *  1) if cards[i] - cards[i+1], then cards[i] > cards[i+1]; we do not want negative numbers
   *  2)      cards[i] + cards[i+1] == cards[i+1] + cards[i]
   *     also cards[i] * cards[i+1] == cards[i+1] * cards[i]
   *     so cache these values to reduce computation
   *  3) know when to prune an operation tree off.....?
   *  4) 
   */
}
