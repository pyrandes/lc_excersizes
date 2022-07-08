package lc.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams 
{
  public List<List<String>> groupAnagrams(String[] strs)
  {
    if (strs.length == 0) return new LinkedList<>();
    List<List<String>> grpAnaList = new LinkedList<>();
    if (strs.length == 1)  {
      grpAnaList.add(Arrays.asList(strs));
      return grpAnaList;
    }
    
    // this isnt very efficient, but it works for a brute-force method.
    search(strs, 0, new LinkedList<>(), grpAnaList);
    return grpAnaList;
  }
    
  private void search(String[] strs, int idx, List<String> used, List<List<String>> grpAnaList)
  {
    if (idx >= strs.length) return;
    String wrd = strs[idx];
    if (used.contains(wrd)) {
      search(strs, idx+1, used, grpAnaList);
      return;
    }
    
    List<String> anaList = new LinkedList<String>();
    used.add(wrd);
    anaList.add(wrd);
    
    for(int i = idx+1; i < strs.length; i++)
    {
      if (isAnagram(wrd, strs[i])) {
        anaList.add(strs[i]);
        used.add(strs[i]);
        continue;
      }
    }
    
    if (!anaList.isEmpty()) grpAnaList.add(anaList);
    search(strs, idx+1, used, grpAnaList);
  }
  
  private boolean isAnagram(String s, String t) 
  {
    if (s.length() != t.length()) return false;
    
    int[] chars = new int[26];
    
    for(int i = 0; i < s.length(); i++) {
      int cs = s.charAt(i)%26;
      int ct = t.charAt(i)%26;
      
      chars[cs]++;
      chars[ct]--;
    }
    
    for(int cnt: chars) {
      if (cnt != 0) return false;
    }
      
    return true;
  }
}
