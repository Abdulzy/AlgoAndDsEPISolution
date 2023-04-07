package dynamicProgramming;

import arrays.DutchNationalFlag;
import scoring.scoring;

import java.util.Arrays;

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

  public static void main(String[] args) {
    var s = new RangeSumQuery(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(s.sumRange(0,2));
    System.out.println(s.sumRange(2,5));
    System.out.println(s.sumRange(0,5));
  }
}
