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
}
