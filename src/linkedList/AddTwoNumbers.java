package linkedList;

public class AddTwoNumbers {
  // You can reverse the lists and add its values then make return the reverse.

  public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
    ListNode2 dummyHead = new ListNode2(0);
    ListNode2 p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode2(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
      curr.next = new ListNode2(carry);
    }
    return dummyHead.next;
  }
}
