package linkedList;

import scoring.scoring;

import java.util.LinkedList;

public class testForCyclicity {
  public static LinkedList<Integer> solution(LinkedList<Integer> list, int start, int stop) {

    var ans = new LinkedList<Integer>();
    // loop through till values repeat, if  does repeat return head, if it never does return null
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
