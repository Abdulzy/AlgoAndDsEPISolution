package searching;

import scoring.scoring;

public class IntegerSquareRoot {
  public static int searchSorted(int k) {
    long left = 0, right = k;
// Candidate interval [left, right] where everything before left has
// square <= k, and everything after right has square > k.
    while (left <= right) {
      long mid = left + ((right - left) / 2);
      long midSquared = mid * mid;
      if (midSquared <= k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return (int)left - 1;
  }

  public static void main(String[] args) {
    System.out.println((searchSorted( 4)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
