package dynamicProgramming;

public class LongestPalindrome {
  // solve a coding assessment last week with this
  // although the solution was a longer O(N)
  // Approach for this would be to start from the middle and expand for as long as its a palindrome
  // This only works if the palindrome starts from the center but would fail if it doesn't
  static int maxLen = 0;
  static int lo = 0;
  public static String longestPalindrome(String s) {
    char[] input = s.toCharArray();
    if(s.length() < 2) {
      return s;
    }

    for(int i = 0; i<input.length; i++) {
      expandPalindrome(input, i, i);
      expandPalindrome(input, i, i+1);
    }
    return s.substring(lo, lo+maxLen);
  }

  public static void expandPalindrome(char[] s, int j, int k) {
    while(j >= 0 && k < s.length && s[j] == s[k]) {
      j--;
      k++;
    }
    if(maxLen < k - j - 1) {
      maxLen = k - j - 1;
      lo = j+1;
    }
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrome("ghjjjjhgyuhj"));
  }
}
