package arrays;

public class MissingNumber {
  // Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
  // that is missing from the array.

  // I'm having multiple thoughts for this:
  // 1
  // make a new array(result) of the same length + 1, put true in result[i] when you see i, return the i that doesn't
  // have true

  // 2
  // get the total of all numbers from 0...n, subtract the values in the provided array from nums then return the final
  // number. saves space compared to teh first solution but same time.
}
