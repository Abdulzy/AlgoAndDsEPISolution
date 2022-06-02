package arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
  public int Solution(int[] nums) {
    int result = -1;
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
      set.add(x);
    }
    for(int i = 0; i<=nums.length; i++){
      if(!set.contains(i)){
        return i;
      }
    }
    return -1;
  }

  public static int Solution2(int[] nums) {
    int sum = nums.length;
    for (int i = 0; i < nums.length; i++)
      sum += i - nums[i];
    return sum;
  }
}
