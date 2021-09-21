package strings;

import scoring.scoring;

public class replaceAndRemove {
  public int solution(int size, char[] letter) {
    int writeldx = 0, aCount = 0;
    for (int i = 0; i < size; i++) {
      if(letter[i] != 'b'){
        letter[writeldx++] = letter[i];
      }
      if(letter[i] == 'a'){
        aCount++;
      }
    }
    int curldx = writeldx - 1;
    writeldx = writeldx + aCount - 1;
    final int finalSize = writeldx + 1;
    while (curldx >= 0) {
      if (letter[curldx] == 'a') {
        letter[writeldx --] = 'd' ;
        letter[writeldx --] = 'd' ;
      } else {
        letter[writeldx --] = letter[curldx];
      }
      --curldx ;
    }
    return finalSize;
  }


  public static void main(String[] args) {
    char[] index = {'a','c','d','b','b','c','a'};
    var s = new replaceAndRemove();
    System.out.println((s.solution(index.length,index)));
    System.out.println(scoring.scoreSolution(1,5,3,3));
  }
}
