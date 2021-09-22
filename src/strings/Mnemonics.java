package strings;

import scoring.scoring;

public class Mnemonics {
  public String solution(String s) {
    String[] arrOfStrg = s.split(" ");
    s = "";
    for (int i = arrOfStrg.length-1; i >= 0 ; i--) {
      if(!arrOfStrg[i].trim().isEmpty()){
        s = s + arrOfStrg[i].trim() + " ";
      }
    }
    return s.trim();
  }


  public static void main(String[] args) {
    String index = "a b c";
    var s = new Mnemonics();
    String result = s.solution(index);
    System.out.println((s.solution(index)));
    System.out.println(scoring.scoreSolution(0,0,0,0));
  }
}
