package dynamicProgramming;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
  public static int lengthOfLIS(int[] nums) {
    ArrayList<Integer> sub = new ArrayList<>();
    sub.add(nums[0]);

    for (int i = 1; i < nums.length; i++) {
      int num = nums[i];
      if (num > sub.get(sub.size() - 1)) {
        sub.add(num);
      } else {
        int j = binarySearch(sub, num);
        sub.set(j, num);
      }
    }

    return sub.size();
  }

  private static int binarySearch(ArrayList<Integer> sub, int num) {
    int left = 0;
    int right = sub.size() - 1;
    int mid = (left + right) / 2;

    while (left < right) {
      mid = (left + right) / 2;
      if (sub.get(mid) == num) {
        return mid;
      }

      if (sub.get(mid) < num) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  //My new approach would be to check if the next value is greater or less and increment the increase counter
  // solution is different from my initial thought, thought it had to be consecutive numbers but not the case
  public static int lengthOfLIS2(int[] nums) {
    int size = nums.length;
    int[] dp = new int[size];
    dp[0] = nums[0];
    int max = 1;

    int j = 0;
    for(int i = 1; i< size; i++) {
      if(nums[i] > dp[j]) {
        j = j+1;
        dp[j] = nums[i];
        max++;
      } else {
        int ref = j;
        while(ref>=0 && dp[ref] >= nums[i]) {
          ref--;
        }
        dp[ref+1] = nums[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLIS2(new int[]{2,3,7,1,2,3,3,4,5,6}));
  }
}
