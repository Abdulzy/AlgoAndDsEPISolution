package arrays;

public class FirstMissingPositive {
  //Given an unsorted integer array nums, return the smallest missing positive integer.
  //
  //You must implement an algorithm that runs in O(n) time and uses constant extra space.

  // seems rather straight forward but i might be wrong.
  // 1. For O(nLogn) sort then return the missing number which is easy and constant space.
  // 2. iterate through the array add values to hashset while keeping a tab on the highest number,
  // iterate from 1 till the highest number to find the lowest missing number.should be O(n)/O(n^2) and also more space
}
