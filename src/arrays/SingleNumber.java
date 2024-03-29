package arrays;

import java.util.Arrays;

public class SingleNumber {
  //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
  //
  //You must implement a solution with a linear runtime complexity and use only constant extra space.

  // sort the array, check if the next value is equal to the current one
  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length - 1; i = i +2) {
      if(nums[i] != nums[i-1]){
        if(nums[i] != nums[i+1]){
          return nums[i];
        }
        else return nums[i-1];
      }
    }
    return nums[nums.length - 1];
  }
}
