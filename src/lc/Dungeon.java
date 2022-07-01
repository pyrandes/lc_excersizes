package lc;

import java.util.Arrays;

public class Dungeon {
  public int calculateMinimumHP(int[][] dungeon) 
  {
    if (dungeon.length == 1 && dungeon[0].length == 1) return dungeon[0][0] > 1 ? 1 : Math.abs(dungeon[0][0]) + 1;
 
    int[][] wboard = new int[dungeon.length+1][dungeon[0].length+1];
    for(int r = 0; r < wboard.length; r++) {
      Arrays.fill(wboard[r], Integer.MAX_VALUE);
    }
    wboard[dungeon.length][dungeon[0].length-1] = 1;
    wboard[dungeon.length-1][dungeon[0].length] = 1;
    
    
    for(int r = dungeon.length-1; r >= 0; r--) {
      for (int c = dungeon[0].length-1; c >= 0; c--) {
        wboard[r][c] = Math.min(wboard[r][c+1], wboard[r+1][c]) - dungeon[r][c];
        wboard[r][c] = wboard[r][c] <= 0 ? 1 : wboard[r][c];
      }
    }
    
    return wboard[0][0];  
  }
  
 
}



