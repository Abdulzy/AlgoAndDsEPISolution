package dynamicProgramming;

public class DecodeWays {
  // initial thought is to use recursion, and recurse with the choice of 1 character or 2
  public static int numDecodings(String s) {
    return s.length()==0?0:numDecod(0,s);
  }
  private static  int numDecod(int p, String s) {
    int n=s.length();
    if(p==n) return 1;
    if(s.charAt(p)=='0') return 0;
    int res=numDecod(p+1,s);
    if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7'))
      res+=numDecod(p+2,s);
    return res;
  }
  // Solving in DP, would be to move through the back and use the values at the index 1 index or 2 away depending on
  // the scenario

  public static int numDecodings2(String s) {
    int n=s.length();
    int[] dp=new int[n+1];
    dp[n]=1;
    for(int i=n-1;i>=0;i--)
      if(s.charAt(i)!='0') {
        dp[i]=dp[i+1];
        if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7'))
          dp[i]+=dp[i+2];
      }
    return dp[0];
  }

  public static void main(String[] args) {
    System.out.println(numDecodings("11045"));
  }
}
