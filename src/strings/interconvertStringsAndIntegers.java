package strings;

import scoring.scoring;

public class interconvertStringsAndIntegers {
  public String solutionInt(int index) {
    StringBuilder result = new StringBuilder();
    boolean negate = false;
    if(index < 0){
      negate = true;
      index = index * -1;
    }
    while(index > 0){
      result.append(index % 10);
      index = index / 10;
    }
    if(negate){
      result.append("-");
    }
    result.reverse();
    return result.toString();
  }

  public int solutionStr(String s) {
    int result = 0;
    for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); ++i) {
      final int digit = s.charAt(i) - '0';
      result = result * 10 + digit;
    }
      return s.charAt(0) == '-' ? - result : result;
//    return Integer.parseInt(index);
  }


  public static void main(String[] args) {
    int index = -123;
    String index2 = "-123";
    var s = new interconvertStringsAndIntegers();
    String result = s.solutionInt(index);
    System.out.println((s.solutionInt(index)));
    int result2 = s.solutionStr(index2);
    System.out.println((s.solutionStr(index2)));
    System.out.println(scoring.scoreSolution(5,5,4,5));
  }
}
