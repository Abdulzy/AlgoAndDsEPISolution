package arrays;

public class MinimumSizeSubArraySum {
  public int minSubArrayLen(int target, int[] nums) {
    int result = 0;
    int sol = nums.length + 2;
    int left = 0;
    while (left < nums.length) {
      int count = 1;
      int right = left;
      while(result < target && right < nums.length){
        result = result + nums[right];
        right++;
      }
      if(right > nums.length && left == 0 ){
        return 0;
      }
      if(result >= target){
        sol = Math.min(sol, right-left);
      }
      left++;
      result = 0;
    }
    if(sol > nums.length){
      return 0;
    }
    return sol;
  }
}
