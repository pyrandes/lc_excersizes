package lc;

public class StringtoInteger {
	public static void main(String args[]) {
	  String x = "0000-42a1234";
	  System.out.println(x + " -- " + aoti(x));
	  
	  x = "    -2147483648";
	  System.out.println(x + " -- " + aoti(x));
	  
    x = "+- 3232";
    System.out.println(x + " -- " + aoti(x));
	  
	  x = Long.toString(Integer.MAX_VALUE + 10);
	  System.out.println(x + " -- " + aoti(x));
	}
	
	public static int aoti(String s)
	{
	  boolean isNeg = false, readingDigits = false, signRead = false;
	  s = s.toLowerCase();
	  int len = s.length();
	  long x = 0;
	  
	  for(int i = 0; i < len; i++)
	  {
	    char c = s.charAt(i);
	    if ( c > 'a' && c < 'z' && readingDigits) {
	      
	      break;
	    }
	    
	    
	    if (c == ' ') continue;
	    if (!signRead && c == '-') { isNeg = true; signRead = true; continue; }
	    if (!signRead && c == '+') { signRead = true; continue; }
	    if (c < '0') {x = 0; break;}
	    if (c > '9') {x = 0; break;}
	    if (x == 0 && c == '0') continue; // ignore leading zeros
	    
	    readingDigits = true;
	    x = x * 10;
	    x += (byte)c - 48;
	  }
	  
	  x = isNeg ? -1*x : x;
	  if (x > Integer.MAX_VALUE) return Integer.MAX_VALUE;
	  if (x < Integer.MIN_VALUE) return Integer.MIN_VALUE;
	      
	  return (int)x;
	}
	

}


 
