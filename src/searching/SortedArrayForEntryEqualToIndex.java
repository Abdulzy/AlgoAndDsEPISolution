package searching;

import scoring.scoring;

public class SortedArrayForEntryEqualToIndex {
  public static int searchSorted(int[] nums) {
    int s=0;
    int e= nums.length - 1;
    while(s <= e){
      int m = s +((e-s)/2);
      int diff = nums[m] - m;
      if(diff == 0 ){
        return m;
      }
      else if(diff > 0){
        s = m+1;
      }
      else{
        e = m -1;
      }

    }
    return 0;
  }

  public static void main(String[] args) {
    int[] A = {0,1,1,3,5,7,9,2,3};
    int index = 2;
    System.out.println((searchSorted( A)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
