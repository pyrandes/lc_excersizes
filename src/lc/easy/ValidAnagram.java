package lc.easy;

public class ValidAnagram 
{
  public boolean isAnagram(String s, String t) 
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
