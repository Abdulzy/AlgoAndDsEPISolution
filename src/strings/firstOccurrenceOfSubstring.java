package strings;

import scoring.scoring;

public class firstOccurrenceOfSubstring {
  public int solution(String s, String x) {
    int val = x.length();
    for (int i = 0; i < s.length() - val; i++) {
      String fin = s.substring (i,i+val).trim().toLowerCase();
      if(x.trim().toLowerCase().equals(fin)){
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    String index = "aaabcccaa";
    String index2 = "abc";
    var s = new firstOccurrenceOfSubstring();
    System.out.println((s.solution(index,index2)));
    System.out.println(scoring.scoreSolution(3,5,3,4));
  }
}
