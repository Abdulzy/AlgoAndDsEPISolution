package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicates {
  //Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer
  // appears once or twice, return an array of all the integers that appears twice.
  //
  //You must write an algorithm that runs in O(n) time and uses only constant extra space.

  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    Set<Integer> seen = new HashSet<>();

    for (int num : nums) {
      if (seen.contains(num)) {
        ans.add(num);
      } else {
        seen.add(num);
      }
    }

    return ans;
  }
}
