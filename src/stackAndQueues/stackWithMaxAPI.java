package stackAndQueues;

import java.util.Deque;
import java.util.LinkedList;

public class stackWithMaxAPI {

  private static class MaxWithCount {
    public Integer max;
    public Integer count;

    public MaxWithCount(Integer max, Integer count) {
      this.max = max;
      this.count = count;
    }
  }

  public static class Stack {
    private final Deque<Integer> element = new LinkedList<>();
    private final Deque<MaxWithCount> cachedMaxWithCount = new LinkedList<>();

    public boolean empty() {
      return element.isEmpty();
    }

    public Integer max() {
      if (empty()) {
        throw new IllegalStateException("max(): empty stack");
      }
      assert cachedMaxWithCount.peekFirst() != null;
      return cachedMaxWithCount.peekFirst().max;
    }

    public Integer pop() {
      if (empty()) {
        throw new IllegalStateException("pop(): empty stack");
      }
      Integer popElement = element.removeFirst();
      assert cachedMaxWithCount.peekFirst() != null;
      if (popElement.equals(cachedMaxWithCount.peekFirst().max)) {
        cachedMaxWithCount.peekFirst().count
          = cachedMaxWithCount.peekFirst().count - 1;
        if (cachedMaxWithCount.peekFirst().count.equals(0)) {
          cachedMaxWithCount.removeFirst();
        }
      }
      return popElement;
    }

    public void push(Integer x) {
      element.addFirst(x);
      if (!cachedMaxWithCount.isEmpty()) {
        if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) == 0) {
          cachedMaxWithCount.peekFirst().count
            = cachedMaxWithCount.peekFirst().count + 1;
        } else if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) > 0) {
          cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
        }
      } else {
        cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
      }
    }
  }
}
