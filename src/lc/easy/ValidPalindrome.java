package lc.easy;

public class ValidPalindrome 
{
  public boolean isPalindrome(String s)
  {   
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < s.length(); i++)
    {
      char c = s.charAt(i);
      if (Character.isAlphabetic(c) || Character.isDigit(c)) {
        sb.append(Character.toLowerCase(c));
      }
    }
    
    s = sb.toString();
    int l = 0, r = s.length()-1;
    while (l < r) {
      char cl = s.charAt(l), cr = s.charAt(r);
      if (cl == ' ') {
        l++;
        continue;
      }
      if (cr == ' ') {
        r--;
        continue;
      }
      
      if (cl != cr) return false;
      l++;
      r--;
    }
    return true;
  }
}
