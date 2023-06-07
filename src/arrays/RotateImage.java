package arrays;

public class RotateImage {
  //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
  //
  //You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
  // DO NOT allocate another 2D matrix and do the rotation.

  // My idea is to solve it with a new 2D array,
  // change the values of arr[i][j] -> newArr[arr[0].length - 1 - j][arr.length - 1 - i]


  public void rotate(int[][] matrix) {
    int[][] result = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        result[j][matrix.length - 1 - i] = matrix[i][j];
      }
    }
  }

  // To do it in one place, to modify all rotational sides at once:
  public void rotate1(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < (n + 1) / 2; i ++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
        matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
        matrix[j][n - 1 - i] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }
  }
}
