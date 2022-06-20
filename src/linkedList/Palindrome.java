package linkedList;

public class Palindrome {
  public boolean isPalindrome(ListNode2 head) {

    if (head == null) return true;

    // Find the end of first half and reverse second half.
    ListNode2 firstHalfEnd = endOfFirstHalf(head);
    ListNode2 secondHalfStart = reverseList(firstHalfEnd.next);

    // Check whether or not there is a palindrome.
    ListNode2 p1 = head;
    ListNode2 p2 = secondHalfStart;
    boolean result = true;
    while (result && p2 != null) {
      if (p1.val != p2.val) result = false;
      p1 = p1.next;
      p2 = p2.next;
    }

    // Restore the list and return the result.
    firstHalfEnd.next = reverseList(secondHalfStart);
    return result;
  }

  // Taken from https://leetcode.com/problems/reverse-linked-list/solution/
  private ListNode2 reverseList(ListNode2 head) {
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

  private ListNode2 endOfFirstHalf(ListNode2 head) {
    ListNode2 fast = head;
    ListNode2 slow = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }
}
