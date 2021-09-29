package linkedList;

public class ListNode<T> {
  public T data;
  public ListNode<T> next;

  public ListNode(T i, ListNode<T> b) {
    data = i;
    next = b;
  }

  public static ListNode <Integer> search(ListNode <Integer> L, int key) {
    while (L != null && L.data != key) {
      L = L.next;
    }
    return L;
  }

  public static void insertAfter(ListNode<Integer> node,
                                 ListNode<Integer> newNode) {
    newNode.next = node.next;
    node.next = newNode;
  }

  public static void deleteList(ListNode <Integer> aNode) {
    aNode.next = aNode.next.next ;
  }

  }
