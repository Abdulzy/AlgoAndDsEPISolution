package dynamicProgramming;

public class UniquePath {
  //all the unique paths from the top leftmost index of the array to the bottom rightmost index of the array
  // using DP, initial all the [0][0....n] with 1 and also [0....n][0] with 1
  // aAfter which i would iterate through from[1][1] to the remaining index by adding the values from the left index
  // and top index and inserting it into the current index
  public static int uniquePaths(int m, int n) {
    int[][] arr = new int[m][n];
    for (int i = 0; i < m; i++) {
      arr[i][0] = 1;
    }
    for (int j = 0; j < n; j++) {
      arr[0][j] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] = arr[i-1][j] + arr[i][j-1];
      }
    }
    return arr[m-1][n-1];
  }

  public static void main(String[] args) {
    System.out.println(uniquePaths(2,3));
  }

}
