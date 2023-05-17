package dynamicProgramming;

public class RangeSumQuery {
  int[] Arr;

  public RangeSumQuery(int[] nums) {
    Arr = nums;
  }

  public int sumRange(int left, int right) {
    int result = 0;
    for (int i = left; i <= right; i++) {
      result += Arr[i];
    }
    return result;
  }
//  Leetcode solution
//  class NumArray {
//    int[] n;
//    public NumArray(int[] nums) {
//      n=new int[nums.length];
//      n[0]=nums[0];
//      for(int i=1;i<nums.length;i++){
//        n[i]=nums[i]+n[i-1];
//      }
//    }
//
//    public int sumRange(int left, int right) {
//      if(left==0){
//        return n[right];
//      }
//      else{
//        return n[right]-n[left-1];
//      }
//    }
//  }

  public static void main(String[] args) {
    var s = new RangeSumQuery(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(s.sumRange(0,2));
    System.out.println(s.sumRange(2,5));
    System.out.println(s.sumRange(0,5));
  }
}
