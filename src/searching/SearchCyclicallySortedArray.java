package searching;

import scoring.scoring;

import java.util.List;

public class SearchCyclicallySortedArray {
  public static int searchSorted(int[] nums) {
    int s=0;
    int e= nums.length - 1;
    int min = Integer.MAX_VALUE;
    int result = -1;
    while(s < e){
      if(nums[s] > nums[e]){
        s = s +((e-s)/2)+1;
        if(nums[e] < min){
          min = nums[e];
          result = e;
        }

        while(min <= nums[e]){
          if(nums[e-1] < min){
            min = nums[e-1];
            result = e - 1;
          }
          else{
            break;
          }
        }
      }
      else if(nums[s] < nums[e]){
        e = s +((e-s)/2);
        if(nums[s] < min){
          min = nums[s];
          result = s;
        }
        if(s == 0){
          return s;
        }
        else{
          while(min <= nums[s]){
            if(nums[s-1] < min){
              min = nums[s-1];
              result = s - 1;
            }
            else{
              break;
            }
          }
        }
      }
    }
    return result;
  }

  public static int searchSmallest(List<Integer> A) {
    int left = 0, right = A.size() - 1;
    while (left < right) {
      int mid = left + ((right - left) / 2);
      if (A.get(mid) > A.get(right)) {
// Minimum must be in A.subList(mid + 1, right + 1).
        left = mid + 1;
      } else { // A.get(mid) < A .get (right).
// Minimum cannot be in A .subList(mid + 1, right + 1) so it must be in
// A .sublist(left , mid + 1).
        right = mid;
      }
    }
// Loop ends when left == right .
        return left;
  }

  public static void main(String[] args) {
    int[] A = {6,8,11,14,17,0,1,3,4};
    int index = 2;
    System.out.println((searchSorted( A)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
