package lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RegExMatching {
	
	public boolean isMatch(String s, String p)
	{
	  boolean match = false;
	  
	  if (p.length() == 1 && s.length() > 1) return false; // never match
	  if (p.length() == 1 && s.length() == 1 && p.charAt(0) == '.') return true; // match any character
	  if (p.length() == 2 && p.charAt(0) == '.' && p.charAt(1) == '*') return true;  // this will match everything
	  
	  List<String> pSt = new ArrayList<>();
	  for(int i = 0, a = 0; i < p.length(); i++)
	  {
	    char c = p.charAt(i);
	    if (c == '*' && i == 0) return false;  // invalid condition
	    if (c == '*' && pSt.size() > 0 && pSt.get(a-1).contains("\\*")) return false;  // another invalid condition
	    String top = String.valueOf(c);
	    if (c == '*') {
	      top = pSt.get(--a) + c;
	      pSt.remove(a);
	    }
	    pSt.add(a++, top);
	  }
	  if (pSt.size() == 0) return false;
	  
	  
	  char check = '\0';
	  int a = 0;
	  boolean multi = false;
	  	  
	  String ptop = pSt.get(a++);
    check = ptop.charAt(0);
    multi = false;    
    if (ptop.length() > 1 && ptop.charAt(1) == '*') multi = true;
	  
	  for(int i = 0; i < s.length(); i++) {
	    boolean isMatch = check == '.' || check == s.charAt(i);
	    if (multi && isMatch) break;      
	    
	    if (!multi || check != s.charAt(i)) {
	      if (a >= pSt.size()) return false;
	      
	      ptop = pSt.get(a++);
	      check = ptop.charAt(0);
	      multi = false;    
	      if (ptop.length() > 1 && ptop.charAt(1) == '*') multi = true;
	    }	    
	  }
	    
	  if (multi && check == '.') {
	    // need to check to see if we have some ending cases to check...
	    
	  }
	  
	  return true;
	}
	

}


 
