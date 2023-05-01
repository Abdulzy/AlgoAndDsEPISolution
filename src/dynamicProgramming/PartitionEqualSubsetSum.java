package dynamicProgramming;

public class PartitionEqualSubsetSum {
  //segment the array into 2 separate arrays that are equal in value
  // get the total of the whole array, divide the value in 2 then iterate through a 1d array checking all the possible
  // changes of subtracting each individual value to get the sum
  public static boolean canPartition(int[] nums) {
    int sum = 0;
    int n = nums.length;

    for(int i : nums) sum+=i;

    if(sum%2!=0) return false;

    sum /= 2;

    boolean[] dp = new boolean[sum+1];

    dp[0] = true;

    for (int j : nums) {
      for (int i = sum; i > 0; i--) {
        if (i >= j) {
          dp[i] = dp[i] || dp[i-j];
        }
      }
    }

    return dp[sum];


  }

  public static void main(String[] args) {
    System.out.println(canPartition(new int[]{1,3,5,4,7}));
  }

}
