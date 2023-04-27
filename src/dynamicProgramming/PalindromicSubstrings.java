package dynamicProgramming;

public class PalindromicSubstrings {
  //Finding all the palindrome in the string,for example in "abc" there are 3 palindromes which are a,b,c
  // for "aaa" there are 6 palindromes which are "a", "a", "a", "aa", "aa", "aaa"
  //My thought is to have a for loop that iterates through the string, adds the current char as a palindrome then check
  // the chars after to see if the substring is a palindrome. which would be brute force O(n^3)
  // Another way would be instead of checking if the substring is a palindrome you use two pointers to
  // iterate through to find the palindrome
  public static int countSubstrings(String s) {
    if(s.length() == 0) return 0;
    int odd = 0;
    int even = 0;
    for(int k = 0; k < s.length(); k++)
    {
      odd += checking(s, k, k);
      even += checking(s, k, k + 1);
    }
    return odd + even;
  }

  public static int checking(String s, int left, int right)
  {
    int count = 0;
    while(left <= right && left >= 0 && right < s.length() &&  s.charAt(left) == s.charAt(right))
    {
      count++;
      left--;
      right++;
    }
    return count;
  }
}
