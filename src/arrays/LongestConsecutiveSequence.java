package arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
  //You must write an algorithm that runs in O(n) time.

  // Solving without the O(n) time would be using Array.sort() then the longest sequence can be gotten.
  // solution should be O(nLogn)

  public int longestConsecutive(int[] nums) {
    if(nums.length < 2){
      return nums.length;
    }
    Arrays.sort(nums);
    int result = 0;
    int consecutive = 1;
    for (int i = 1 ; i < nums.length; i++) {
      if(nums[i] == nums[i-1] + 1 ){
        consecutive++;
      }
      else if(nums[i] == nums[i-1]){

      }
      else{
        consecutive = 1;
      }
      if (consecutive > result){
        result = consecutive;
      }
    }
    return result;
  }
}
