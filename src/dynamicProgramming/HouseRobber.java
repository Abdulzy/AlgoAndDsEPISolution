package dynamicProgramming;

import scoring.scoring;

public class HouseRobber {
  //initial attempt was wrong but good
  public int rob1(int[] nums) {
    int odd = 0;
    int even = 0;
    for(int i = 0; i < nums.length ; i++){
      if(i%2 == 0){
        even += nums[i];
      }
      else{
        odd += nums[i];
      }
    }

    return Math.max(odd,even);
  }
  public static int rob(int[] nums) {
    int prev1 = 0;
    int prev2 = 0;

    for (final int num : nums) {
      final int dp = Math.max(prev1, prev2 + num);
      prev2 = prev1;
      prev1 = dp;
    }

    return prev1;
  }

  public static void main(String[] args) {
    System.out.println(rob(new int[]{1,2,3,5,1}));
  }
}
