package linkedList;

public class RemoveElements {
  public ListNode2 removeElements(ListNode2 head, int val) {
    ListNode2 sentinel = new ListNode2(0);
    sentinel.next = head;

    ListNode2 prev = sentinel, curr = head;
    while (curr != null) {
      if (curr.val == val) prev.next = curr.next;
      else prev = curr;
      curr = curr.next;
    }
    return sentinel.next;
  }
}
