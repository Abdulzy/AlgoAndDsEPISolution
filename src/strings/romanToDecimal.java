package strings;

import scoring.scoring;

import java.util.HashMap;

public class romanToDecimal {
  public int solution(String s) {
    int result = 0;
    HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
    roman.put('M',1000);
    roman.put('D',500);
    roman.put('C',100);
    roman.put('L',50);
    roman.put('X',10);
    roman.put('V',5);
    roman.put('I',1);
    for (int i = 0; i < s.length(); ++i) {
      if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
        result = result + roman.get(s.charAt(i+1)) - roman.get(s.charAt(i));
        i++;
      }
      else{
        result = result + roman.get(s.charAt(i));
      }
    }
    return result;
  }


  public static void main(String[] args) {
    String index = "IC";
    var s = new romanToDecimal();
    System.out.println((s.solution(index)));
    System.out.println(scoring.scoreSolution(3,5,3,5));
  }
}
