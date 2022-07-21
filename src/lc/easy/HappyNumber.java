package lc.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
  public boolean isHappy(int n) {
    
    boolean notHappy = true;
    int rem = n;
    Set<Integer> calcs = new HashSet<>();
    calcs.add(n);
    while(notHappy) {
      int sum = 0;
      while(rem > 0) {
        int dig = rem % 10;
        rem = rem / 10;
        sum += Math.pow(dig, 2);
      }
      rem = sum;
      if (calcs.contains(rem) || rem == 1) {
        notHappy = false;
        continue;
      }
      calcs.add(rem);
    }
    return rem == 1;
  }
}
