package arrays;

public class ProductArrayExceptSelf {
  //Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
  // of nums except nums[i].
  //The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
  //You must write an algorithm that runs in O(n) time and without using the division operation.

  //idea is to go through the array multiplying all values, keep a count for the amount of zeros, if a zero is seen dont
  // multiply with the rest and save that value with a different object.

  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int totalZero = 0;
    int fullProduct = 1;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == 0){
        totalZero++;
      }
      else{
        fullProduct = nums[i] * fullProduct;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] != 0){
        if(totalZero == 0 ){
          result[i] = fullProduct / nums[i];
        }
        else{
          result[i] = 0;
        }
      }
      else {
        if (totalZero > 1){
          result[i] = 0;
        }
        else{
          result[i] = fullProduct;
        }
      }
    }

    return result;
  }
}
