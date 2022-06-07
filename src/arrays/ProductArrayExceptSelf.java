package arrays;

public class ProductArrayExceptSelf {

  //Too Long
  public int[] productExceptSelf(int[] nums) {
    int multiple = 1;
    int[] result = new int[nums.length];
    for(int i = 0; i<nums.length; i ++){
      result[i] = sol(nums,i);
    }
    return result;
  }
  public int sol(int[] arr, int val){
    int multiple = 1;
    for(int i = 0; i<arr.length; i ++){
      if(i != val){
        multiple =  multiple * arr[i] ;
      }
    }
    return multiple;
  }

  public int[] productExceptSelfRight(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
      res[i] = res[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
      res[i] *= right;
      right *= nums[i];
    }
    return res;
  }
}
