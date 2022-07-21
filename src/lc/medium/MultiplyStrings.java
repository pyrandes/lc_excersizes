package lc.medium;

public class MultiplyStrings {
  public String multiply(String num1, String num2)
  {
    if (num1.equals("0") || num2.equals("0")) return "0";


    int n = num1.length(), m = num2.length();
    char[] rslt = new char[n+m];
    for(int i = 0; i < n+m; i++)
      rslt[i] = '0';
    
    for(int j = m-1; j >= 0; j--) {
      int n2 = num2.charAt(j) - '0';
      for (int i = n-1; i >= 0; i--) {
        int carry = rslt[i+j+1] - '0';
        int n1 = num1.charAt(i) - '0';
        int prod = n1 * n2 + carry;
        rslt[i+j+1] = (char)((prod % 10) + '0');
        
        int left = prod/10 + (rslt[i+j] - '0');
        rslt[i+j] = (char)(left + '0');
      }
    }

    StringBuilder sb = new StringBuilder();
    boolean leadZero = true;
    for(char c: rslt) {
      if (c == '0' && leadZero) continue;
      leadZero= false;
      sb.append(c);
    }
      
    return sb.toString();
  }


}
