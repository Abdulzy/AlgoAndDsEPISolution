package linkedList;
import scoring.scoring;

public class deleteNodeFromSinglyLinkedList {

  public static void solution(ListNode<Integer> nodeToDelete) {
    nodeToDelete.data = nodeToDelete.next.data ;
    nodeToDelete.next = nodeToDelete.next.next ;
  }

  public static void main(String[] args) {
    ListNode<Integer> s = new ListNode<Integer>(3,null);
    ListNode<Integer> j = new ListNode<Integer>(4,s);
    ListNode<Integer> k = new ListNode<Integer>(5,j);
    solution(k);
    System.out.println(scoring.scoreSolution(4,5,3,4));
  }
}
