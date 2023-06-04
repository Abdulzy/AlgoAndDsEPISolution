package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
  //Given an m x n matrix, return all elements of the matrix in spiral order.

  //My idea is to go through the outer layer of the matrix, then I send a new parameter of the smaller
  // array into a recursive method.

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    return Helper(matrix,result,0,matrix.length, 0 ,matrix[0].length);
  }
  List<Integer> Helper(int[][] matrix,List<Integer> result, int startX,int stopX, int startY,int stopY) {
    if(startX > stopX || startY > stopY){
      return result;
    }
    for (int i = startY; i < stopY; i++) {
      result.add(matrix[startX][i]);
    }
    for (int j = startX + 1; j < stopX; j++) {
      result.add(matrix[j][stopY - 1]);
    }
    for (int k = stopY - 2; k >= startY; k--) {
      result.add(matrix[stopX - 1][k]);
    }
    for (int l = stopX - 2; l > startY; l--) {
      result.add(matrix[l][startY]);
    }
    return Helper(matrix, result, startX + 1, stopX - 1, startY + 1, stopY - 1);
  }
  // wasn't correct , was close didn't handle the borders well

  public List<Integer> spiralOrder1(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int rows = matrix.length;
    int columns = matrix[0].length;
    int up = 0;
    int left = 0;
    int right = columns - 1;
    int down = rows - 1;

    while (result.size() < rows * columns) {
      // Traverse from left to right.
      for (int col = left; col <= right; col++) {
        result.add(matrix[up][col]);
      }
      // Traverse downwards.
      for (int row = up + 1; row <= down; row++) {
        result.add(matrix[row][right]);
      }
      // Make sure we are now on a different row.
      if (up != down) {
        // Traverse from right to left.
        for (int col = right - 1; col >= left; col--) {
          result.add(matrix[down][col]);
        }
      }
      // Make sure we are now on a different column.
      if (left != right) {
        // Traverse upwards.
        for (int row = down - 1; row > up; row--) {
          result.add(matrix[row][left]);
        }
      }
      left++;
      right--;
      up++;
      down--;
    }

    return result;
  }
}
