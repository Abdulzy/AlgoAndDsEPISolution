package dynamicProgramming;

public class CombinationSumIV {
  // Had the right approach but couldn't finish appropraitely
  // Went with recursion, couln't think of a way to use a 2D array or 3d array
  public int combinationSum4(int[] nums, int target) {
    Integer[] memo = new Integer[target + 1];
    return recurse(nums, target, memo);
  }

  public int recurse(int[] nums, int remain, Integer[] memo){

    if(remain < 0) return 0;
    if(memo[remain] != null) return memo[remain];
    if(remain == 0) return 1;

    int ans = 0;
    for(int i = 0; i < nums.length; i++){
      ans += recurse(nums, remain - nums[i], memo);
    }

    memo[remain] = ans;
    return memo[remain];
  }
}
