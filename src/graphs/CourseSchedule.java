package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {

    if (prerequisites.length == 0)
      return true; // no cycle could be formed in empty graph.

    // course -> list of next courses
    HashMap<Integer, GNode> graph = new HashMap<>();

    // build the graph first
    for (int[] relation : prerequisites) {
      // relation[1] -> relation[0]
      GNode prevCourse = this.getCreateGNode(graph, relation[1]);
      GNode nextCourse = this.getCreateGNode(graph, relation[0]);

      prevCourse.outNodes.add(relation[0]);
      nextCourse.inDegrees += 1;
    }


}
