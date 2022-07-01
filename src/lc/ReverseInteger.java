package lc;

public class ReverseInteger {
	public static void main(String args[]) {
	  int x = -2147483648;
	  System.out.println(reverse(x));
    
	}
	
	public static int reverse(long x)
	{
	  // theres a better way!
	  long rev = 0, maxInt = Integer.MAX_VALUE, rem = Math.abs(x);
	  boolean isNeg = x < 0;
	  
	  int len = Long.toString(rem).length();
	  
	  for (int i = 0; i <= len; i++) {
	    long r = rem % (long)Math.pow(10, i+1) / (long)Math.pow(10, i);
	    rev += r * (int)Math.pow(10, len-i-1);
	    
	    if (isNeg) {
	      if (-1*rev < -1*maxInt) return 0;
	    } else {
	      if (rev > maxInt-1) return 0;
	    }
	    
	    rem -= r;
	  }
	  
	  
	  return (int)(isNeg ? -1*rev : rev);
	}
	
	
}


 
