package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  //Given an array of integers nums and an integer target,
  // return indices of the two numbers such that they add up to target.
  //
  //You may assume that each input would have exactly one solution, and you may not use the same element twice.
  //
  //You can return the answer in any order.


  //Go through the array and add the values as a key and the index as the value.
  // go through the array again and find the value difference

  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> numbers = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      numbers.put(nums[i],i );
    }
    for (int i = 0; i < nums.length; i++) {
      if(numbers.containsKey(target-nums[i]) && i != numbers.get(target-nums[i])){
        return new int[]{i,numbers.get(target-nums[i])};
      }
    }

    return new int[] {-1,-1};
  }

}
