package stack;

import scoring.scoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class implementingStackWithIncrement {

  private List<Integer> stk = new ArrayList<>();
  private int sz;
  private int sum;
  public implementingStackWithIncrement() {
    sz = 0;
    sum = 0;
  }

  public void push(int x) {
      stk.add(x);
      sz++;
      sum = sum + x;
  }

  public int pop() {
    if(this.empty()){
      return -1;
    }
    int finish = stk.remove(stk.size() - 1);
    sum = sum - finish;
    return finish;
  }

  public void increment(int k, int val) {
    if(this.empty() || k > stk.size()){
      return ;
    }
    int index = stk.size() - k ;
    sum = sum + val;
    stk.set(index, stk.get(index) + val);
  }

  public boolean empty() {
    return stk.isEmpty();
  }

  public int peek() {
    return empty() ? -1 : stk.get(stk.size() - 1);
  }

  public int sum() {
    return empty() ? -1 : sum;
  }


}

