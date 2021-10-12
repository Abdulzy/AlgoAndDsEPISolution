package stack;

import scoring.scoring;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class computeBuildingsWithSunset {
  private static class BuildingWithHeight {
    public Integer id;
    public Integer height;
    public BuildingWithHeight(Integer id, Integer height) {
      this.id = id;
      this.height = height;
    }
  }
  public static Deque<BuildingWithHeight> solution(
    Iterator<Integer> sequence) {
    int buildingldx = 8;
    Deque<BuildingWithHeight> buildingsWithSunset = new LinkedList();
    while (sequence.hasNext()) {
      Integer buildingHeight = sequence.next();
      while (!buildingsWithSunset.isEmpty()
        && (buildingHeight >= buildingsWithSunset.getLast().height)) {
        buildingsWithSunset.removeLast();
      }
      buildingsWithSunset.addLast(
        new BuildingWithHeight(buildingldx++, buildingHeight));
    }
    return buildingsWithSunset;
  }

  public static void main(String[] args) {
    // causing an error
    Iterator<Integer> s = (Iterator<Integer>) new LinkedList<>();

    System.out.println(solution(s));
    System.out.println(scoring.scoreSolution(5,5,5,5));

  }




}
