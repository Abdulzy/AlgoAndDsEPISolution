package stack;

import scoring.scoring;

import java.util.Deque;
import java.util.LinkedList;

public class testingForWellFormedness {
  public static boolean solution(String RPNExpression) {
    Deque<String> intermediateResults = new LinkedList<>();
    String delimiter = ",";
    String[] symbols = RPNExpression.split(delimiter);
    for (String token : symbols) {
      if (token.length() == 1 && ")}]".contains(token)){
        final String y = intermediateResults.removeFirst();
        switch (token.charAt(0)){
          case ')':
            if(!y.equals("(")){
              intermediateResults.addFirst("(");
              intermediateResults.addFirst(token);
            }
            break ;
          case '}':
            if(!y.equals("{")){
              intermediateResults.addFirst("{");
              intermediateResults.addFirst(token);
            }
            break ;
          case ']':
            if(!y.equals("[")){
              intermediateResults.addFirst("[");
              intermediateResults.addFirst(token);
            }
            break ;
          default:
            throw new IllegalArgumentException("Malformed expression" + token);
        }
      } else { // token is a number.
        intermediateResults.addFirst(token);
      }
    }
    return intermediateResults.isEmpty();
  }


  public static void main(String[] args) {
    var s = "{,(,),[,],}{";

    System.out.println(solution(s));
    System.out.println(scoring.scoreSolution(5,5,5,5));

  }
}
