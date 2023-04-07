package dynamicProgramming;

public class CountingBits {
  //No idea how it works
  public static int[] CountingBits(int n) {
    int []arr=new int[n+1];

    for(int i=0;i<=n;i++)
    {
      arr[i]= countBit(i);
    }
    return arr;
  }
  public static int countBit(int x){
    int count=0;
    while(x!=0)
    {
      count++;
      x=x&(x-1);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] s = CountingBits(3);
    for (int j: s) {
      System.out.println(j);

    }
  }
}
