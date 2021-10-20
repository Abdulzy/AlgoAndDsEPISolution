package Queue;

import java.util.NoSuchElementException;

public class circularQueue {
  private int head,tail;
  private int[] values;
  private static final int SCALE_FACTOR = 2 ;

  public circularQueue(int size) {
    values = new int[size];
    this.head = 0;
    this.tail = 0;
  }

  public void enqueue(int data){
    if(tail >= values.length){
      int[] temp = new int[2* values.length];
      System.arraycopy(values,0,temp,0,values.length);
      values = temp;
    }
    values[tail] = data;
    tail++;
  }

  public int dequeue(){
    if(head == tail){
      throw new NoSuchElementException("Queue is empty");
    }
    head++;
    return values[head-1];
  }

  public int size(){
    return tail - head;
  }

  public static void main(String[] args) {
    var q = new circularQueue(5);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);

    for (int i = 0; i < 6; i++) {
      System.out.println(q.dequeue());
      System.out.println("Size of array:" +q.size());
    }
  }
}
