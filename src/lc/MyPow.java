package lc;

public class MyPow {
  public double myPow(double x, int n)
  {
    if (n == 0) return 1;
    
    boolean isNeg = n < 0;
//    double rslt = pow(x, Math.abs(n));
    double rslt = 1.0f, r = x;
    int absN = Math.abs(n);
    while (absN != 0)
    {
      if (absN % 2 == 1) {
        rslt = rslt * r;
      }
      absN = absN / 2;
      r = r*r;
    }
    
    return isNeg ? 1/rslt : rslt;
  }

}



