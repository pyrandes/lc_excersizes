package lc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrogJump {
  
  
  /**
   *  numbers in stones is the number of "units" from origin
   *  so stones[i+1] - stones[i] = numUnits needed to jump
   *  EX:
   *    stones[i+1] = 1
   *    stones[i]   = 0
   *    1 - 0 = 1 unit to jump
   *  
   *    stones[i+1] = 10
   *    stones[i]   = 5
   *    10 - 5 = 5 unit to jump
   *  
   *  frog can only jump k-1, k, or k+1 units where k = stones[currPos]
   *  so if frog is on stones[i] where stones[i] = 5 and stones[i+1] = 12
   *    12 - 5 = 7
   *    however, frog can only jump 4, 5, or 6 units (stones[i] = 5)
   *    so the frog cannot advance
   *    
   *  List of stones guaranteed to be in sorted order
   *  Frog must land on last stone (last = stones.length-1)  
   */
  public boolean canCross(int[] stones) 
  {
    for(int i = 3; i < stones.length; i++) {
      if (stones[i] > stones[i-1]*2) 
        return false;
    }
    
    Map<Integer,Set<Integer>> stoneMap = new HashMap<>();
    for(int stone: stones) stoneMap.put(stone, new HashSet<>()); // create our hashset
    
    stoneMap.get(stones[0]).add(1);
    
    int lj = 0;
    for(int i = 0; i < stones.length-1; i++) {
      Set<Integer> availJumps = stoneMap.get(stones[i]);
      for(int jump: availJumps) {
        int target = jump + stones[i];
        if (target == stones[stones.length -1]) return true;
        
        if (!stoneMap.containsKey(target)) continue;
        if (jump-1 > 0) stoneMap.get(target).add(jump-1);
        stoneMap.get(target).add(jump);
        stoneMap.get(target).add(jump+1);
      }
    }
    
    return !stoneMap.get(stones[stones.length-1]).isEmpty();
  }
  
}
