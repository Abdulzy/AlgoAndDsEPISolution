package TwoPointers;

public class SquaresSortedArray {
  //Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted
  // in non-decreasing order.

  //go through the array squaring each value with itself in the first iteration.
  // after that you can sort however you please
  // didnt realise it was sorted to begin with, you can compare the absolute value of the numbers and
  // insert into a new array

  public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0;
    int right = n - 1;

    for (int i = n - 1; i >= 0; i--) {
      int square;
      if (Math.abs(nums[left]) < Math.abs(nums[right])) {
        square = nums[right];
        right--;
      } else {
        square = nums[left];
        left++;
      }
      result[i] = square * square;
    }
    return result;
  }
}
