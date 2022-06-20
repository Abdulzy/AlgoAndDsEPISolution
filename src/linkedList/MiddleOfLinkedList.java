package linkedList;

public class MiddleOfLinkedList {
  public ListNode2 middleNode(ListNode2 head) {
    ListNode2 slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
