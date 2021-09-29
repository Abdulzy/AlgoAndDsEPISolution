package linkedList;

import java.util.LinkedList;
import scoring.scoring;

public class mergeTwoSortedList {
  public static LinkedList<Integer> solution(LinkedList<Integer> list1, LinkedList<Integer> list2) {

    var ans = new LinkedList<Integer>();
    if(list1.size() < 1){
      ans.addAll(list2);
      return ans;
    }
    else if(list2.size() < 1){
      ans.addAll(list1);
      return ans;
    }
    int index1 = 0;
    int index2 = 0;
    while (ans.size() < list1.size() +  list2.size() ) {
      if(index1 < list1.size() && index2 < list2.size() ){
        if( list1.get(index1) < list2.get(index2)){
          ans.add(list1.get(index1));
          index1++;
        }
        else if(list1.get(index1) > list2.get(index2)){
          ans.add(list2.get(index2));
          index2++;
        }
      }
      else if(!(index2 < list2.size()) && index1 < list1.size() ){
        ans.add(list1.get(index1));
        index1++;
      }
      else if(!(index1 < list1.size()) && index2 < list2.size() ){
        ans.add(list2.get(index2));
        index2++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    var s = new LinkedList<Integer>();
    var p = new LinkedList<Integer>();
    s.add(2);
    s.add(6);
    p.add(5);
    p.add(7);

    System.out.println(solution(s,p));
    System.out.println(scoring.scoreSolution(3,3,3,4));

  }
}
