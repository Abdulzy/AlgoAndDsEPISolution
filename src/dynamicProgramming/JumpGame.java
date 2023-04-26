package dynamicProgramming;

public class JumpGame {
  //Starting from the index 0, find out if you can reach the end by using the values of each index to jump
  // Using DP make an array of the same length as the array passed in, initiate the array with a max/high value
  // which would help with decided what the new value would be.
  // using the value at a index to calculate which other index you can reach. My solution can also account for which
  // path was taken
  public static boolean canJump(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = Integer.MAX_VALUE;
    }
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 1; j <= nums[i]; j++) {
        if(i < result[i+j]){
          result[i+j] = i;
        }
      }
    }
    if(result[result.length-1] >= result.length){
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(canJump(new int[]{2,3,1,1,4}));
  }

}
