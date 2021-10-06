package linkedList;

import scoring.scoring;

public class listPivoting {
  public static java.util.LinkedList<Integer> solution(java.util.LinkedList<Integer> list1) {
    //go through the list and add values to list depending on whether it was higher, lower and equal.

    return list1;
  }

  public static void main(String[] args) {
    var s = new java.util.LinkedList<Integer>();
    s.add(2);
    s.add(6);
    s.add(5);
    s.add(7);

    System.out.println(solution(s));
    System.out.println(scoring.scoreSolution(3,3,3,4));

  }
}
