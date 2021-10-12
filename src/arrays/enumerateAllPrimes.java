package arrays;

import scoring.scoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class enumerateAllPrimes {
  public static List<Integer> solution(int n) {
    List<Integer> primes = new ArrayList<>();
    List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
    isPrime.set(0 , false);
    isPrime.set(1 , false);
    for (int p = 2; p <= n; ++p) {
      if (isPrime.get(p)){
        primes.add(p);
        for (int j = p; j <= n; j += p) {
          isPrime.set(j, false);
        }
      }
    }
    return primes;
  }


  public static void main(String[] args) {
    int index = 2;
    System.out.println((solution(index)));
    System.out.println(scoring.scoreSolution(0,0,0,0));
  }
}
