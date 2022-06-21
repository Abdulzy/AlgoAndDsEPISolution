package linkedList;

import scoring.scoring;

public class removeTheNthLastElement {
  // Go through the list get the length, then go through the list again till you get to the Nth from the last element


  //2
  public ListNode2 removeNthFromEnd(ListNode2 head, int n) {
    ListNode2 dummy = new ListNode2(0);
    dummy.next = head;
    ListNode2 first = dummy;
    ListNode2 second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
      first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
      first = first.next;
      second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
  }
}
