package dynamicProgramming;

public class MaximumProductArray {
  public static int maxProduct(int[] nums) {
    int ans = nums[0];
    int dpMin = nums[0];
    int dpMax = nums[0];

    for (int i = 1; i < nums.length; ++i) {
      final int num = nums[i];
      final int prevMin = dpMin;
      final int prevMax = dpMax;
      if (num < 0) {
        dpMin = Math.min(prevMax * num, num);
        dpMax = Math.max(prevMin * num, num);
      } else {
        dpMin = Math.min(prevMin * num, num);
        dpMax = Math.max(prevMax * num, num);
      }
      ans = Math.max(ans, dpMax);
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(maxProduct(new int[]{1,2,-3,5,1}));
  }


}
