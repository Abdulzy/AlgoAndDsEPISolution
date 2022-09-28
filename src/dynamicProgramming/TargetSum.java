package dynamicProgramming;

import arrays.DutchNationalFlag;
import scoring.scoring;

import java.util.Arrays;

public class TargetSum {
  public int findTargetSumWays(int[] nums, int S) {
    int total = Arrays.stream(nums).sum();
    int[][] dp = new int[nums.length][2 * total + 1];
    dp[0][nums[0] + total] = 1;
    dp[0][-nums[0] + total] += 1;

    for (int i = 1; i < nums.length; i++) {
      for (int sum = -total; sum <= total; sum++) {
        if (dp[i - 1][sum + total] > 0) {
          dp[i][sum + nums[i] + total] += dp[i - 1][sum + total];
          dp[i][sum - nums[i] + total] += dp[i - 1][sum + total];
        }
      }
    }

    return Math.abs(S) > total ? 0 : dp[nums.length - 1][S + total];
  }
  int total;

  public int findTargetSumWays2(int[] nums, int S) {
    total = Arrays.stream(nums).sum();

    int[][] memo = new int[nums.length][2 * total + 1];
    for (int[] row : memo) {
      Arrays.fill(row, Integer.MIN_VALUE);
    }
    return calculate(nums, 0, 0, S, memo);
  }

  public int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
    if (i == nums.length) {
      if (sum == S) {
        return 1;
      } else {
        return 0;
      }
    } else {
      if (memo[i][sum + total] != Integer.MIN_VALUE) {
        return memo[i][sum + total];
      }
      int add = calculate(nums, i + 1, sum + nums[i], S, memo);
      int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
      memo[i][sum + total] = add + subtract;
      return memo[i][sum + total];
    }
  }

  public static void main(String[] args) {
    int[] A = {1,1,1,1,1};
    int index = 3;
    var s = new TargetSum();
    System.out.println(s.findTargetSumWays(A, index));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
