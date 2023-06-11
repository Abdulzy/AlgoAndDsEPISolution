package TwoPointers;

public class MergeTwoSortedLists {
  //You are given the heads of two sorted linked lists list1 and list2.
  //
  //Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
  //
  //Return the head of the merged linked list.

  //make a new list, using a while loop that goes on till on of the list has to end, compare the currrent values of the
  // each list, add the lower value to the new list.

  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode();

    ListNode head = result;
    while(list1.next != null && list2.next != null){
      if(list1.val > list2.val){
        result.next = list2;
        result = result.next;
        list2 = list2.next;
      }
      else{
        result.next = list1;
        result = result.next;
        list1 = list1.next;
      }
    }
    while(list1.next != null){
      result.next = list1;
      result = result.next;
      list1 = list1.next;

    }
    while(list2.next != null){
      result.next = list1;
      result = result.next;
      list2 = list2.next;

    }

    return head.next;
  }
}
