package linkedList;

public class SwapNodesInPairs {
  public ListNode2 swapPairs(ListNode2 head) {

    // Dummy node acts as the prevNode for the head node
    // of the list and hence stores pointer to the head node.
    ListNode2 dummy = new ListNode2(-1);
    dummy.next = head;

    ListNode2 prevNode = dummy;

    while ((head != null) && (head.next != null)) {

      // Nodes to be swapped
      ListNode2 firstNode = head;
      ListNode2 secondNode = head.next;

      // Swapping
      prevNode.next = secondNode;
      firstNode.next = secondNode.next;
      secondNode.next = firstNode;

      // Reinitializing the head and prevNode for next swap
      prevNode = firstNode;
      head = firstNode.next; // jump
    }

    // Return the new head node.
    return dummy.next;
  }
}
