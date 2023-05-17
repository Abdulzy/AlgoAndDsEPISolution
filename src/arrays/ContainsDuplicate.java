package arrays;

import java.util.HashSet;

public class ContainsDuplicate {
  // Given an integer array nums, return true if any value appears at least twice in the array, and
  // return false if every element is distinct.

  // Using hashset to store numbers and check if it already exists.
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> numbers = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if(numbers.contains(nums[i])){
        return true;
      }
      else{
        numbers.add(nums[i]);
      }
    }
    return false;
  }
}
