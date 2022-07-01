package lc;

import java.util.Arrays;

public class Dungeon {
  public int calculateMinimumHP(int[][] dungeon) 
  {
    if (dungeon.length == 1 && dungeon[0].length == 1) return dungeon[0][0] > 1 ? 1 : Math.abs(dungeon[0][0]) + 1;
 
    int[][] wboard = new int[dungeon.length+1][dungeon[0].length+1];
    
    // fill our min health boardwith max values;
    for(int r = 0; r < wboard.length; r++) {
      Arrays.fill(wboard[r], Integer.MAX_VALUE);
    }
    // set our exit points to 1, which would be the min health for a positive value
    // at the exit
    wboard[dungeon.length][dungeon[0].length-1] = 1;
    wboard[dungeon.length-1][dungeon[0].length] = 1;
    
    // now to fill in the points in reverse order
    for(int r = dungeon.length-1; r >= 0; r--) {
      for (int c = dungeon[0].length-1; c >= 0; c--) {
        // calc the min health needed utilizing the values at the exit points of this cell
        wboard[r][c] = Math.min(wboard[r][c+1], wboard[r+1][c]) - dungeon[r][c];
        
        // if the calc of health < 0, set to 1, since the val in this point of the dungeon is positive
        wboard[r][c] = wboard[r][c] <= 0 ? 1 : wboard[r][c];
      }
    }
    
    // the first position will be the absolute min health we'll need
    return wboard[0][0];  
  }
  
 
}



