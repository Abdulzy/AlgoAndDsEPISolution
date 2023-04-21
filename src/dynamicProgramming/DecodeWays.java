package dynamicProgramming;

public class DecodeWays {
  // initial thought is to use recursion, and recurse with the choice of 1 character or 2
  public int numDecodings(String s) {
    return s.length()==0?0:numDecod(0,s);
  }
  private int numDecod(int p, String s) {
    int n=s.length();
    if(p==n) return 1;
    if(s.charAt(p)=='0') return 0;
    int res=numDecod(p+1,s);
    if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7'))
      res+=numDecod(p+2,s);
    return res;
  }
  // Solving in DP, would be to move through the back and use the values at the index 1 index or 2 away depending on
  // teh scenario
}
