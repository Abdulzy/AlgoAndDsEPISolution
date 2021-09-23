package strings;

import scoring.scoring;

import java.util.HashMap;

public class sinusoidally {
  public String solution(String s) {
    String result = "";
    StringBuilder top = new StringBuilder();
    StringBuilder center = new StringBuilder();
    StringBuilder bottom = new StringBuilder();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if(count > 3){
        count = 0;
      }
      switch (count){
        case 1:
          top.append(s.charAt(i));
          break;
        case 3:
          bottom.append(s.charAt(i));
          break;
        default:
          center.append(s.charAt(i));
          break;
      }
      count++;
    }
    result = top.toString() + center.toString() + bottom.toString();
    return result;
  }


  public static void main(String[] args) {
    String index = "Hello_World!";
    var s = new sinusoidally();
    System.out.println((s.solution(index)));
    System.out.println(scoring.scoreSolution(5,5,4,5));
  }
}
