package Queue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class queueWithMaxIntro {
  private Deque<Integer> data = new LinkedList<>();
  public void enqueue(Integer x) { data.add(x); }
  public Integer dequeueQ() { return data.removeFirst(); }
  public Integer max() {
    if(!data.isEmpty()){
      return Collections.max(data);
    }
    throw new IllegalStateException("Cannot perform max() on empty queue.");
  }
}
