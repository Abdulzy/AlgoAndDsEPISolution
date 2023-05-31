package arrays;

public class FindDuplicateNumber {
  //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
  //There is only one repeated number in nums, return this repeated number.
  //You must solve the problem without modifying the array nums and uses only constant extra space.

  //First idea is get the sum of the range of the numbers, subtract all numbers in the array from the sum,
  // return the absolute value of the result

  public int findDuplicate(int[] nums) {
    int totalSum = 0;
    int rangeSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if(i > 0){
        rangeSum = rangeSum+i;
      }
      totalSum = totalSum + nums[i];
    }

    return Math.abs(totalSum - rangeSum);
  }
  // didn't understand the question, values could be repeated more than once
}
