package lc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ZigZagConversion {
	public static void main(String args[]) {
	  String s = "ABCD";  
	  System.out.println(convert(s, 2));
	  
	  s = "AB";
	  System.out.println(convert(s, 2));
	  
	  s = "PAYPALISHIRING";
	  System.out.println(convert(s, 3));
    System.out.println(convert(s, 4));
    System.out.println(convert(s, 5));
	}
	
	public static String convert(String s, int numRows)
	{
	  /**
	   * PAYPALISHIRING, 4   (3)             (5)
	   *                     
	   * P     I     N       P   A   H   N   P       H
	   * A   L S   I G       A P L S I I H   A     S I
	   * Y A   H R           Y   I   R       Y   I   R
	   * P     I                             P L     I  G
	   *                                     A       N
	   *                                     
	   * PINALSIGYAHRPI      PAHNAPLSIIHYIR  PHASIYIRPLIGAN
	   * "4 rows"
	   * row_1 -> take the index with i*2r-2 letters
	   * 
	   * row_n -> start at i = n-1;           
	   */
	  
	  // nothing to do here, no zigging
	  if (numRows == 1) return s;
	    	  
	  StringBuilder ret = new StringBuilder();
	  int cycleLen = 2*numRows-2;
	  int slen = s.length();
	  for(int r = 0; r < numRows; r++) {
	    for(int i = 0; i+r < slen; i += cycleLen) {
	      ret.append(s.charAt(r + i));  // add the char at this cycle
	      if ( r != 0 && r != numRows - 1 && i + cycleLen - r < slen) {
	        ret.append(s.charAt(i + cycleLen - r)); // but also add chars on the zig path
	      }
	    }
	  }
	  
	  
	  return ret.toString();
	  
//	  boolean isZig = false;
//	  for(int i = 0, si = 0; i < s.length(); i++)
//	  {
//	    char c = s.charAt(i);
//	    if (si == numRows) {
//	      isZig = true;
//	      si-=2;
//	    } else if (si < 1) {
//	      isZig = false;
//	      si = 0;
//	    }
//	    
//	    if (numRows == 2 && isZig ) {
//	      isZig = false;
//	      si = 0;
//	    }
//	    
//	    if (isZig) {
//	      sb[si--].append(c);
//        continue;
//	    }
//	        
//	    sb[si++].append(c);
//	  }
//	  
//	  return Arrays.stream(sb).map(sbl -> sbl.toString().replaceAll(" ", "")).collect(Collectors.joining());
	}
	
	
}


 
