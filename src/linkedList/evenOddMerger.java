package linkedList;

import scoring.scoring;

import java.util.Arrays;
import java.util.List;

public class evenOddMerger {
  public static ListNode<Integer> solution(ListNode<Integer> L) {
    if (L == null) {
      return L;
    }
    ListNode<Integer> evenDummyHead = new ListNode<>(0, null), oddDummyHead = new ListNode<>(0, null);
    List<ListNode<Integer>> tails = Arrays.asList(evenDummyHead, oddDummyHead);
    int turn = 0;
    for (ListNode<Integer> iter = L; iter != null; iter = iter.next) {
      tails.get(turn).next = iter;
      tails.set(turn, tails.get(turn).next);
      turn ^= 1;
    }
    tails.get(1).next = null;
    tails.get(0).next = oddDummyHead.next;
    return evenDummyHead.next;
  }

  public static void main(String[] args) {
    ListNode<Integer> s = new ListNode<Integer>(3,null);
    ListNode<Integer> j = new ListNode<Integer>(4,s);
    ListNode<Integer> k = new ListNode<Integer>(5,j);
    System.out.println(solution(k));
    System.out.println(scoring.scoreSolution(4,5,3,4));
  }
}
