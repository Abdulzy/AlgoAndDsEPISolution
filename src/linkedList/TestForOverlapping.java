package linkedList;

import scoring.scoring;

import java.util.LinkedList;

public class TestForOverlapping {
  public static boolean solution(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    int j = 0;
    int i = 0;
    while (i < list2.size()){
      if (list2.get(i).equals(list1.get(j))) {
        j++;
      }
      else{
        j = 0;
      }
      i++;
    }
    return j!=0;
  }

  public static void main(String[] args) {
    var s = new LinkedList<Integer>();
    var p = new LinkedList<Integer>();
    s.add(2);
    s.add(6);
    s.add(5);
    s.add(7);
    p.add(5);
    p.add(7);
    p.add(2);
    p.add(6);
    p.add(5);
    p.add(7);

    System.out.println(solution(s,p));
    System.out.println(scoring.scoreSolution(3,3,3,4));

  }
}
