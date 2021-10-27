package searching;

import arrays.DutchNationalFlag;
import scoring.scoring;

import java.util.Arrays;

public class SortedArrayForFirstOccurrence {
  public static int searchSorted(int[] nums, int target) {
    int s=0;
    int e= nums.length - 1;
    while(s <= e){
      int m = s +((e-s)/2);
      if(nums[m] < target){
        s = m+1;
      }
      else if(nums[m] == target){
        while(nums[m] == target){
          if(nums[m-1] == target){
            m-=1;
          }
          else{
            return m;
          }
        }
      }
      else{
        e = m -1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] A = {0,1,1,1,2,2,2,0,0};
    int index = 2;
    System.out.println((searchSorted( A,2)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
