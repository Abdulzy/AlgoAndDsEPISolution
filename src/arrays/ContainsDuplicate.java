package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean Solution(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
      if (set.contains(x)) return true;
      set.add(x);
    }
    return false;
  }

}
