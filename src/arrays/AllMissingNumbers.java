package arrays;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
  //Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the
  // range [1, n] that do not appear in nums.

  //Similar to the Missing number question, all i have to do is just add teh values that don't exist into the array.

  public List<Integer> AllMissingNumbers(int[] nums) {
    boolean[] result = new boolean[nums.length+1];
    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      result[nums[i]] = true;
    }
    for (int i = 1; i < result.length; i++) {
      if(!result[i]){
        answer.add(i);
      }
    }
    return answer;
  }
}
