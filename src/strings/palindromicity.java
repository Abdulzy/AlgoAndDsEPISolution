package strings;

import scoring.scoring;

public class palindromicity {
  public boolean solution(String letter) {
    int left = 0;
    int right = letter.length()-1;
    while (left < right){
      while(!Character.isLetter(letter.charAt(left)) && left < right){
        ++left;
      }
      while(!Character.isLetter(letter.charAt(right)) && left < right){
        --right;
      }
      if(Character.toLowerCase(letter.charAt(left++))
        != Character.toLowerCase(letter.charAt(right--))){
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    String index = "ABA";
    var s = new palindromicity();
    boolean result = s.solution(index);
    System.out.println((s.solution(index)));
    System.out.println(scoring.scoreSolution(5,3,5,3));
  }
}
