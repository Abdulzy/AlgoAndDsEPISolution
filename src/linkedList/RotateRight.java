package linkedList;

public class RotateRight {
  public ListNode2 rotateRight(ListNode2 head, int k) {
    // base cases
    if (head == null) return null;
    if (head.next == null) return head;

    // close the linked list into the ring
    ListNode2 old_tail = head;
    int n;
    for(n = 1; old_tail.next != null; n++)
      old_tail = old_tail.next;
    old_tail.next = head;

    // find new tail : (n - k % n - 1)th node
    // and new head : (n - k % n)th node
    ListNode2 new_tail = head;
    for (int i = 0; i < n - k % n - 1; i++)
      new_tail = new_tail.next;
    ListNode2 new_head = new_tail.next;

    // break the ring
    new_tail.next = null;

    return new_head;
  }
}
