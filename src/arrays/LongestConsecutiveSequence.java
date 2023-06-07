package arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
  //You must write an algorithm that runs in O(n) time.

  // Solving without the O(n) time would be using Array.sort() then the longest sequence can be gotten.
  // solution should be O(nLogn)

  public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    int consecutive = 1;
    for (int i = 1 ; i < nums.length; i++) {
      if(nums[i] > nums[i-1]){
        consecutive++;
      }
      else{
        if (consecutive > result){
          result = consecutive;
        }
        consecutive = 1;
      }
    }
    return result;
  }
}
