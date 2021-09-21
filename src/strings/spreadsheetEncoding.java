package strings;

import scoring.scoring;

public class spreadsheetEncoding {
  public int solution(String letter) {
    int result;
    result = (letter.length() - 1) * 26;
    return result;
  }


  public static void main(String[] args) {
    String index = "AB";
    var s = new spreadsheetEncoding();
    int result = s.solution(index);
    System.out.println((s.solution(index)));
    System.out.println(scoring.scoreSolution(1,5,3,3));
  }
}
