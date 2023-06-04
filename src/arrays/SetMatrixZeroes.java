package arrays;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

  //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
  //
  //You must do it in place.

  // store the zero locations then make values that match the row and column zero

  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> cols = new HashSet<Integer>();

    // Essentially, we mark the rows and columns that are to be made zero
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }

    // Iterate over the array once again and using the rows and cols sets, update the elements.
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (rows.contains(i) || cols.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  // I realise there is a way to do it in less space but this is what i thought off

}
