package linkedList;

import scoring.scoring;

import java.util.LinkedList;

public class testForCyclicity {
  public static LinkedList<Integer> solution(LinkedList<Integer> list, int start, int stop) {

    var ans = new LinkedList<Integer>();
    // loop through and add values to hash map and if value already exist return that value
    return ans;
  }
  private ListNode getIntersect(ListNode head) {
    ListNode tortoise = head;
    ListNode hare = head;

    // A fast pointer will either loop around a cycle and meet the slow
    // pointer or reach the `null` at the end of a non-cyclic list.
    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;
      if (tortoise == hare) {
        return tortoise;
      }
    }

    return null;
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }

    // If there is a cycle, the fast/slow pointers will intersect at some
    // node. Otherwise, there is no cycle, so we cannot find an entrance to
    // a cycle.
    ListNode intersect = getIntersect(head);
    if (intersect == null) {
      return null;
    }

    // To find the entrance to the cycle, we have two pointers traverse at
    // the same speed -- one from the front of the list, and the other from
    // the point of intersection.
    ListNode ptr1 = head;
    ListNode ptr2 = intersect;
    while (ptr1 != ptr2) {
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }

    return ptr1;
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
