package searching;

import scoring.scoring;

public class ComputeTheRealSquareRoot {
  public static float searchSorted(float k) {
    float left = 0, right =  k;
// Candidate interval [left, right] where everything before left has
// square <= k, and everything after right has square > k.
    if(k == 1){
      return 1;
    }
    if (k < 1.0) {
      left = k;
      right = 1.0F;
    } else { // x >= 1.<9.
      left = 1.0F;
      right = k;
    }
    while (left <= right) {
      float mid = left + ((right - left) / 2);
      float midSquared = mid * mid;
      if(Math.abs(k - midSquared) <= 0.0001){
        return mid;
      }
      else if (midSquared <= k) {
        left = mid ;
      } else {
        right = mid ;
      }
    }
    return - 1;
  }

  public static void main(String[] args) {
    System.out.println((searchSorted( 2)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
