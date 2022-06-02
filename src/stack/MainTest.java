package stack;

import scoring.scoring;

import java.util.Arrays;
import java.util.List;

public class MainTest {
  public static void main(String[] args) {
    // causing an error
    implementingStackWithIncrement s = new implementingStackWithIncrement();
    System.out.println(s.empty());
    s.push(1);
    System.out.println(s.empty());
    System.out.println(s.peek());
    System.out.println(s.sum());
    s.push(2);
    System.out.println(s.peek());
    System.out.println(s.sum());
    s.increment(2,3);
    System.out.println(s.peek());
    System.out.println(s.sum());



    System.out.println(scoring.scoreSolution(5,5,5,5));

  }
}
