package linkedList;

public class ReverseLinkedList {
  public ListNode2 reverseList(ListNode2 head) {
    ListNode2 prev = null;
    ListNode2 curr = head;
    while (curr != null) {
      ListNode2 nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }
}
