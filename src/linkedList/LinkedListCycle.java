package linkedList;

public class LinkedListCycle {
  public boolean hasCycle(ListNode2 head) {
    if (head == null) {
      return false;
    }

    ListNode2 slow = head;
    ListNode2 fast = head.next;
    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}
