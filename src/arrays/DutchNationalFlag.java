package arrays;

import scoring.scoring;

import java.util.Arrays;

public class DutchNationalFlag {
  public int[] solution(int pivotIndex, int[] A) {
    int pivot = A[pivotIndex];
    int[] store = new int[A.length];
    int lastIndex = 0;;
    for (int j : A) {
      if (j < pivot) {
        store[lastIndex] = j;
        lastIndex++;
      }
    }

    for (int j : A) {
      if (j == pivot) {
        store[lastIndex] = j;
        lastIndex++;
      }
    }

    for (int j : A) {
      if (j > pivot) {
        store[lastIndex] = j;
        lastIndex++;
      }
    }

    return store;
  }


  public static void main(String[] args) {
    int[] A = {0,1,1,1,2,2,2,0,0};
    int index = 2;
    var s = new DutchNationalFlag();
    System.out.println(Arrays.toString(s.solution(index, A)));
    System.out.println(scoring.scoreSolution(0,1,3,2));
  }
}
