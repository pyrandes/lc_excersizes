package lc.easy;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) 
  {
    if(strs == null || strs[0].isEmpty()) return "";
    if (strs.length == 1) return strs[0];
    
    int i = 0;
    boolean hasPrefix = true;
    StringBuilder prefix = new StringBuilder();
    while(hasPrefix) {
      for(int s1 = 0, s2 = 1; s2 < strs.length; s1++, s2++) {
        if (i >= strs[s1].length() || i >= strs[s2].length()) {
          hasPrefix = false;
          break;
        }
        char c1 = strs[s1].charAt(i),
             c2 = strs[s2].charAt(i);
        
        if (c1 != c2) {
          hasPrefix = false;
          break;
        }
      }
      if (hasPrefix) prefix.append(strs[0].charAt(i));
      i++;
    }
    return prefix.toString();
  }
}
