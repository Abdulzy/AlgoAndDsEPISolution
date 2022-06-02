package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDisappearedNumbers {
  public List<Integer> Solution(int[] nums) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
      set.add(x);
    }

    for(int i = 1; i<=nums.length; i++){
      if(!set.contains(i)){
        result.add(i);
      }
    }
    return result;
  }
}
