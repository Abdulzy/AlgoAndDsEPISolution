package linkedList;

public class OddEvenLinkedList {
  public ListNode2 oddEvenList(ListNode2 head) {
    if (head == null) return null;
    ListNode2 odd = head;
    ListNode2 even = head.next;
    ListNode2 evenHead = head.next;
    // `even != null` rules out the list of only 1 node
    // `even.next != null` rules out the list of only 2 nodes
    while (even != null && even.next != null) {
      // Put odd to the odd list
      odd.next = odd.next.next;

      // Put even to the even list
      even.next = even.next.next;

      // Move the pointer to the next odd/even
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
  }
}
