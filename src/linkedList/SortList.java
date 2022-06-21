package linkedList;

public class SortList {
  public ListNode2 sortList(ListNode2 head) {
    if (head == null || head.next == null)
      return head;
    ListNode2 mid = getMid(head);
    ListNode2 left = sortList(head);
    ListNode2 right = sortList(mid);
    return merge(left, right);
  }

  ListNode2 merge(ListNode2 list1, ListNode2 list2) {
    ListNode2 dummyHead = new ListNode2();
    ListNode2 tail = dummyHead;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
        tail = tail.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
        tail = tail.next;
      }
    }
    tail.next = (list1 != null) ? list1 : list2;
    return dummyHead.next;
  }

  ListNode2 getMid(ListNode2 head) {
    ListNode2 midPrev = null;
    while (head != null && head.next != null) {
      midPrev = (midPrev == null) ? head : midPrev.next;
      head = head.next.next;
    }
    ListNode2 mid = midPrev.next;
    midPrev.next = null;
    return mid;
  }
}
