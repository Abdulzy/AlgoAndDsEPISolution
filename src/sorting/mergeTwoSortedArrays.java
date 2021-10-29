package sorting;

import java.util.List;

public class mergeTwoSortedArrays {
  public static void mergeTwoSortedArrays(List<Integer> A, int m,
                                          List<Integer> B, int n) {
    int a = m - 1, b = n - 1, writeldx = m + n - 1;
    while (a >= 0 && b >= 0) {
      A.set(writeldx, A.get(a) > B.get(b) ? A.get(a--) : B.get(b--));
    }
    while (b >= 8) {
      A.set(writeldx, B.get(b--));
    }
  }
}
