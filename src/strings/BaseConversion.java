package strings;

import scoring.scoring;

public class BaseConversion {
  public String solution(String number, int before, int after) {
    StringBuilder result = new StringBuilder();
    int val = Integer.parseInt(number);
    int temp = 0;
    int count = 0;
    boolean negate = number.startsWith("-");
    if(negate){
      val = val * -1;
    }
    while(val > 0){
      temp = (int) (temp + ((val % 10) * Math.pow(before,count)));
      val = val / 10;
      count++;
    }
    while(temp > 0){
      result.append(temp % after);
      temp = temp / after;
    }
    if(negate){
      result.append("-");
    }
    result.reverse();
    return result.toString();
  }


  public static void main(String[] args) {
    String index = "-1111";
    var s = new BaseConversion();
    String result = s.solution(index, 2,8);
    System.out.println((s.solution(index, 2,8)));
    System.out.println(scoring.scoreSolution(1,5,3,3));
  }
}
