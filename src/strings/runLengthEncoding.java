package strings;

import scoring.scoring;

public class runLengthEncoding {
  public String encode(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
      int count = 1 ;
      while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
        ++i ;
        ++count ;
      }
      result.append(count);
      result.append(s.charAt(i));
    }
    return result.toString();
  }

  public String decode(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i = i+2) {
      int count = Integer.parseInt(String.valueOf(s.charAt(i)));
      while ( count > 0) {
        result.append(s.charAt(i+1));
        count--;
      }
    }
    return result.toString();
  }


  public static void main(String[] args) {
    String index = "aaaabcccaa";
    String index2 = "4a1b3c2a";
    var s = new runLengthEncoding();
    System.out.println((s.encode(index)));
    System.out.println((s.decode(index2)));
    System.out.println(scoring.scoreSolution(5,5,5,5));
  }
}
