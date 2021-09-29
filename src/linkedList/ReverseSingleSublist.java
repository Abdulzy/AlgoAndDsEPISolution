package linkedList;

import scoring.scoring;

import java.util.LinkedList;

public class ReverseSingleSublist {
  public static LinkedList<Integer> solution(LinkedList<Integer> list, int start, int stop) {

    var ans = new LinkedList<Integer>();
    int index = 0;
    while(index < list.size()){
      if(index >= start && index <= stop ){
        ans.add(start,list.get(index));
      }
      else{
        ans.add(list.get(index));
      }
      index++;
    }
    return ans;
  }

  public static void main(String[] args) {
    var s = new LinkedList<Integer>();
    int x = 1;
    int y = 3;
    s.add(2);
    s.add(6);
    s.add(5);
    s.add(7);
    s.add(9);
    s.add(11);

    System.out.println(solution(s,x,y));
    System.out.println(scoring.scoreSolution(5,5,5,5));

  }
}
