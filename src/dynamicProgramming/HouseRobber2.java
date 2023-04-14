package dynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {

  public static int HouseRobber2(int[] nums) {
    if (nums.length == 1) return nums[0];
    return Math.max(solve(Arrays.copyOfRange(nums, 1, nums.length)), solve(Arrays.copyOfRange(nums, 0, nums.length - 1)));
  }
  public static int solve(int[] nums) {
    int dp1 = 0, dp2 = 0;
    for (int i: nums) {
      int temp = dp1;
      dp1 = dp2;
      dp2 = Math.max(temp + i, dp2);
    }
    return dp2;
  }

  public static void main(String[] args) {
    System.out.println(HouseRobber2(new int[]{1,2,3,5,1}));
  }

}
